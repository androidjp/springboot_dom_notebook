package com.jpuneng.springboot_dom_notebook.dao.note;

import com.jpuneng.springboot_dom_notebook.po.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

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

  private static final int PER_PAGE_COUNT = 5;

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public boolean saveNote(Note note) throws Exception {
    try {
      mongoTemplate.save(note);
      return true;
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public List<Note> getNoteList(int page) throws Exception {
    Query query = new Query();
    query.skip(page * PER_PAGE_COUNT);
    query.limit(PER_PAGE_COUNT);
    query.with(new Sort(new Sort.Order(Sort.Direction.DESC, "UPDATE_DATE")));
    return mongoTemplate.find(query, Note.class);
  }
}
