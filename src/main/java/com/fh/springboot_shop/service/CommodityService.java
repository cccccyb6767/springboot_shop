package com.fh.springboot_shop.service;

import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.model.vo.CommodityParam;

import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-20 14:51
 */
public interface CommodityService {
    Map queryAttribute(CommodityParam comdity);


}
