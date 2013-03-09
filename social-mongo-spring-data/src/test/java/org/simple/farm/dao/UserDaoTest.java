package org.simple.farm.dao;

import org.simple.farm.builder.UserFarmBuilder;
import org.simple.farm.builder.UserModelBuilder;
import org.simple.farm.config.SimpleFarmConfiguration;
import org.simple.farm.model.UserModel;
import org.simple.farm.model.embedded.Achievement;
import org.simple.farm.model.embedded.Building;
import org.simple.farm.model.embedded.UserFarm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * @author ilya40umov
 */
@Test
@ContextConfiguration(classes = SimpleFarmConfiguration.class)
public class UserDaoTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserDao userDao;

    public void testSaveAndFind() {

        //purge a collection of old data
        userDao.deleteAll();

        final String username = "testUserName";
        UserFarm userFarm = UserFarmBuilder.createFarmBuilder("Test Farm", 15, 15).
                setResources(90, 130, 150).addCropsBuilding(1, 0, 0, new Date()).
                addSimpleBuilding(Building.BuildingType.SCARE_CROW, 1, 1, 1).build();
        userDao.save(UserModelBuilder.createUserBuilder(username, "a password", new Date())
                .setFarm(userFarm).setExperience(0).addAchievement(Achievement.AchievementType.BUILDER, 1)
                .build());

        UserModel user = userDao.findByLogin(username);
        assertNotNull(user);
        assertNotNull(user.getFarm());
        assertEquals(user.getFarm().getFood(), 90);
    }
}
