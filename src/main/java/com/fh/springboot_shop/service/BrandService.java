package com.fh.springboot_shop.service;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.vo.BrandParam;

import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-13 19:06
 */
public interface BrandService {
    Map queryBrand(BrandParam brandParam);
    void addBrand(Brand brand);
    Brand queryBrandById(Integer id);
    void updateBrand(Brand brand);
}
