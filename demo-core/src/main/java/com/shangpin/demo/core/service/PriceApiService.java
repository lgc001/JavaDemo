package com.shangpin.demo.core.service;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public interface PriceApiService {
    BigDecimal getPriceByProductNo(String productNo);
}
