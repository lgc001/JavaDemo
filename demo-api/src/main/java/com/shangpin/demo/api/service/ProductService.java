package com.shangpin.demo.api.service;

import com.shangpin.demo.model.ProductInfo;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public interface ProductService {
    ProductInfo getProduct(String productNo);

    String getProductNoByPid(String pid);
}
