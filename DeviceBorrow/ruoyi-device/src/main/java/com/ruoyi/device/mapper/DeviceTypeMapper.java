package com.ruoyi.device.mapper;

import com.ruoyi.device.domain.DeviceType;

import java.util.List;

/**
 * 分类的数据访问接口
 */
public interface DeviceTypeMapper {
    /**
     * 设备分类的新增功能
     * @param deviceType 分类信息
     * @return
     */
    public int insertDeviceType(DeviceType deviceType);

    /**
     * 修改设备类型
     * @param deviceType
     * @return
     */

    public int updateDecviceType(DeviceType deviceType);

    /**
     * 查询设备类型
     *
     *
     */
    public List<DeviceType> selectDeviceTypeList();


    /**
     * 根据id查询的实现思路
     * @pparam typeId 类型 id、
     * @return 设备类型
     */
    public DeviceType selectDeviceTypeId(Long typeId);

    /**
     * 设备的逻辑删除
     *
     */
    public int delectDeviceTypeById(Long typeId);


}
