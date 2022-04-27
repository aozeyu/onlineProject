package net.xdclass.online.service.impl;

import net.xdclass.online.config.CacheKeyManager;
import net.xdclass.online.model.entity.Video;
import net.xdclass.online.model.entity.VideoBanner;
import net.xdclass.online.mapper.VideoMapper;
import net.xdclass.online.service.VideoService;
import net.xdclass.online.utils.BaseCache;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

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
    @Autowired
    private BaseCache baseCache;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }

    @Override
    public List<VideoBanner> listVideoBanner() throws ExecutionException {
        Object cacheObj = baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_BANNER_KEY, () -> {
            System.out.println("从数据库里找数据");
            return videoMapper.listVideoBanner();
        });
        if (cacheObj instanceof List) {
            List<VideoBanner> bannerList = (List<VideoBanner>) cacheObj;
            return bannerList;
        }
        return null;
    }

    @Override
    public Video findDetailById(@Param("video_id") int videoId) {
        return videoMapper.findDetailById(videoId);
    }


}
