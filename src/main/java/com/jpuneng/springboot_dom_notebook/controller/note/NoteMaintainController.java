package com.jpuneng.springboot_dom_notebook.controller.note;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.NoteDto;

public interface NoteMaintainController {

  public JsonRes updateNote(NoteDto noteDto);

  public JsonRes deleteNote(String noteId);

  public JsonRes likeNote(String noteId, String userId);

}
