package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsSpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:42
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

