package com.github.zhaoxny.yida.admin.service;

import com.github.zhaoxny.yida.model.entity.OmsOrderSetting;

/**
 * 订单设置Service
 * @Author Henry
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}