package net.xdclass.online.utils;

/**
 * @program: online
 * @description: 包装类
 * @packagename: net.xdclass.online.utils
 * @author: 姚泽宇
 * @date: 2022-04-26 13:25
 **/
public class JsonData {
//    状态码
    private Integer code;
    private Object data;
    private String msg;

    public JsonData() {
    }

    public JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public static JsonData buildSuccess() {
        return new JsonData(0,null,null);
    }
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0,data,null);
    }

    public static JsonData buildError(String msg) {
        return new JsonData(-1,null,msg);
    }

    public static JsonData buildError(Integer code,String msg) {
        return new JsonData(code,null,msg);
    }
    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
