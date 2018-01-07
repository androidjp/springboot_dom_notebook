package com.jpuneng.springboot_dom_notebook.service.note;

import com.jpuneng.springboot_dom_notebook.dto.NoteDto;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NoteReadServiceImpl implements NoteReadService {

    @Override
    public List<NoteDto> getNoteList(int page, String userId) throws Exception {
        List<NoteDto> resList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            NoteDto item = new NoteDto();
            item.setId(UUID.randomUUID().toString());
            item.setTitle("Title" + i);
            item.setContent("Content" + i);
            item.setAuthor("Author" + i);

            resList.add(item);
        }
        return resList;
    }
}
