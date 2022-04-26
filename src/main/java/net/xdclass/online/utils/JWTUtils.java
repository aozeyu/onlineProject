package net.xdclass.online.utils;

import net.xdclass.online.domain.User;

/**
 * @program: online
 * @description: Jwt工具类
 * @packagename: net.xdclass.online.utils
 * @author: 姚泽宇
 * @date: 2022-04-26 22:17
 **/
public class JWTUtils {
    static final long EXPIRE = 60000 * 60 * 24 * 7;
/*密钥*/
    private static final String SECRET = "xdclass.net168";
    private static String geneJsonWebToken(User user) {
        return "";
    }
}
