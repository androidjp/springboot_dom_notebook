package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dao.note.NoteDao;
import com.jpuneng.springboot_dom_notebook.dto.NoteDto;
import com.jpuneng.springboot_dom_notebook.po.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: androidjp
 * Date: 2018/2/28
 * Time: 下午10:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class NoteMaintainServiceImpl implements NoteMaintainService {
    @Autowired
    NoteDao noteDao;

    @Override
    public boolean updateNote(NoteDto noteDto) throws Exception {
        Note note = new Note();
        note.setContent(noteDto.getContent());
        note.setUserId(noteDto.getAuthor());
        note.setTitle(noteDto.getTitle());
        note.setCreateTime(new Date());
        note.setUpdateTime(note.getCreateTime());
        note.setNoteId(UUID.randomUUID().toString());
        noteDao.saveNote(note);
        return true;
    }
}
