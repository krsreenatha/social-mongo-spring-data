package org.simple.farm.model.embedded;

/**
 * @author ilya40umov
 */
public class Building {

    private Location inFarmLocation;
    private int level;
    private BuildingType type;

    public Building() {
    }

    public Building(Location inFarmLocation, int level, BuildingType type) {
        this.inFarmLocation = inFarmLocation;
        this.level = level;
        this.type = type;
    }

    public Location getInFarmLocation() {
        return inFarmLocation;
    }

    public void setInFarmLocation(Location inFarmLocation) {
        this.inFarmLocation = inFarmLocation;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "inFarmLocation=" + inFarmLocation +
                ", level=" + level +
                ", type=" + type +
                '}';
    }

    public static enum BuildingType {
        WATER_TANK, CROPS, HOUSE, SCARE_CROW
    }

}
