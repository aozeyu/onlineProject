package net.xdclass.online.service.impl;

import net.xdclass.online.domain.User;
import net.xdclass.online.mapper.UserMapper;
import net.xdclass.online.service.UserService;
import net.xdclass.online.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * @program: online
 * @description: 用户实现类
 * @packagename: net.xdclass.online.service.impl
 * @author: 姚泽宇
 * @date: 2022-04-26 17:26
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(Map<String, String> userInfo) {
        User user = parseToUser(userInfo);
        if (user != null) {
            return userMapper.save(user);
        } else {
            return -1;
        }
    }

    private User parseToUser(Map<String, String> userInfo) {
        if (userInfo.containsKey("phone") && userInfo.containsKey("pwd") && userInfo.containsKey("name")) {
            User user = new User();
            user.setName(userInfo.get("name"));
            user.setHeadImg("");
            user.setCreateTime(new Date());
            user.setPhone(userInfo.get("phone"));
            String pwd = userInfo.get("pwd");
            //MD5加密处理
            user.setPwd(CommonUtils.MD5(pwd));
            return user;
        } else {
            return null;
        }
    }
}
