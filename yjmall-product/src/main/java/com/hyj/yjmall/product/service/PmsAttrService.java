package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:44
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

