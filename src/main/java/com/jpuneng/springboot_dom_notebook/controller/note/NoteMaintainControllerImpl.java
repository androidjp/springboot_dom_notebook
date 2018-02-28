package com.jpuneng.springboot_dom_notebook.controller.note;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.NoteDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteMaintainControllerImpl implements NoteMaintainController {

  @Override
  @PostMapping("/POST")
  public JsonRes updateNote(@RequestBody NoteDto noteDto) {
    return null;
  }

  @Override
  public JsonRes deleteNote(String noteId) {
    return null;
  }

  @Override
  public JsonRes likeNote(String noteId, String userId) {
    return null;
  }
}
