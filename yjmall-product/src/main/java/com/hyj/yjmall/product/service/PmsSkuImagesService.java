package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsSkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:43
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

