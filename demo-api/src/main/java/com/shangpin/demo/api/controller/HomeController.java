package com.shangpin.demo.api.controller;

import com.shangpin.demo.api.dto.ProductResponseDto;
import com.shangpin.demo.api.service.PriceApiService;
import com.shangpin.demo.api.service.ProductService;
import com.shangpin.demo.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private ProductService _productService;
    @Autowired
    private PriceApiService _priceApiService;

    @RequestMapping("/index")
    public String  index(Model model) {
        model.addAttribute("title", "首页title");

        ProductInfo productInfo = _productService.getProduct("30389483");

        model.addAttribute("productName",productInfo.getProductName());
        model.addAttribute("productPrice",_priceApiService.getPriceByProductNo("30389483").toString());

        List<String> list = new ArrayList<>();
        list.add("第一条");
        list.add("第二条");
        list.add("第三条");
        model.addAttribute("myList",list);

        return "home/index";
    }

    @RequestMapping("/test1")
    public String  test1(Model model) {
        return "home/test1";
    }
}
