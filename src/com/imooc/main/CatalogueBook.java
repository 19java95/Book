package com.imooc.main;

/**
 * Created by TangTian on 2018/10/17.
 */
public class CatalogueBook {
    private String  catalogueBookid;
    private String catalogueBookname;
    private String catalogueBookdescribe;

    public String getCatalogueBookid() {
        return catalogueBookid;
    }

    public void setCatalogueBookid(String catalogueBookid) {
        this.catalogueBookid = catalogueBookid;
    }

    public String getCatalogueBookname() {
        return catalogueBookname;
    }

    public void setCatalogueBookname(String catalogueBookname) {
        this.catalogueBookname = catalogueBookname;
    }

    public String getCatalogueBookdescribe() {
        return catalogueBookdescribe;
    }

    public void setCatalogueBookdescribe(String catalogueBookdescribe) {
        this.catalogueBookdescribe = catalogueBookdescribe;
    }

    @Override
    public String toString() {
        return "CatalogueBook{" +
                "catalogueBookid=" + catalogueBookid +
                ", catalogueBookname=" + catalogueBookname +
                ", catalogueBookdescribe=" + catalogueBookdescribe +
                '}';
    }
}
