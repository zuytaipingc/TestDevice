package com.ruoyi.device.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.device.domain.DeviceType;
import com.ruoyi.device.service.IDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//标记为控制器
@RequestMapping("/device/type")//访问路径
@Anonymous //匿名访问

public class DeviceTypeController {
//    注入业务层对象
    @Autowired
    private IDeviceTypeService deviceTypeService;
    /**
     * 分类新增接口
     * @PostMapping("/add"):定义访问路径add，定义请求为post
     * 等价 ： @RequestMapping(value = "/add",method = RequestMethod.POST)
     * @param deviceType
     * @return
     */
    @PostMapping("/add")
    public AjaxResult add(@RequestBody DeviceType deviceType){
        //调用业务层处理数据
        int result = deviceTypeService.insertDeviceType(deviceType);
        //响应数据
        return AjaxResult.success("新增成功").put("data",result);
    }

    /**
     * 分类更新接口
     */
    @PostMapping("/edit")
    public AjaxResult edit(@RequestBody DeviceType deviceType){
        //调用业务层处理数据
        int result = deviceTypeService.updateDecviceType(deviceType);
        //响应数据
        return AjaxResult.success("更新成功").put("data",result);
    }

    /**
     *查找
     */
    @PostMapping("/list")
    public AjaxResult list(){
        //调用业务层处理数据
        List<DeviceType> deviceTypeList = deviceTypeService.selectDeviceTypeList();
//        响应数据
        return AjaxResult.success("查询成功").put("data",deviceTypeList);
    }
    /**
     * 根据id查抄
     *
     *
     */
    @PostMapping("/get")
    public AjaxResult get(Long typeId){
        //调用业务层数据
        DeviceType deviceType = deviceTypeService.selectDeviceTypeId(typeId);
        //响应数据
        return AjaxResult.success("查询id成功").put("data",deviceType);

    }

    /**
     * 逻辑删除
     */
    @PostMapping("/remove")
    public AjaxResult remove(Long typeId){
        //调用业务层
        int delectDeviceTypeById = deviceTypeService.delectDeviceTypeById(typeId);
        //响应
        return AjaxResult.success("删除成功").put("data",delectDeviceTypeById);
    }

}
