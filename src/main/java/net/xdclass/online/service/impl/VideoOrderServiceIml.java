package net.xdclass.online.service.impl;

import net.xdclass.online.exception.XDException;
import net.xdclass.online.mapper.*;
import net.xdclass.online.model.entity.Episode;
import net.xdclass.online.model.entity.PlayRecord;
import net.xdclass.online.model.entity.Video;
import net.xdclass.online.model.entity.VideoOrder;
import net.xdclass.online.service.VideoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;
import java.util.UUID;

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
    @Autowired
    private EpisodeMapper episodeMapper;
    @Autowired
    private PlayRecordMapper playRecordMapper;

    @Override
    @Transactional

    public int save(int userId, int videoId) {
        VideoOrder videoOrder = videoOrderMapper.findByUserIdAndVideoIdAndState(userId, videoId, 1);
        if (videoOrder != null) {
            return 0;
        }
        Video video = videoMapper.findById(videoId);
        VideoOrder newVideoOrder = new VideoOrder();
        newVideoOrder.setCreateTime(new Date());
        newVideoOrder.setOutTradeNo(UUID.randomUUID().toString());
        newVideoOrder.setState(1);
        newVideoOrder.setTotalFee(video.getPrice());
        newVideoOrder.setUserId(userId);
        newVideoOrder.setVideoId(videoId);
        newVideoOrder.setVideoImg(video.getCoverImg());
        newVideoOrder.setVideoTitle(video.getTitle());
        int rows = videoOrderMapper.saveOrder(newVideoOrder);
        /*
         * 生成播放记录*/
        if (rows == 1) {
            Episode episode = episodeMapper.findFirstEpisodeByVideoId(videoId);
            if (episode == null) {
                throw new XDException(-1, "视频没有集信息请运营人员检查");
            }
            PlayRecord playRecord = new PlayRecord();
            playRecord.setCreateTime(new Date());
            playRecord.setEpisodeId(episode.getId());
            playRecord.setUserId(userId);
            playRecord.setVideoId(videoId);
            playRecordMapper.saveRecord(playRecord);
        }
        return rows;
    }

    @Override
    public List<VideoOrder> listOrderByUserId(Integer userId) {
        return videoOrderMapper.listOrderByUserId(userId);
    }
}
