package com.fh.springboot_shop.dao;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.model.vo.BrandParam;

import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-17 20:54
 */
public interface attrValueDao {



    void addAttrValue(attrValue attrval);

    Long queryCount(BrandParam attValueParam);

    List<attrValue> queryListParams(BrandParam attValueParam);
}
