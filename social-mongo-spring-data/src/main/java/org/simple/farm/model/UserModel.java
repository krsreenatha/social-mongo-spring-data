package org.simple.farm.model;

import org.bson.types.ObjectId;
import org.simple.farm.model.embedded.Achievement;
import org.simple.farm.model.embedded.UserFarm;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * @author ilya40umov
 */
@Document
public class UserModel {

    private ObjectId id;
    private String login;
    private String password;
    private Date registered;
    private Date lastVisit;
    private List<Achievement> achievements;
    private long experience;
    private UserFarm farm;

    public UserModel() {
    }

    public UserModel(String login, String password, Date registered, Date lastVisit,
                     List<Achievement> achievements, long experience, UserFarm farm) {
        this.login = login;
        this.password = password;
        this.registered = registered;
        this.lastVisit = lastVisit;
        this.achievements = achievements;
        this.experience = experience;
        this.farm = farm;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public UserFarm getFarm() {
        return farm;
    }

    public void setFarm(UserFarm farm) {
        this.farm = farm;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registered=" + registered +
                ", lastVisit=" + lastVisit +
                ", achievements=" + achievements +
                ", experience=" + experience +
                ", farm=" + farm +
                '}';
    }
}
