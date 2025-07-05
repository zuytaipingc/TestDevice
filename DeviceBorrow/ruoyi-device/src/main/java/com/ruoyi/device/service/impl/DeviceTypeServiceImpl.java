package com.ruoyi.device.service.impl;

import com.ruoyi.device.domain.DeviceType;
import com.ruoyi.device.mapper.DeviceTypeMapper;
import com.ruoyi.device.service.IDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 分类业务层实现类
 */
@Service //
public class DeviceTypeServiceImpl implements IDeviceTypeService {
    //注入数据访问层对象
//    @Autowired 给属性赋值，Springboot框架提供的注解
      @Resource //给属性赋值，由java提供的注解
      private DeviceTypeMapper deviceTypeMapper;

    /**
     * 新增
     * @param deviceType 分类信息
     * @return
     */
    @Override
    public int insertDeviceType(DeviceType deviceType) {
        //给新增时间赋值
        deviceType.setCreateTime(new Date());
        //调用数据访问层的新增方法，将数据新增到数据库
        return deviceTypeMapper.insertDeviceType(deviceType);
    }

    @Override
    public int updateDecviceType(DeviceType deviceType) {
        //给更新时间赋值
        deviceType.setUpdateTime(new Date());
        //调用数据访问层的更新方法，将数据更新到数据库
        return deviceTypeMapper.updateDecviceType(deviceType);
    }

    @Override
    public List<DeviceType> selectDeviceTypeList() {
        //获取数据
        return deviceTypeMapper.selectDeviceTypeList();
    }

    @Override
    public DeviceType selectDeviceTypeId(Long typeId) {
        return deviceTypeMapper.selectDeviceTypeId(typeId);
    }

    @Override
    public int delectDeviceTypeById(Long typeId) {
        return deviceTypeMapper.delectDeviceTypeById(typeId);

    }
}
