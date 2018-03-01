package com.jpuneng.springboot_dom_notebook.dao.note;

import com.jpuneng.springboot_dom_notebook.po.Note;

import java.util.List;

public interface NoteDao {
    boolean saveNote(Note note) throws Exception;
    List<Note> getNoteList(int page) throws Exception;
}
