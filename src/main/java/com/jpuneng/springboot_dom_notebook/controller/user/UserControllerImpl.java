package com.jpuneng.springboot_dom_notebook.controller.user;

import com.jpuneng.springboot_dom_notebook.controller.BaseRestController;
import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.po.User;
import com.jpuneng.springboot_dom_notebook.service.user.UserLoginService;
import com.jpuneng.springboot_dom_notebook.service.user.UserMaintainService;
import com.jpuneng.springboot_dom_notebook.vo.UserLoginVO;
import com.jpuneng.springboot_dom_notebook.vo.UserRegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserControllerImpl extends BaseRestController implements UserController {

  private UserLoginService userLoginService;
  private UserMaintainService userMaintainService;

  @Autowired
  public UserControllerImpl(UserLoginService userLoginService, UserMaintainService userMaintainService) {
    this.userLoginService = userLoginService;
    this.userMaintainService = userMaintainService;
  }

  @Override
  @PostMapping(value = "/POST/login")
  public JsonRes login(@RequestBody UserLoginVO userLoginVO) {

    if (StringUtils.isEmpty(userLoginVO.getUser_id()) || StringUtils.isEmpty(userLoginVO.getPassword())) {
      return response(400, "user_id or password is missing.", null);
    }
    try {
      User user = userLoginService.login(userLoginVO.getUser_id(), userLoginVO.getPassword());
      return response(200, "login success.", user);

    } catch (Exception e) {
      return response(500, e.getMessage(), null);
    }
  }

  @Override
  @PostMapping(value = "/POST/register")
  public JsonRes register(@RequestBody UserRegisterVO userRegisterVO) {
    if (StringUtils.isEmpty(userRegisterVO.getEmail_addr()) && StringUtils.isEmpty(userRegisterVO.getPhone_num())) {
      return response(400, "emailAddress and phoneNum are missing.", null);
    }

    if (StringUtils.isEmpty(userRegisterVO.getPassword())) {
      return response(400, "password are missing.", null);
    }

    User user = new User();
    user.setPassWord(userRegisterVO.getPassword());
    user.setNickName(userRegisterVO.getNick_name());
    user.setEmailAddress(userRegisterVO.getEmail_addr());
    user.setPhoneNumber(userRegisterVO.getPhone_num());

    try {
      User resUser = userLoginService.register(user);
      return response(200, null, resUser);
    } catch (Exception e) {
      return response(500, e.getMessage(), null);
    }
  }
}
