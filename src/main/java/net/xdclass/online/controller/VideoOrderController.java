package net.xdclass.online.controller;

import net.xdclass.online.model.request.VideoOrderRequest;
import net.xdclass.online.utils.JsonData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    @RequestMapping("save")
    public JsonData saveOrder(@RequestBody VideoOrderRequest videoOrderRequest, HttpServletRequest request) {
        Integer userId = (Integer) request.getAttribute("user_id");
        return JsonData.buildSuccess();
    }
}
