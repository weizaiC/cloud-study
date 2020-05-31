package com.cxw.util;


import cn.hutool.json.JSONObject;

public class JsonResult {
    private int code;
    private String msg;

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static JSONObject toJSONObject(int code, String msg){
        JSONObject object = new JSONObject();
        return object.put(String.valueOf(code),msg);
    }
}
