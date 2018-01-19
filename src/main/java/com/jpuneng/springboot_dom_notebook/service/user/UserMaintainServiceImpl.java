package com.jpuneng.springboot_dom_notebook.service.user;

import com.jpuneng.springboot_dom_notebook.dao.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMaintainServiceImpl implements UserMaintainService {

  @Autowired
  private UserDAO userDAO;

  @Override
  public boolean updateNickName(String userId, String nickName) throws Exception {
    return false;
  }

  @Override
  public boolean updatePassword(String userId, String password) throws Exception {
    return false;
  }
}
