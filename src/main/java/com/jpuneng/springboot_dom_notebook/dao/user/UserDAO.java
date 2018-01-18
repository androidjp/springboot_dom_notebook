package com.jpuneng.springboot_dom_notebook.dao.user;

import com.jpuneng.springboot_dom_notebook.po.User;

public interface UserDAO {

  public User findUserByUserId(String userId);

  public User register(User user);

  public User login(String userId, String password);


}
