package net.xdclass.online.exception;

/**
 * @program: online
 * @description: 自定义异常
 * @packagename: net.xdclass.online.exception
 * @author: 姚泽宇
 * @date: 2022-04-26 16:35
 **/
public class XDException extends RuntimeException{
    private Integer code;
    private String msg;
    public XDException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
