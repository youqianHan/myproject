package com.hyj.yjmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyj.common.utils.PageUtils;
import com.hyj.common.utils.Query;

import com.hyj.yjmall.coupon.dao.SmsHomeSubjectDao;
import com.hyj.yjmall.coupon.entity.SmsHomeSubjectEntity;
import com.hyj.yjmall.coupon.service.SmsHomeSubjectService;


@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl extends ServiceImpl<SmsHomeSubjectDao, SmsHomeSubjectEntity> implements SmsHomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeSubjectEntity> page = this.page(
                new Query<SmsHomeSubjectEntity>().getPage(params),
                new QueryWrapper<SmsHomeSubjectEntity>()
        );

        return new PageUtils(page);
    }

}