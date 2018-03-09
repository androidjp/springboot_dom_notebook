package com.jpuneng.springboot_dom_notebook.controller.note;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.service.note.NoteReadService;
import com.jpuneng.springboot_dom_notebook.vo.NoteItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/note/GET")
public class NoteReadControllerImpl implements NoteReadController {

  private NoteReadService noteReadService;

  @Value("${configurations.env}")
  private String env;

  @Autowired
  public NoteReadControllerImpl(NoteReadService noteReadService) {
    this.noteReadService = noteReadService;
  }

  @Override
  @GetMapping(value = "/list/{page}")
  public JsonRes getNoteList(@PathVariable("page") int page, @RequestParam(value = "user_id", required = false, defaultValue = "") String userId) {
    JsonRes jsonRes = new JsonRes();
    System.out.println("page: " + page);
    System.out.println("config.env: " + env);
    try {
      List<NoteItemVO> noteItemVOS = noteReadService.getNoteList(page);
      jsonRes.setCode(200);
      jsonRes.setData(noteItemVOS);
    } catch (Exception e) {
      jsonRes.setCode(500);
      jsonRes.setData(e);
    } finally {
      return jsonRes;
    }
  }

  @Override
  public JsonRes getNoteDetail(String noteId) {
    return null;
  }

  @Override
  public JsonRes getUserNoteList(int page, String userId) {
    return null;
  }
}
