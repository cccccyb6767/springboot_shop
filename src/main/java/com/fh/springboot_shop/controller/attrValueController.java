package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.service.attrValueService;
import com.fh.springboot_shop.utils.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class attrValueController {

    @Autowired
    private attrValueService  attrValueService;

    @GetMapping("queryAttrValue")
    public ReturnData queryAttrValue(){
            List<attrValue>  attrValues=attrValueService.queryAttrValue();
        return ReturnData.successs(attrValues);
    }


}
