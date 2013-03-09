package org.simple.farm.builder;

import org.simple.farm.model.UserModel;
import org.simple.farm.model.embedded.Achievement;
import org.simple.farm.model.embedded.UserFarm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ilya40umov
 */
public class UserModelBuilder {

    private final String login;
    private final String password;
    private final Date registered;
    private Date lastVisit;
    private List<Achievement> achievements;
    private long experience;
    private UserFarm farm;

    private UserModelBuilder(String login, String password, Date registered) {
        this.login = login;
        this.password = password;
        this.registered = registered;
        this.achievements = new ArrayList<Achievement>();
    }

    public static UserModelBuilder createUserBuilder(String login, String password, Date registered) {
        return new UserModelBuilder(login, password, registered);
    }

    public UserModelBuilder setExperience(long experience) {
        this.experience = experience;
        return this;
    }

    public UserModelBuilder addAchievement(Achievement.AchievementType type, int level) {
        this.achievements.add(new Achievement(type, level));
        return this;
    }

    public UserModelBuilder setFarm(UserFarm userFarm) {
        this.farm = userFarm;
        return this;
    }

    public UserModel build() {
        return new UserModel(login, password, registered, null, achievements, experience, farm);
    }

}
