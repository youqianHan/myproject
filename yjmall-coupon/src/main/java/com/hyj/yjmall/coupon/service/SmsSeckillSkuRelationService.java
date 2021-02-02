package com.hyj.yjmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.coupon.entity.SmsSeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-04 19:03:48
 */
public interface SmsSeckillSkuRelationService extends IService<SmsSeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

