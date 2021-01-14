package com.fh.springboot_shop.dao;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.po.shop_Attribute;
import com.fh.springboot_shop.model.vo.BrandParam;

import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-14 21:22
 */
public interface AttrDao {
    Long queryCount(BrandParam brandParam);

    List<Brand> queryListParams(BrandParam brandParam);

    void addAttribute(shop_Attribute attr);

    shop_Attribute queryAttrById(Integer id);
}
