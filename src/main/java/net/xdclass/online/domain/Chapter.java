package net.xdclass.online.domain;

import java.util.Date;

/**
 * @program: online
 * @description: 章节信息
 * @packagename: net.xdclass.online.domain
 * @author: 姚泽宇
 * @date: 2022-04-26 12:24
 **/
public class Chapter {
    private Integer id;
    private Integer videoId;
    private String title;
    private Integer ordered;
    private Date create_time;

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                ", ordered=" + ordered +
                ", create_time=" + create_time +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
