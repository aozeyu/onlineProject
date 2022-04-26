package net.xdclass.online.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import net.xdclass.online.model.entity.User;

import java.util.Date;

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
    private static final String TOKEN_PREFIX = "xdclass";
    private static final String SUBJECT = "xdclass";

    private static String geneJsonWebToken(User user) {
        String token = Jwts.builder().setSubject(SUBJECT).claim("head_img", user.getHeadImg()).claim("id", user.getId()).claim("name", user.getName()).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + EXPIRE)).signWith(SignatureAlgorithm.HS256, SECRET).compact();
        token = TOKEN_PREFIX + token;
        return token;
    }

    public static Claims checkJWT(String token) {
        try {
            final Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody();
            return claims;
        } catch (Exception e) {
            return null;
        }
    }
}
