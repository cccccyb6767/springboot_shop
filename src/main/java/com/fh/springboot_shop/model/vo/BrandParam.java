package com.fh.springboot_shop.model.vo;

import com.fh.springboot_shop.model.po.Brand;

/**
 * @author yiboChen
 * @create 2021-01-13 19:09
 */
public class BrandParam  {



    private Integer  aid;
    private  Integer start;
    private  Integer size;
    private  String  name;
    private  Integer typeId;




    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}
