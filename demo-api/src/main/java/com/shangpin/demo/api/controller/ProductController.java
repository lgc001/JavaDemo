package com.shangpin.demo.api.controller;

import com.shangpin.demo.api.dto.ProductResponseDto;
import com.shangpin.demo.api.dto.common.ResponseDto;
import com.shangpin.demo.api.service.PriceApiService;
import com.shangpin.demo.api.service.ProductService;
import com.shangpin.demo.model.ProductInfo;
import com.shangpin.demo.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/12/18.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService _productService;
    @Autowired
    private PriceApiService _priceApiService;

    //这种情况可以使用实体的属性的别名
    @RequestMapping(value = "/getProduct", produces = {"application/json;charset=UTF-8"})//为了使用返回中文不乱码
    @ResponseBody
    public String getProduct() throws UnsupportedEncodingException {
        ProductInfo productInfo = _productService.getProduct("30389483");

        ProductResponseDto product=new ProductResponseDto();
        product.setProductNo(productInfo.getProductNo());
        product.setProductName(productInfo.getProductName());
        product.setPrice(_priceApiService.getPriceByProductNo("30389483"));

        ResponseDto<ProductResponseDto> dto=new ResponseDto<ProductResponseDto>();
        dto.setCode("0");
        dto.setContent(product);

        return JsonUtil.toJson(dto);

    }

    //这种情况不可以使用实体的属性的别名
    @RequestMapping(value = "/getProduct2")
    @ResponseBody
    public ResponseDto getProduct2() {
        ProductInfo productInfo = _productService.getProduct("30389483");

        ProductResponseDto product=new ProductResponseDto();
        product.setProductNo(productInfo.getProductNo());
        product.setProductName(productInfo.getProductName());
        product.setPrice(_priceApiService.getPriceByProductNo("30389483"));

        ResponseDto<ProductResponseDto> dto=new ResponseDto<>();
        dto.setCode("0");
        dto.setContent(product);

        return dto;
    }

    //这种情况不可以使用实体的属性的别名
    @RequestMapping(value = "/getProductNoByPid")
    @ResponseBody
    public ResponseDto getProductNoByPid() {
        String productNo = _productService.getProductNoByPid("PID3003138659");

        ResponseDto<String> dto=new ResponseDto<>();
        dto.setCode("0");
        dto.setContent(productNo);

        return dto;
    }
}
