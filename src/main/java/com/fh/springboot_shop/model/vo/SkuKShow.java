package com.fh.springboot_shop.model.vo;

public class SkuKShow {


    private  Integer id;

    private  String name;

    private  String nameCH;

    private  String typeName;

    private  Integer typeId;

    private  Integer isSKU;

    private  Integer type;


    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCH() {
        return nameCH;
    }

    public void setNameCH(String nameCH) {
        this.nameCH = nameCH;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getIsSKU() {
        return isSKU;
    }

    public void setIsSKU(Integer isSKU) {
        this.isSKU = isSKU;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
