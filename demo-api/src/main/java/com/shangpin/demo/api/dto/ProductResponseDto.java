package com.shangpin.demo.api.dto;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/12/18.
 */
public class ProductResponseDto {
    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private String productNo;
    @SerializedName("name")//别名
    private String productName;
    private BigDecimal price;
}
