package org.simple.farm.model.embedded;

/**
 * @author ilya40umov
 */
public class Building {

    private Location location;
    private int level;
    private BuildingType type;

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

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "location=" + location +
                ", level=" + level +
                ", type=" + type +
                '}';
    }

    public static enum BuildingType {
        WATER_TANK, CROPS, HOUSE, SCARE_CROW
    }

}
