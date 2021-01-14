package com.fh.springboot_shop.service.impl;

import com.fh.springboot_shop.dao.AttrDao;
import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.po.shop_Attribute;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.service.AttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-14 21:23
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Resource
    private AttrDao attrDao;

    @Override
    public Map queryAttribute(BrandParam brandParam) {
        Map map = new HashMap();
        Long count = attrDao.queryCount(brandParam);
        map.put("count",count);
        List<Brand> brands = attrDao.queryListParams(brandParam);
        map.put("data",brands);
        return map;
    }

    @Override
    public void addAttribute(shop_Attribute attr) {
        attrDao.addAttribute(attr);
    }

    @Override
    public shop_Attribute queryAttrById(Integer id) {
        return attrDao.queryAttrById(id);
    }
}
