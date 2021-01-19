package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.service.attrValueService;
import com.fh.springboot_shop.utils.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-17 20:52
 */
@RestController
@RequestMapping("api/attrValue/")
@CrossOrigin
public class attrValueController {

    @Autowired
    private attrValueService  attrValueService;

    @GetMapping("queryAttrValue")
    public ReturnData queryAttrValue(BrandParam attValueParam){
        Map map =   attrValueService.queryAttrValue(attValueParam);
        return ReturnData.successs(map);
    }


    @PostMapping("addAttrValue")
    public ReturnData addAttrValue(attrValue attrval){
        attrValueService.addAttrValue(attrval);
        return ReturnData.successs("success");
    }


    @RequestMapping("queryDataByAid")
    public ReturnData queryDataByAid(Integer attrId){
        return ReturnData.successs(attrValueService.queryDataByAid(attrId));
    }

}
