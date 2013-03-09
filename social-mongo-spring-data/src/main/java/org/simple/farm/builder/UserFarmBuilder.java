package org.simple.farm.builder;

import org.simple.farm.model.embedded.Building;
import org.simple.farm.model.embedded.CropsBuilding;
import org.simple.farm.model.embedded.Location;
import org.simple.farm.model.embedded.UserFarm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ilya40umov
 */
public class UserFarmBuilder {

    private final String name;
    private final Location location;
    private int level;
    private int food;
    private int stone;
    private int wood;
    private List<Building> buildings;

    private UserFarmBuilder(String name, Location location) {
        super();
        buildings = new ArrayList<Building>();
        this.name = name;
        this.location = location;
        this.level = 1;
    }

    public static UserFarmBuilder createFarmBuilder(String farmName, int x, int y) {
        return new UserFarmBuilder(farmName, new Location(x, y));
    }

    public UserFarmBuilder setResources(int food, int stone, int wood) {
        this.food = food;
        this.stone = stone;
        this.wood = wood;
        return this;
    }

    public UserFarmBuilder addBuilding(Building building) {
        buildings.add(building);
        return this;
    }

    public UserFarmBuilder addSimpleBuilding(Building.BuildingType type, int level, int inFarmX, int inFarmY) {
        if (Building.BuildingType.CROPS.equals(type)) {
            throw new IllegalArgumentException("CropsBuilding is not a simple building!");
        }
        buildings.add(new Building(new Location(inFarmX, inFarmY), level, type));
        return this;
    }

    public UserFarmBuilder addCropsBuilding(int level, int inFarmX, int inFarmY, Date lastHarvest) {
        buildings.add(new CropsBuilding(new Location(inFarmX, inFarmY), level, lastHarvest));
        return this;
    }

    public UserFarm build() {
        UserFarm userFarm = new UserFarm();
        userFarm.setName(name);
        userFarm.setLocation(location);
        userFarm.setLevel(level);
        userFarm.setFood(food);
        userFarm.setStone(stone);
        userFarm.setWood(wood);
        userFarm.setBuildings(buildings);
        return userFarm;
    }

}
