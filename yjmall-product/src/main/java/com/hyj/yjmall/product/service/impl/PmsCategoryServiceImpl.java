package com.hyj.yjmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyj.common.utils.PageUtils;
import com.hyj.common.utils.Query;

import com.hyj.yjmall.product.dao.PmsCategoryDao;
import com.hyj.yjmall.product.entity.PmsCategoryEntity;
import com.hyj.yjmall.product.service.PmsCategoryService;


@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 1 查出所有分类
     * 2 组装父子结构
     * @return
     */
    @Override
    public List<PmsCategoryEntity> listWithTree() {
        List<PmsCategoryEntity> pmsCategoryEntities = baseMapper.selectList(null);

        List<PmsCategoryEntity> leve1menus = pmsCategoryEntities.stream().filter(CategoryEntities ->
             CategoryEntities.getParentCid() == 0
        ).map(menu ->{
            menu.setChildren(getChildrens(menu,pmsCategoryEntities));
            return menu;
        }).collect(Collectors.toList());


        return leve1menus;
    }




    private List<PmsCategoryEntity> getChildrens(PmsCategoryEntity root,List<PmsCategoryEntity> all){
        List<PmsCategoryEntity> childrens = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(leve2menus -> {
            leve2menus.setChildren(getChildrens(leve2menus, all));
            return leve2menus;
        }).collect(Collectors.toList());
        return childrens;
    }
}