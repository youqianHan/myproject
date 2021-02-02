package com.hyj.yjmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.coupon.entity.SmsCouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-04 19:03:49
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

