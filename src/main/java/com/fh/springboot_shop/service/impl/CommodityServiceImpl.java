package com.fh.springboot_shop.service.impl;

import com.fh.springboot_shop.dao.CommodityDao;
import com.fh.springboot_shop.dao.attrValueDao;
import com.fh.springboot_shop.model.po.Commodity;
import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.model.vo.CommodityParam;
import com.fh.springboot_shop.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-20 14:52
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityDao commodityDao;

    @Override
    public Map queryAttribute(CommodityParam comdity) {
        Map map = new HashMap();
        Long count = commodityDao.queryCount(comdity);
        map.put("count",count);
        List<Commodity> brands = commodityDao.queryListParams(comdity);
        map.put("data",brands);
        return map;
    }
}
