package com.jpuneng.springboot_dom_notebook.controller.note;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.NoteDto;
import com.jpuneng.springboot_dom_notebook.service.note.NoteMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteMaintainControllerImpl implements NoteMaintainController {

    private NoteMaintainService noteMaintainService;

    @Autowired
    public NoteMaintainControllerImpl(NoteMaintainService noteMaintainService) {
        this.noteMaintainService = noteMaintainService;
    }

    @Override
    @PostMapping("/POST")
    public JsonRes updateNote(@RequestBody NoteDto noteDto) {
        JsonRes jsonRes = new JsonRes();
        try {
            this.noteMaintainService.updateNote(noteDto);
            jsonRes.setCode(200);
            jsonRes.setMessage("success");
        } catch (Exception e) {
            jsonRes.setCode(500);
            jsonRes.setData(e);
        } finally {
            return jsonRes;
        }
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
