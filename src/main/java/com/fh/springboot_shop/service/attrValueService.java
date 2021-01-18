package com.fh.springboot_shop.service;

import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.model.vo.BrandParam;

import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-17 20:53
 */
public interface attrValueService {

    Map queryAttrValue(BrandParam attValueParam);

    void addAttrValue(attrValue attrval);
}
