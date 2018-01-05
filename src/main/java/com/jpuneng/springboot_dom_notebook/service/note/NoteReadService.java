package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dto.NoteDto;

import java.util.List;

public interface NoteReadService {

  List<NoteDto> getNoteList(int page, String userId) throws Exception;
}
