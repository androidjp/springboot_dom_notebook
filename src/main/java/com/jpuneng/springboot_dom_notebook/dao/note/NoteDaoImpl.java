package com.jpuneng.springboot_dom_notebook.dao.note;

import com.jpuneng.springboot_dom_notebook.po.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: androidjp
 * Date: 2018/2/28
 * Time: 下午10:58
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class NoteDaoImpl implements NoteDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public boolean saveNote(Note note) throws Exception {
        try {
            mongoTemplate.save(note);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
