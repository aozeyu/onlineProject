package net.xdclass.online.mapper;

import net.xdclass.online.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @program: online
 * @description: 登陆注册
 * @packagename: net.xdclass.online.mapper
 * @author: 姚泽宇
 * @date: 2022-04-26 17:01
 **/
public interface UserMapper {
    User findByPhone(@Param("phone") String phone);
    int save(User user);
}
