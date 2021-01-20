package com.fh.springboot_shop.dao;

import com.fh.springboot_shop.model.po.Commodity;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.model.vo.CommodityParam;

import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-20 14:52
 */
public interface CommodityDao {


    Long queryCount(CommodityParam comdity);
    List<Commodity> queryListParams(CommodityParam comdity);

    void addCommodity(Commodity commodity);
}
