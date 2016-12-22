package com.shangpin.demo.core.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
@Repository
public interface ErpProductRepository {
    String getProductNoByPid(String pid);
}
