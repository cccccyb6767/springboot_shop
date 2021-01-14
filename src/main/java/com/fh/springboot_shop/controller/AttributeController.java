package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.po.shop_Attribute;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.service.AttrService;
import com.fh.springboot_shop.utils.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-14 21:22
 */
@RestController
@RequestMapping("api/attr/")
public class AttributeController {

    @Autowired
    private AttrService attrService;

    @GetMapping("queryAttribute")
    public ReturnData queryAttribute(BrandParam brandParam){
        if(brandParam.getStart()==null){
            return ReturnData.error(500,"参数不合法");
        }
        if(brandParam.getSize()==null){
            return ReturnData.error(500,"参数不合法");
        }
        Map map = attrService.queryAttribute(brandParam);
        return ReturnData.successs(map);
    }


    @PostMapping("addAttribute")
    public ReturnData addAttribute(shop_Attribute attr){
        attrService.addAttribute(attr);
        return ReturnData.successs("success");
    }

}
