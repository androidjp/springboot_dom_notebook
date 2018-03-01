package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dto.NoteDto;
import com.jpuneng.springboot_dom_notebook.vo.NoteItemVO;

import java.util.List;

public interface NoteReadService {

  List<NoteItemVO> getNoteList(int page) throws Exception;
}
