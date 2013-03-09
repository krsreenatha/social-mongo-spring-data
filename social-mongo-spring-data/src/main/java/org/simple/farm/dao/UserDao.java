package org.simple.farm.dao;

import org.bson.types.ObjectId;
import org.simple.farm.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ilya40umov
 */
@Repository
public interface UserDao extends CrudRepository<UserModel, ObjectId> {

    public UserModel findByLogin(String login);
}
