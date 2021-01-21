package com.fh.springboot_shop.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fh.springboot_shop.dao.CommodityDao;
import com.fh.springboot_shop.dao.CommodityValueDao;
import com.fh.springboot_shop.dao.attrValueDao;
import com.fh.springboot_shop.model.po.Commodity;
import com.fh.springboot_shop.model.po.CommodityValue;
import com.fh.springboot_shop.model.po.attrValue;
import com.fh.springboot_shop.model.vo.BrandParam;
import com.fh.springboot_shop.model.vo.CommodityParam;
import com.fh.springboot_shop.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-20 14:52
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityDao commodityDao;
    @Resource
    private CommodityValueDao commodityValueDao;

    @Override
    public Map queryAttribute(CommodityParam comdity) {
        Map map = new HashMap();
        Long count = commodityDao.queryCount(comdity);
        map.put("count",count);
        List<Commodity> brands = commodityDao.queryListParams(comdity);
        map.put("data",brands);
        return map;
    }
    @Override
    public Commodity queryCommodityById(Integer id) {
        return commodityDao.queryCommodityById(id);
    }

    @Override
    public void updateCommodity(Commodity commodity) {
        commodityDao.updateCommodity(commodity);
    }

    @Override
    public void addCommodity(Commodity commodity, String attr, String sku) {
        commodity.setIsDel(0);
        commodity.setAuthor("cyb");
        commodityDao.addCommodity(commodity);
        // 声明属性数据的对象
        List<CommodityValue> adList=new ArrayList<>();
        //批量新增
        //将attr的json数组字符串 转为json数组对象
        JSONArray objects = JSONObject.parseArray(attr);
        for (int i = 0; i <objects.size() ; i++) {
            //构建属性数据对象
            CommodityValue comValue=new CommodityValue();
            //设置对应的商品id
            comValue.setProId(commodity.getId());
            comValue.setAttrData(objects.get(i).toString());
            //放入集合
            adList.add(comValue);
        }


        //将sku的json数组字符串 转为json数组对象
        JSONArray objectssku = JSONObject.parseArray(sku);
        for (int i = 0; i <objectssku.size() ; i++) {
            //得到具体一个json对象
            JSONObject dataJs= (JSONObject) objectssku.get(i);
            //构建属性数据对象
            CommodityValue comValue=new CommodityValue();
            //设置对应的商品id
            comValue.setProId(commodity.getId());
            comValue.setPrice(dataJs.getDouble("pricess"));
            comValue.setStorcks(dataJs.getInteger("storcks"));
            dataJs.remove("price");
            dataJs.remove("storck");
            comValue.setAttrData(objectssku.get(i).toString());
            //放入集合
            adList.add(comValue);
        }
        commodityValueDao.adds(adList);
    }
}
