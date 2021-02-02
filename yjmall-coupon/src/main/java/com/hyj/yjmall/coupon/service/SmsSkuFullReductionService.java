package com.hyj.yjmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.coupon.entity.SmsSkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-04 19:03:47
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

