package net.xdclass.online.service.impl;

import net.xdclass.online.domain.Video;
import net.xdclass.online.domain.VideoBanner;
import net.xdclass.online.mapper.VideoMapper;
import net.xdclass.online.service.VideoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.service.iml
 * @author: 姚泽宇
 * @date: 2022-04-26 12:48
 **/
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }

    @Override
    public List<VideoBanner> listVideoBanner() {
        return videoMapper.listVideoBanner();
    }

    @Override
    public Video findDetailById(@Param("video_id") int videoId) {
        return videoMapper.findDetailById(videoId);
    }


}
