package com.jpuneng.springboot_dom_notebook.dao.note;

import com.jpuneng.springboot_dom_notebook.po.Note;


public interface NoteDao {
    boolean saveNote(Note note) throws Exception;
}
