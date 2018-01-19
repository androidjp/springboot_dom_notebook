package com.jpuneng.springboot_dom_notebook.service.user;

import com.jpuneng.springboot_dom_notebook.dao.user.UserDAO;
import com.jpuneng.springboot_dom_notebook.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserLoginServiceImpl implements UserLoginService {

  @Autowired
  private UserDAO userDAO;

  @Override
  public User login(String userId, String password) throws Exception {
    User user = userDAO.findUserByEmailAddress(userId);
    if (user == null) {
      user = userDAO.findUserByPhoneNumber(userId);
    }
    if (user == null) {
      throw new RuntimeException("User is not found.");
    }

    if (!user.getPassWord().equals(password)) {
      throw new RuntimeException("Password is wrong.");
    }
    return user;
  }

  @Override
  public User register(User user) throws Exception {
    user.setUserId(UUID.randomUUID().toString());
    StringBuilder errMsg = new StringBuilder(64);
    errMsg.append("Register Failed: ");
    boolean flag = false;
    if (userDAO.findUserByEmailAddress(user.getEmailAddress()) != null) {
      errMsg.append("Email has been used.");
      flag = true;
    }
    if (userDAO.findUserByPhoneNumber(user.getPhoneNumber()) != null) {
      errMsg.append("PhoneNumber has been used.");
      flag = true;
    }
    if (flag) {
      throw new RuntimeException(errMsg.toString());
    }
    userDAO.saveUser(user);
    return user;
  }
}
