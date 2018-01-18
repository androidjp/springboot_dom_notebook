package com.jpuneng.springboot_dom_notebook.po;

import java.io.Serializable;

public class User implements Serializable{

  private String userId;
  private String nickName;
  private String passWord;

  public User() {
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
}
