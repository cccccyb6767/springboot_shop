package com.fh.springboot_shop.dao;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.po.shop_Attribute;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.model.vo.SkuKShow;

import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-14 21:22
 */
public interface AttrDao {
    Long queryCount(BrandParam brandParam);

    List<shop_Attribute> queryListParams(BrandParam brandParam);

    void addAttribute(shop_Attribute attr);

    shop_Attribute queryAttrById(Integer id);

    void updateAttr(shop_Attribute attr);

    void delAttribute(Integer id);

    List<SkuKShow> queryListParamsSkuKShow(BrandParam brandParam);

    List<shop_Attribute> queryDataByTypeId(Integer typeId);
}
