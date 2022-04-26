package net.xdclass.online.domain;

import java.util.Date;

/**
 * @program: online
 * @description: 视频轮播
 * @packagename: net.xdclass.online.domain
 * @author: 姚泽宇
 * @date: 2022-04-26 12:16
 **/
public class VideoBanner {
    private int id;
    private String url;
    private String img;
    private Date createTime;
    private int weight;

    @Override
    public String toString() {
        return "VideoBanner{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", img='" + img + '\'' +
                ", createTime=" + createTime +
                ", weight=" + weight +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
