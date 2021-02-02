package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsSkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:42
 */
public interface PmsSkuSaleAttrValueService extends IService<PmsSkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

