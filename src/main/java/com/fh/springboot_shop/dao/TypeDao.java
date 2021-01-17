package com.fh.springboot_shop.dao;

import com.fh.springboot_shop.model.po.TypeShop;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yiboChen
 * @create 2021-01-12 16:49
 */
public interface TypeDao {
    List<TypeShop> queryData();

    List<TypeShop> getDataByPid(Integer pid);

    void add(TypeShop typeShop);

    void update(TypeShop typeShop);

    void delType(Integer id);
}
