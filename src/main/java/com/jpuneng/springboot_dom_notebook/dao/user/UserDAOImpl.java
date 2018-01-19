package com.jpuneng.springboot_dom_notebook.dao.user;

import com.jpuneng.springboot_dom_notebook.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public User findUserByUserId(String userId) {
    Query query = new Query(Criteria.where("userId").is(userId));
    User user = mongoTemplate.findOne(query,User.class);
    return user;
  }

  @Override
  public User findUserByEmailAddress(String emailAddress) {
    Query query = new Query(Criteria.where("emailAddress").is(emailAddress));
    User user = mongoTemplate.findOne(query,User.class);
    return user;
  }

  @Override
  public User findUserByPhoneNumber(String phoneNumber) {
    Query query = new Query(Criteria.where("phoneNumber").is(phoneNumber));
    User user = mongoTemplate.findOne(query,User.class);
    return user;
  }

  @Override
  public void saveUser(User user) {
    mongoTemplate.save(user);
  }

  @Override
  public void updateUser(User user) {
    Query query = new Query(Criteria.where("userId").is(user.getUserId()));
    Update update = new Update().set("nickName", user.getNickName()).set("passWord",user.getPassWord());

    mongoTemplate.updateFirst(query, update, User.class);
    // updateMulti
  }

  @Override
  public void deleteUserByUserId(String userId) {
    Query query = new Query(Criteria.where("userId").is(userId));
    mongoTemplate.remove(query, User.class);
  }
}
