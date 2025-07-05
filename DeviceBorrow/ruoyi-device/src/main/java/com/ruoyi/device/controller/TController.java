package com.ruoyi.device.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device/test")
@Anonymous
public class TController {
    @RequestMapping("/list")
    public AjaxResult list() {
        return AjaxResult.success("测试接口");
    }
}
