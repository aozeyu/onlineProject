package net.xdclass.online.model.request;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.model.request
 * @author: 姚泽宇
 * @date: 2022-04-26 22:46
 **/
public class LoginRequest {
    private String phone;
    private String pwd;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
