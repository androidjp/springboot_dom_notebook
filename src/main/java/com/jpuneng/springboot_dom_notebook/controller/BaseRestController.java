package com.jpuneng.springboot_dom_notebook.controller;

import com.jpuneng.springboot_dom_notebook.dto.JsonRes;

public abstract class BaseRestController {

  public JsonRes response(int code ,String message ,Object data){
    JsonRes jsonRes = new JsonRes();
    jsonRes.setCode(code);
    jsonRes.setMessage(message);
    jsonRes.setData(data);
    return jsonRes;
  }
}
