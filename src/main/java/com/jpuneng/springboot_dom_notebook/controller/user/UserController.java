package com.jpuneng.springboot_dom_notebook.controller.user;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.UserDto;
import com.jpuneng.springboot_dom_notebook.po.User;
import org.springframework.web.bind.annotation.*;


public interface UserController {
  public JsonRes login(String userId , String password);

  public JsonRes register(UserDto userDto);
}
