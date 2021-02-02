package com.hyj.yjmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.coupon.entity.SmsMemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-04 19:03:48
 */
public interface SmsMemberPriceService extends IService<SmsMemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

