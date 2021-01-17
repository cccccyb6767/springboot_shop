package com.fh.springboot_shop.service.impl;


import com.fh.springboot_shop.dao.attrValueDao;
import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.service.attrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public List<attrValue> queryAttrValue() {
        return attrValueDao.queryAttrValue();
    }

    @Override
    public void addAttrValue(attrValue attrval) {
        attrValueDao.addAttrValue(attrval);
    }
}
