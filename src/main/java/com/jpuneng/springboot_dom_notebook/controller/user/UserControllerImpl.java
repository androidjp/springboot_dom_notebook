package com.jpuneng.springboot_dom_notebook.controller.user;

import com.jpuneng.springboot_dom_notebook.controller.user.UserController;
import com.jpuneng.springboot_dom_notebook.dto.JsonRes;
import com.jpuneng.springboot_dom_notebook.dto.UserDto;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserControllerImpl implements UserController {
    private final static String USER_ID = "test";
    private final static String PSD = "test";

    @Override
    @GetMapping(value = "/login")
    public JsonRes login(@RequestParam("user_id") String userId, @RequestParam("psd") String password) {
        JsonRes jsonRes = new JsonRes();
        if (USER_ID.equals(userId) && PSD.equals(password)) {
            jsonRes.setCode(200);
            jsonRes.setMessage("OK");
            jsonRes.setData(null);
        } else {
            jsonRes.setCode(400);
            jsonRes.setMessage("Missing userName or wrong password!");
        }
        return jsonRes;
    }

    @Override
    @PostMapping(value = "/register")
    public JsonRes register(@RequestBody UserDto userDto) {
        JsonRes jsonRes = new JsonRes();
        if (StringUtils.isEmpty(userDto) || StringUtils.isEmpty(userDto.getUser_id()) || StringUtils.isEmpty(userDto.getPsd())) {
            jsonRes.setCode(400);
            jsonRes.setMessage("error input body");
        } else {
            jsonRes.setCode(200);
            jsonRes.setMessage("success register userDto");
            jsonRes.setData(userDto);
        }
        return jsonRes;
    }
}
