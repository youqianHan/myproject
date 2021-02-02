package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsCategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:43
 */
public interface PmsCategoryBrandRelationService extends IService<PmsCategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

