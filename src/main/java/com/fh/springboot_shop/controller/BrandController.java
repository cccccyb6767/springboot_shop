package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.model.po.Brand;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.service.BrandService;
import com.fh.springboot_shop.utils.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-13 19:05
 */
@RestController
@RequestMapping("api/brand/")
@CrossOrigin
public class BrandController {
    @Autowired
    private BrandService brandService;


    @GetMapping("queryBrand")
    public ReturnData queryBrand(BrandParam brandParam){
            if(brandParam.getStart()==null){
                return ReturnData.error(500,"参数不合法");
            }
        if(brandParam.getSize()==null){
            return ReturnData.error(500,"参数不合法");
        }
       Map map = brandService.queryBrand(brandParam);
        return ReturnData.successs(map);
    }


    @PostMapping("addBrand")
    public ReturnData addBrand(Brand brand){
        brandService.addBrand(brand);
        return ReturnData.successs("success");
    }

    @GetMapping("queryBrandById")
    public ReturnData queryBrandById(Integer id){
     Brand brand =   brandService.queryBrandById(id);
        return ReturnData.successs(brand);
    }

    @PostMapping("updateBrand")
    public ReturnData updateBrand(Brand brand){
        brandService.updateBrand(brand);
        return ReturnData.successs("success");
    }

    @DeleteMapping("delBrand")
    public ReturnData delBrand(Integer id){
        brandService.delBrand(id);
        return ReturnData.successs("success");
    }


    @GetMapping("queryBrandData")
    public ReturnData queryBrandData(){
     List<Brand> brands = brandService.queryBrandData();
        return ReturnData.successs(brands);
    }

}
