package com.shangpin.demo.core.dao;

import com.shangpin.demo.model.ProductInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@Repository
public interface ProductRepository {
    ProductInfo getProduct(String productNo);
}
