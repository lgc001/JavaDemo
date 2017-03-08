package com.shangpin.demo.api.service.impl;

import com.shangpin.demo.api.dao.ErpProductRepository;
import com.shangpin.demo.api.dao.ProductRepository;
import com.shangpin.demo.api.service.ProductService;
import com.shangpin.demo.api.util.datasource.DataSourceTypeManager;
import com.shangpin.demo.api.util.datasource.EnumDataSource;
import com.shangpin.demo.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository _productRepository;

    @Autowired
    private ErpProductRepository _erpProductRepository;

    public ProductInfo getProduct(String productNo)
    {
        return _productRepository.getProduct(productNo);
    }

    public String getProductNoByPid(String pid)
    {
        //手动切换成erp库
        DataSourceTypeManager.set(EnumDataSource.ErpConn);
        return _erpProductRepository.getProductNoByPid(pid);
    }
}
