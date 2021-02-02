package com.hyj.yjmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-05 18:37:56
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

