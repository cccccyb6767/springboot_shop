package com.fh.springboot_shop.service.impl;


import com.fh.springboot_shop.dao.attrValueDao;
import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.service.attrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author yiboChen
 * @create 2021-01-17 20:53
 */
@Service
public class attrValueServiceImpl implements attrValueService {
    @Resource
    private attrValueDao  attrValueDao;


    @Override
    public Map queryAttrValue(BrandParam attValueParam) {
        Map map = new HashMap();
        Long count = attrValueDao.queryCount(attValueParam);
        map.put("count",count);
        List<attrValue> brands = attrValueDao.queryListParams(attValueParam);
        map.put("data",brands);
        return map;
    }

    @Override
    public void addAttrValue(attrValue attrval) {
            attrval.setIsDel(0);
        attrValueDao.addAttrValue(attrval);
    }

    @Override
    public List<attrValue> queryDataByAid(Integer attrId) {
        return attrValueDao.queryDataByAid(attrId);
    }
}
