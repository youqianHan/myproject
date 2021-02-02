package com.hyj.yjmall.coupon.dao;

import com.hyj.yjmall.coupon.entity.SmsHomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-04 19:03:50
 */
@Mapper
public interface SmsHomeSubjectDao extends BaseMapper<SmsHomeSubjectEntity> {
	
}
