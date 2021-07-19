package com.github.zhaoxny.yida.oms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.zhaoxny.yida.ums.dto.req.OmsMoneyInfoParam;
import com.github.zhaoxny.yida.ums.dto.req.OmsOrderDeliveryParam;
import com.github.zhaoxny.yida.ums.dto.req.OmsOrderQueryParam;
import com.github.zhaoxny.yida.ums.dto.req.OmsReceiverInfoParam;
import com.github.zhaoxny.yida.model.dto.resp.OmsOrderDetail;
import com.github.zhaoxny.yida.model.entity.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 订单管理Service
 * @Author Henry
 */
public interface OmsOrderService {
    /**
     * 订单查询
     */
    Page<OmsOrder> getPage(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量发货
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * 批量删除订单
     */
    int delete(List<Long> ids);

    /**
     * 获取指定订单详情
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改订单收货人信息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改订单备注
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}