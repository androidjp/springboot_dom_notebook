package com.jpuneng.springboot_dom_notebook.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "NOTE")
public class Note implements Serializable{

  @Id
  @Field("NOTE_ID")
  private String noteId;
  @Field("TITLE")
  private String title;
  @Field("CONTENT")
  private String content;
  @Field("USER_ID")
  private String userId;
  @Field("UPDATE_DATE")
  private Date updateTime;
  @Field("CREATE_DATE")
  private Date createTime;

  public Note() {
  }

  public String getNoteId() {
    return noteId;
  }

  public void setNoteId(String noteId) {
    this.noteId = noteId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
