package com.jpuneng.springboot_dom_notebook.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "USER")
public class User implements Serializable{

  @Id
  @Field("USER_ID")
  private String userId;
  @Field("NICK_NAME")
  private String nickName;
  @Field("PASSWORD")
  private String passWord;
  @Field("CREATE_TIME")
  private Date createTime;
  @Field("UPDATE_TIME")
  private Date updateTime;
  @Field("EMAIL_ADDRESS")
  private String emailAddress;
  @Field("PHONE_NUMBER")
  private String phoneNumber;

  public User() {
  }

  @Override
  public String toString() {
    return "User{" +
        "userId='" + userId + '\'' +
        ", nickName='" + nickName + '\'' +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", emailAddress='" + emailAddress + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
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

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
