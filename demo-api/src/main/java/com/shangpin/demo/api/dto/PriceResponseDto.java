package com.shangpin.demo.api.dto;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/12/18.
 */
public class PriceResponseDto {
    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private String productNo;
    private BigDecimal price;
}
