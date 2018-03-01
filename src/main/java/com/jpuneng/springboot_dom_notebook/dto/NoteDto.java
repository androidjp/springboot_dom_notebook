package com.jpuneng.springboot_dom_notebook.dto;

import java.io.Serializable;
import java.util.UUID;

public class NoteDto implements Serializable{

  private String id;
  private String author;
  private String title;
  private String content;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
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
}
