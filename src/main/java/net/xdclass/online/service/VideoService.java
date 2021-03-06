package net.xdclass.online.service;

import net.xdclass.online.model.entity.Video;
import net.xdclass.online.model.entity.VideoBanner;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @program: online
 * @description: 777
 * @packagename: net.xdclass.online.service
 * @author: 姚泽宇
 * @date: 2022-04-26 12:48
 **/
public interface VideoService {
    List<Video> listVideo();

    List<VideoBanner> listVideoBanner() throws ExecutionException;

    Video findDetailById(int videoId);
}
