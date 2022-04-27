package net.xdclass.online.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @program: online
 * @description: 22
 * @packagename: net.xdclass.online.model.request
 * @author: 姚泽宇
 * @date: 2022-04-27 13:41
 **/
public class VideoOrderRequest {



    @JsonProperty("video_id")
    private int videoId;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
}
