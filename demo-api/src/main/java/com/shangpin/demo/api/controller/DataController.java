package com.shangpin.demo.api.controller;

import com.shangpin.demo.api.dto.PriceResponseDto;
import com.shangpin.demo.api.dto.common.ResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/12/18.
 */
@Controller
@RequestMapping("/data")
public class DataController {

    // 此返回实体不使用别名
    @RequestMapping("/getPrice")
    @ResponseBody
    public ResponseDto getPrice() {
        ResponseDto dto = new ResponseDto();

        PriceResponseDto price = new PriceResponseDto();
        price.setProductNo("30389483");
        price.setPrice(new BigDecimal("599.00"));

        dto.setContent(price);

        return dto;
    }
}
