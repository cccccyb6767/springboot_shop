package com.fh.springboot_shop.service;

import com.fh.springboot_shop.model.po.shop_Attribute;
import com.fh.springboot_shop.model.vo.BrandParam;

import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-14 21:22
 */
public interface AttrService {
    Map queryAttribute(BrandParam brandParam);
    void addAttribute(shop_Attribute attr);

    shop_Attribute queryAttrById(Integer id);

    void updateAttr(shop_Attribute attr);

    void delAttribute(Integer id);

    List<shop_Attribute> queryDataByTypeId(Integer typeId);
}
