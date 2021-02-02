package com.hyj.yjmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.product.entity.PmsCommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:10:43
 */
public interface PmsCommentReplayService extends IService<PmsCommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

