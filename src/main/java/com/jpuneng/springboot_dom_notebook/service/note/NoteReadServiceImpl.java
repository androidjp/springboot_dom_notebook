package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dto.NoteDto;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class NoteReadServiceImpl implements NoteReadService {

  @Override
  public List<NoteDto> getNoteList(int page, String userId) throws Exception{
    if (StringUtils.isEmpty(userId)){
        //TODO: according to user's interest to filter the note
    }

    return null;
  }
}
