package com.hyj.yjmall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyj.yjmall.product.entity.PmsCategoryBrandRelationEntity;
import com.hyj.yjmall.product.service.PmsCategoryBrandRelationService;
import com.hyj.common.utils.PageUtils;
import com.hyj.common.utils.R;



/**
 * 品牌分类关联
 *
 * @author hanyouqian
 * @email sunlightcs@gmail.com
 * @date 2021-01-04 18:57:55
 */
@RestController
@RequestMapping("product/pmscategorybrandrelation")
public class PmsCategoryBrandRelationController {
    @Autowired
    private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmscategorybrandrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCategoryBrandRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmscategorybrandrelation:info")
    public R info(@PathVariable("id") Long id){
		PmsCategoryBrandRelationEntity pmsCategoryBrandRelation = pmsCategoryBrandRelationService.getById(id);

        return R.ok().put("pmsCategoryBrandRelation", pmsCategoryBrandRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmscategorybrandrelation:save")
    public R save(@RequestBody PmsCategoryBrandRelationEntity pmsCategoryBrandRelation){
		pmsCategoryBrandRelationService.save(pmsCategoryBrandRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmscategorybrandrelation:update")
    public R update(@RequestBody PmsCategoryBrandRelationEntity pmsCategoryBrandRelation){
		pmsCategoryBrandRelationService.updateById(pmsCategoryBrandRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmscategorybrandrelation:delete")
    public R delete(@RequestBody Long[] ids){
		pmsCategoryBrandRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
