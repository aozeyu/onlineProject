package net.xdclass.online.mapper;

import net.xdclass.online.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

/**
 * @program: online
 * @description: sss
 * @packagename: net.xdclass.online.mapper
 * @author: 姚泽宇
 * @date: 2022-04-27 15:07
 **/
public interface EpisodeMapper {
    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);
}
