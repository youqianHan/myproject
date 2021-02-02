package com.hyj.yjmall.order.dao;

import com.hyj.yjmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-05 18:37:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
