package com.fh.springboot_shop.service;

import com.fh.springboot_shop.model.po.TypeShop;

import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-12 16:47
 */
public interface TypeService {
    List<TypeShop> queryData();

    List<TypeShop> getDataByPid(Integer pid);


    void add(TypeShop typeShop);

    void update(TypeShop typeShop);

    void delType(Integer id);
}
