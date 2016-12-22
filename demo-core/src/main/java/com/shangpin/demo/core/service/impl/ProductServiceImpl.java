package com.shangpin.demo.core.service.impl;

import com.shangpin.demo.core.dao.ErpProductRepository;
import com.shangpin.demo.core.dao.ProductRepository;
import com.shangpin.demo.core.service.ProductService;
import com.shangpin.demo.model.ProductInfo;
import com.shangpin.demo.utils.datasource.DataSourceTypeManager;
import com.shangpin.demo.utils.datasource.EnumDataSource;
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
