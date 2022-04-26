package net.xdclass.online.utils;

import java.security.MessageDigest;

/**
 * @program: online
 * @description: mD5
 * @packagename: net.xdclass.online.utils
 * @author: 姚泽宇
 * @date: 2022-04-26 17:46
 **/
public class CommonUtils {
    public static String MD5(String data) {
        try {
            java.security.MessageDigest md =
                    MessageDigest.getInstance("MD5");
            byte[] array = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte item : array) {
                sb.append(Integer.toHexString((item & 0xFF) |
                        0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        } catch (Exception exception) {
        }
        return null;
    }
}
