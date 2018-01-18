package com.jpuneng.springboot_dom_notebook.dao.user;

import com.jpuneng.springboot_dom_notebook.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class UserDAOImpl implements UserDAO{

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public User findUserByUserId(String userId) {

    return null;
  }

  @Override
  public User register(User user) {
    return null;
  }

  @Override
  public User login(String userId, String password) {
    return null;
  }
}
