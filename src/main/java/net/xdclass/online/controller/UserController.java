package net.xdclass.online.controller;

import net.xdclass.online.model.entity.User;
import net.xdclass.online.model.request.LoginRequest;
import net.xdclass.online.service.UserService;
import net.xdclass.online.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    private UserService userService;

    @PostMapping("register")
    @CrossOrigin
    public JsonData register(@RequestBody Map<String, String> userInfo) {
        int rows = userService.save(userInfo);
        return rows == 1 ? JsonData.buildSuccess() : JsonData.buildError("注册失败，请重试");
    }

    @PostMapping("login")
    @CrossOrigin
    public JsonData login(@RequestBody LoginRequest loginRequest) {
        String token = userService.findByPhoneAndPwd(loginRequest.getPhone(), loginRequest.getPwd());
        return token == null ? JsonData.buildError("登陆失败,账号密码错误") : JsonData.buildSuccess(token);
    }

    @GetMapping("find_by_token")
    @CrossOrigin
    public JsonData findUserInfoByToken(HttpServletRequest request) {
        Integer userId = (Integer) request.getAttribute("user_id");
        if (userId == null) {
            return JsonData.buildError("查询失败");
        }
        User user = userService.findByUserId(userId);
        return JsonData.buildSuccess(user);
    }
}
