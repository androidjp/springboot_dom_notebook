package com.jpuneng.springboot_dom_notebook.dao.user;

import com.jpuneng.springboot_dom_notebook.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {

  @Autowired
  private UserDAO userDAO;

  @Test
  public void findUserByUserId() throws Exception {
    User user = userDAO.findUserByUserId("user01");
    System.out.println(user.toString());
  }

  @Test
  public void saveUser() throws Exception {
    User user = new User();

    user.setUserId("user01");
    user.setNickName("小明");
    user.setPassWord("123");

    userDAO.saveUser(user);
  }

  @Test
  public void updateUser() throws Exception {
    User user = new User();

    user.setUserId("user01");
    user.setNickName("笑话");
    user.setPassWord("123");

    userDAO.updateUser(user);
  }

  @Test
  public void deleteUserByUserId() throws Exception {
    userDAO.deleteUserByUserId("user01");
  }

}