package com.fh.springboot_shop.dao;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.vo.BrandParam;

import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-13 19:05
 */
public interface BrandDao {


    Long queryCount(BrandParam brandParam);
    List<Brand> queryListParams(BrandParam brandParam);

    void addBrand(Brand brand);

    Brand queryBrandById(Integer id);

    void updateBrand(Brand brand);

    void delBrand(Integer id);
}
