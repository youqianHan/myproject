package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsAttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:44
 */
public interface PmsAttrAttrgroupRelationService extends IService<PmsAttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

