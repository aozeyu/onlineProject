package net.xdclass.online.model.entity;

import java.util.Date;

/**
 * @program: online
 * @description: 播放记录
 * @packagename: net.xdclass.online.model.entity
 * @author: 姚泽宇
 * @date: 2022-04-27 15:00
 **/
public class PlayRecord {
    private Integer id;
    private Integer userId;
    private Integer currentNum;
    private Integer videoId;
    private Integer episodeId;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
