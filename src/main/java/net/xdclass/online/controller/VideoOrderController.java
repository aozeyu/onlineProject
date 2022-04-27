package net.xdclass.online.controller;

import net.xdclass.online.model.entity.VideoOrder;
import net.xdclass.online.model.request.VideoOrderRequest;
import net.xdclass.online.service.VideoOrderService;
import net.xdclass.online.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: online
 * @description: 订单接口
 * @packagename: net.xdclass.online.controller
 * @author: 姚泽宇
 * @date: 2022-04-27 10:56
 **/
@RestController
@RequestMapping("/api/v1/pri/order")
public class VideoOrderController {
    @Autowired
    private VideoOrderService videoOrderService;

    @PostMapping("save")
    @CrossOrigin
    public JsonData saveOrder(@RequestBody VideoOrderRequest videoOrderRequest, HttpServletRequest request) {
        Integer userId = (Integer) request.getAttribute("user_id");
        int rows = videoOrderService.save(userId, videoOrderRequest.getVideoId());
        return rows == 0 ? JsonData.buildError("下单失败") : JsonData.buildSuccess();
    }

    @GetMapping("list")
    @CrossOrigin
    public JsonData listOrder(HttpServletRequest request) {
        Integer userId = (Integer) request.getAttribute("user_id");
        List<VideoOrder> videoOrderList = videoOrderService.listOrderByUserId(userId);
        return JsonData.buildSuccess(videoOrderList);
    }
}
