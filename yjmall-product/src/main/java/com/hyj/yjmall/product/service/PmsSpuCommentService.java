package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsSpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:42
 */
public interface PmsSpuCommentService extends IService<PmsSpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

