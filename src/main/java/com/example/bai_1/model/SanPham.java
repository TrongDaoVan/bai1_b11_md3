package com.example.bai_1.model;

public class SanPham {
    private int id;
    private String productName;
    private int priceName;
    private String productDescription;
    private String producer;

    public SanPham() {
    }

    public SanPham(int id, String productName, int priceName, String productDescription, String producer) {
        this.id = id;
        this.productName = productName;
        this.priceName = priceName;
        this.productDescription = productDescription;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPriceName() {
        return priceName;
    }

    public void setPriceName(int priceName) {
        this.priceName = priceName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
