package com.jpuneng.springboot_dom_notebook.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

  private String user_id;
  private String psd;

  private String nickName;
  private String emailAddress;
  private String phoneNumber;

  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getPsd() {
    return psd;
  }

  public void setPsd(String psd) {
    this.psd = psd;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
