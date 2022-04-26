package net.xdclass.online.controller;

import net.xdclass.online.model.Video;
import net.xdclass.online.model.VideoBanner;
import net.xdclass.online.service.VideoService;
import net.xdclass.online.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.controller
 * @author: 姚泽宇
 * @date: 2022-04-26 12:49
 **/
@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping("list_banner")
    @CrossOrigin
    public JsonData indexBanner() {
        List<VideoBanner> bannerList = videoService.listVideoBanner();
        return JsonData.buildSuccess(bannerList);
    }

    @RequestMapping("list")
    @CrossOrigin
    public JsonData listVideo() {
        List<Video> videoList = videoService.listVideo();

        return JsonData.buildSuccess(videoList);
    }

    /*
     * 视频详情*/
    @GetMapping("find_detail_by_id")
    @CrossOrigin
    public JsonData findDetailById(@RequestParam(value = "video_id", required = true) int videoId) {
        Video video = videoService.findDetailById(videoId);
        return JsonData.buildSuccess(video);
    }
}
