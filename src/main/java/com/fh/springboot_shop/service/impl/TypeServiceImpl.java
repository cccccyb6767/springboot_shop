package com.fh.springboot_shop.service.impl;

import com.fh.springboot_shop.dao.TypeDao;
import com.fh.springboot_shop.model.po.TypeShop;
import com.fh.springboot_shop.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-12 16:48
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeDao typeDao;

    @Override
    public List<TypeShop> queryData() {
        return typeDao.queryData();
    }

    @Override
    public List<TypeShop> getDataByPid(Integer pid) {
        return typeDao.getDataByPid(pid);
    }

    @Override
    public void add(TypeShop typeShop) {
        typeShop.setCreateDate(new Date());
        typeShop.setIsDel(0);
       typeDao.add(typeShop);
    }

    @Override
    public void update(TypeShop typeShop) {
        typeShop.setUpdateDate(new Date());
        typeDao.update(typeShop);
    }

    @Override
    public void delType(Integer id) {
        typeDao.delType(id);
    }


}
