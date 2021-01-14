package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.model.po.TypeShop;
import com.fh.springboot_shop.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-12 16:47
 */
@RestController
@RequestMapping("api/type/")
@CrossOrigin
public class TypeController {

    @Autowired
    private TypeService typeService;


    @GetMapping("getData")
    public Map queryData(){
        Map map = new HashMap();
        try {
      List<TypeShop> typeShops= typeService.queryData();
            map.put("code",200);
            map.put("message","通过");
            map.put("data",typeShops);
            return map;
        }catch (Exception e){
            e.printStackTrace();
        map.put("code",500);
        map.put("message","参数不合法");
        map.put("data","");
        return map;
        }
    }


    @GetMapping("getDataByPid")
    public Map getDataByPid(Integer pid){
        Map map = new HashMap();
        try {
       List<TypeShop> shops =  typeService.getDataByPid(pid);
            map.put("code",200);
            map.put("message","通过");
            map.put("data",shops);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            map.put("code",500);
            map.put("message","参数不合法");
            map.put("data","");
            return map;
        }
    }

@PostMapping("add")
public Map add(TypeShop typeShop){
    Map map = new HashMap();
    try {
       typeService.add(typeShop);
        map.put("code",200);
        map.put("message","通过");
        map.put("id",typeShop.getId());
        return map;
    }catch (Exception e){
        e.printStackTrace();
        map.put("code",500);
        map.put("message","参数不合法");
        map.put("data","");
        return map;
    }
}


@PostMapping("update")
public Map update(TypeShop typeShop){
    Map map = new HashMap();

    if(typeShop.getId()==null){
        map.put("code",500);
        map.put("message","id为空");
        map.put("data","");
        return map;
    }
    try {
        typeService.update(typeShop);
        map.put("code",200);
        map.put("message","success");
        map.put("data","");
        return map;
    }catch (Exception e){
        e.printStackTrace();
        map.put("code",500);
        map.put("message","参数不合法");
        map.put("data","");
        return map;
    }
}








}
