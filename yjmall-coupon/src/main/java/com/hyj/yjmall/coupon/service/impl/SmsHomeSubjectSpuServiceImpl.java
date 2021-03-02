package com.hyj.yjmall.coupon.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyj.common.utils.PageUtils;
import com.hyj.common.utils.Query;

import com.hyj.yjmall.coupon.dao.SmsHomeSubjectSpuDao;
import com.hyj.yjmall.coupon.entity.SmsHomeSubjectSpuEntity;
import com.hyj.yjmall.coupon.service.SmsHomeSubjectSpuService;


@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl extends ServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpuEntity> implements SmsHomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeSubjectSpuEntity> page = this.page(
                new Query<SmsHomeSubjectSpuEntity>().getPage(params),
                new QueryWrapper<SmsHomeSubjectSpuEntity>()
        );

        return new PageUtils(page);
    }

}