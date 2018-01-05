package com.jpuneng.springboot_dom_notebook.controller.note;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.UserDto;

public interface NoteReadController {

  public JsonRes getNoteList(int page , String userId);

  public JsonRes getNoteDetail(String noteId);

  public JsonRes getUserNoteList(int page , String userId);
}
