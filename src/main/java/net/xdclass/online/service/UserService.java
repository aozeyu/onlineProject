package net.xdclass.online.service;

import net.xdclass.online.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @program: online
 * @description: 用户
 * @packagename: net.xdclass.online.service
 * @author: 姚泽宇
 * @date: 2022-04-26 17:20
 **/
public interface UserService {

    int save(Map<String,String> userInfo);
}
