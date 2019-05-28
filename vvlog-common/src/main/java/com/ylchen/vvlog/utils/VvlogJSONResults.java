package com.ylchen.vvlog.utils;

import lombok.Getter;
import lombok.Setter;

public class VvlogJSONResults {

    //响应业务状态
    @Getter @Setter
    private Integer status;

    //响应消息
    @Getter @Setter
    private String msg;

    //响应中的数据
    @Getter @Setter
    private Object data;

    @Getter @Setter
    private String ok;

    public VvlogJSONResults(){

    }

    public VvlogJSONResults(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public VvlogJSONResults(Object data){
        this.status = 200;
        this.data = data;
        this.msg = "ok";
    }

    public static VvlogJSONResults build(Integer status, String msg, Object data) {
        return new VvlogJSONResults(status, msg, data);
    }

    public static VvlogJSONResults ok(Object data){
        return new VvlogJSONResults(data);
    }

    public static VvlogJSONResults ok(){
        return new VvlogJSONResults(null);
    }

    public static VvlogJSONResults errorMsg(String msg){
        return new VvlogJSONResults(500,msg,null);
    }

    public static VvlogJSONResults errorMap(Object data) {
        return new VvlogJSONResults(501, "error", data);
    }

    public static VvlogJSONResults errorTokenMsg(String msg){
        return new VvlogJSONResults(502, msg, null);
    }

    public static VvlogJSONResults errorException(String msg) {
        return new VvlogJSONResults(555, msg, null);
    }

    public Boolean isOK() {
        return this.status == 200;
    }
}
