package com.jpuneng.springboot_dom_notebook.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

  private String user_id;
  private String psd;

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
}
