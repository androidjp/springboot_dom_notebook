package com.jpuneng.springboot_dom_notebook.dao.user;

import com.jpuneng.springboot_dom_notebook.po.User;

public interface UserDAO {

  public User findUserByUserId(String userId);

  public User findUserByEmailAddress(String emailAddress);

  public User findUserByPhoneNumber(String phoneNumber);

  public void saveUser(User user);

  public void updateUser(User user);

  public void deleteUserByUserId(String userId);
}
