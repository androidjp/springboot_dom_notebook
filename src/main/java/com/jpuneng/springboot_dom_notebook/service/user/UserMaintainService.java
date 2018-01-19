package com.jpuneng.springboot_dom_notebook.service.user;

public interface UserMaintainService {

  public boolean updateNickName(String userId, String nickName) throws Exception;
  public boolean updatePassword(String userId, String password) throws Exception;
}
