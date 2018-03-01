package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dao.note.NoteDao;
import com.jpuneng.springboot_dom_notebook.po.Note;
import com.jpuneng.springboot_dom_notebook.vo.NoteItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteReadServiceImpl implements NoteReadService {

  @Autowired
  NoteDao noteDao;

  @Override
  public List<NoteItemVO> getNoteList(int page) throws Exception {
    List<Note> noteList = noteDao.getNoteList(page);
    List<NoteItemVO> noteItemVOList = new ArrayList<>();
    for (Note note : noteList) {
      NoteItemVO noteItemVO = new NoteItemVO();
      noteItemVO.setAuthorId(note.getUserId());
      noteItemVO.setNoteId(note.getNoteId());
      noteItemVO.setTitle(note.getTitle());
      noteItemVO.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(note.getUpdateTime()));
      noteItemVOList.add(noteItemVO);
    }
    return noteItemVOList;
  }
}
