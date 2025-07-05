package com.ruoyi.device.service;

import com.ruoyi.device.domain.DeviceType;

import java.util.List;

public interface IDeviceTypeService {
    /**
     * 新增设备类型
     * @param deviceType
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
