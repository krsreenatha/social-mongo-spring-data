package org.simple.farm.model.embedded;

import java.util.List;

/**
 * @author ilya40umov
 */
public class UserFarm {

    private String name;
    private Location location;
    private int level;
    private int food;
    private int stone;
    private int wood;
    private List<Building> buildings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    @Override
    public String toString() {
        return "UserFarm{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", level=" + level +
                ", food=" + food +
                ", stone=" + stone +
                ", wood=" + wood +
                ", buildings=" + buildings +
                '}';
    }
}
