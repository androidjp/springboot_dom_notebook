package com.jpuneng.springboot_dom_notebook.vo;

import java.io.Serializable;

public class UserRegisterVO implements Serializable {

  private String nick_name;
  private String password;
  private String email_addr;
  private String phone_num;

  public String getNick_name() {
    return nick_name;
  }

  public void setNick_name(String nick_name) {
    this.nick_name = nick_name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail_addr() {
    return email_addr;
  }

  public void setEmail_addr(String email_addr) {
    this.email_addr = email_addr;
  }

  public String getPhone_num() {
    return phone_num;
  }

  public void setPhone_num(String phone_num) {
    this.phone_num = phone_num;
  }
}
