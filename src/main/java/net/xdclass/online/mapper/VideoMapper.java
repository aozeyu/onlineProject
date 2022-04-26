package net.xdclass.online.mapper;

import net.xdclass.online.model.entity.Video;
import net.xdclass.online.model.entity.VideoBanner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: online
 * @description: 11
 * @packagename: net.xdclass.online.mapper
 * @author: 姚泽宇
 * @date: 2022-04-26 12:43
 **/
public interface VideoMapper {
    List<Video> listVideo();

    List<VideoBanner> listVideoBanner();


    /*查询视频详情接口开发*/
    Video findDetailById(@Param("video_id") int videoId);
}
