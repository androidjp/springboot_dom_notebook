package com.jpuneng.springboot_dom_notebook.service.user;

import com.jpuneng.springboot_dom_notebook.po.User;

public interface UserLoginService {
  public User login(String userId, String password) throws Exception;

  public User register(User user) throws Exception;
}
