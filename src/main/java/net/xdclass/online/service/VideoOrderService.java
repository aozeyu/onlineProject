package net.xdclass.online.service;

import net.xdclass.online.model.entity.VideoOrder;

import java.util.List;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.service
 * @author: 姚泽宇
 * @date: 2022-04-27 13:44
 **/
public interface VideoOrderService {
    int save(int userId,int videoId);

    List<VideoOrder> listOrderByUserId(Integer userId);
}
