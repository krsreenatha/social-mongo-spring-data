package org.simple.farm.dao;

import org.bson.types.ObjectId;
import org.simple.farm.model.UserModel;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ilya40umov
 */
public interface UserDao extends CrudRepository<UserModel, ObjectId> {
}
