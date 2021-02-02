package com.hyj.yjmall.member.dao;

import com.hyj.yjmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-05 14:36:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
