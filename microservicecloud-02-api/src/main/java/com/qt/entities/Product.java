package com.qt.entities;

import java.io.Serializable;


public class Product implements Serializable {

    private long pid;
    private String productName;

    private String dbSource;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
