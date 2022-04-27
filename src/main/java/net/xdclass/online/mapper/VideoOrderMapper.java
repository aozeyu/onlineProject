package net.xdclass.online.mapper;

import net.xdclass.online.model.entity.VideoOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.mapper
 * @author: 姚泽宇
 * @date: 2022-04-27 13:49
 **/
public interface VideoOrderMapper {

    VideoOrder findByUserIdAndVideoIdAndState(@Param("user_id") int userId, @Param("video_id") int videoId, @Param("state") int state);

    int saveOrder(VideoOrder videoOrder);

    List<VideoOrder> listOrderByUserId(@Param("user_id") Integer userId);
}
