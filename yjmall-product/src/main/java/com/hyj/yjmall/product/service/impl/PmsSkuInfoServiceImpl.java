package com.hyj.yjmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyj.common.utils.PageUtils;
import com.hyj.common.utils.Query;

import com.hyj.yjmall.product.dao.PmsSkuInfoDao;
import com.hyj.yjmall.product.entity.PmsSkuInfoEntity;
import com.hyj.yjmall.product.service.PmsSkuInfoService;


@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoDao, PmsSkuInfoEntity> implements PmsSkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuInfoEntity> page = this.page(
                new Query<PmsSkuInfoEntity>().getPage(params),
                new QueryWrapper<PmsSkuInfoEntity>()
        );

        return new PageUtils(page);
    }

}