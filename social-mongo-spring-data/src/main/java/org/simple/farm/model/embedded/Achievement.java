package org.simple.farm.model.embedded;

/**
 * @author ilya40umov
 */
public class Achievement {

    private AchievementType type;
    private int level;

    public Achievement() {
    }

    public Achievement(AchievementType type, int level) {
        this.type = type;
        this.level = level;
    }

    public AchievementType getType() {
        return type;
    }

    public void setType(AchievementType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "type=" + type +
                ", level=" + level +
                '}';
    }

    public static enum AchievementType {
        BUILDER, RESEARCHER, STRATEGIST
    }
}
