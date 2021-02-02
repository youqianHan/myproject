package com.hyj.yjmall.coupon.dao;

import com.hyj.yjmall.coupon.entity.SmsCouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-04 19:03:49
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelationEntity> {
	
}
