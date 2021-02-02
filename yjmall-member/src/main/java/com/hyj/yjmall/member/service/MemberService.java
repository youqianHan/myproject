package com.hyj.yjmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyj.common.utils.PageUtils;
import com.hyj.yjmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-05 14:36:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

