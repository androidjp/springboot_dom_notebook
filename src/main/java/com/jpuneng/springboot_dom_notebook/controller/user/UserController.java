package com.jpuneng.springboot_dom_notebook.controller.user;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.UserDto;
import com.jpuneng.springboot_dom_notebook.po.User;
import com.jpuneng.springboot_dom_notebook.vo.UserLoginVO;
import com.jpuneng.springboot_dom_notebook.vo.UserRegisterVO;
import org.springframework.web.bind.annotation.*;


public interface UserController {
    public JsonRes login(UserLoginVO userLoginVO);

    public JsonRes register(UserRegisterVO userRegisterVO);
}
