package net.xdclass.online.service.impl;

import net.xdclass.online.mapper.UserMapper;
import net.xdclass.online.mapper.VideoMapper;
import net.xdclass.online.mapper.VideoOrderMapper;
import net.xdclass.online.model.entity.Video;
import net.xdclass.online.model.entity.VideoOrder;
import net.xdclass.online.service.VideoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.service.impl
 * @author: 姚泽宇
 * @date: 2022-04-27 13:46
 **/
@Service
public class VideoOrderServiceIml implements VideoOrderService {
    @Autowired
    private VideoOrderMapper videoOrderMapper;
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public int save(int userId, int videoId) {
        VideoOrder videoOrder = videoOrderMapper.findByUserIdAndVideoIdAndState(userId, videoId, 1);
        if (videoOrder != null) {
            return 0;
        }
        Video video = videoMapper.findById(videoId);
        return 0;
    }
}
