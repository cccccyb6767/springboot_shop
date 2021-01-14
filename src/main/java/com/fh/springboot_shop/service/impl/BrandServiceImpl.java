package com.fh.springboot_shop.service.impl;

import com.fh.springboot_shop.dao.BrandDao;
import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-13 19:06
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandDao brandDao;

    @Override
    public Map queryBrand(BrandParam brandParam) {
        Map map = new HashMap();
        Long count = brandDao.queryCount(brandParam);
        map.put("count",count);
        List<Brand> brands = brandDao.queryListParams(brandParam);
        map.put("data",brands);
        return map;
    }

    @Override
    public void addBrand(Brand brand) {
        brandDao.addBrand(brand);
    }

    @Override
    public Brand queryBrandById(Integer id) {
        return brandDao.queryBrandById(id);
    }

    @Override
    public void updateBrand(Brand brand) {
        brandDao.updateBrand(brand);
    }
}
