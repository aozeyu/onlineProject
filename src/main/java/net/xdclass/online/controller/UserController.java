package net.xdclass.online.controller;

import net.xdclass.online.utils.JsonData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: online
 * @description: 登陆注册
 * @packagename: net.xdclass.online.controller
 * @author: 姚泽宇
 * @date: 2022-04-26 16:53
 **/
@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {
    @PostMapping("register")
    public JsonData register(@RequestBody Map<String,String> userInfo) {

    }
}
