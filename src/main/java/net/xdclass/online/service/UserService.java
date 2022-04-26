package net.xdclass.online.service;

import java.util.Map;

/**
 * @program: online
 * @description: 用户登陆服务层
 * @packagename: net.xdclass.online.service
 * @author: 姚泽宇
 * @date: 2022-04-26 17:20
 **/
public interface UserService {

    int save(Map<String,String> userInfo);

    String findByPhoneAndPwd(String phone, String pwd);
}
