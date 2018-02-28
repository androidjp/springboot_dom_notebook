package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dto.NoteDto;

public interface NoteMaintainService {
    boolean updateNote(NoteDto noteDto) throws Exception;
}
