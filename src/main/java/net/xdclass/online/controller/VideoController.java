package net.xdclass.online.controller;

import net.xdclass.online.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        @RequestMapping("list")
    public Object listVideo() {
        return videoService.listVideo();
    }
}
