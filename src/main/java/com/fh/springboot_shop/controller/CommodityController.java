package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.model.vo.CommodityParam;
import com.fh.springboot_shop.service.CommodityService;
import com.fh.springboot_shop.utils.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-20 14:51
 */
@RestController
@RequestMapping("api/com/")
@CrossOrigin
public class CommodityController {

    @Autowired
    private CommodityService commodityService;


    @GetMapping("queryCommodity")
    public ReturnData queryCommodity(CommodityParam comdity){
        if(comdity.getStart()==null){
            return ReturnData.error(500,"参数不合法");
        }
        if(comdity.getSize()==null){
            return ReturnData.error(500,"参数不合法");
        }
        Map map = commodityService.queryAttribute(comdity);
        return ReturnData.successs(map);
    }


}
