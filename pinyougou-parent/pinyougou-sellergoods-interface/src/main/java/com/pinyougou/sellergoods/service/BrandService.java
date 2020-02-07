package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 品牌列表接口
 */
public interface BrandService {

    /**
     * 查找所有品牌信息
     * @return
     */
    public List<TbBrand> findAll();

}
