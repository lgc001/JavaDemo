package com.shangpin.demo.core.service.impl;

import com.google.gson.reflect.TypeToken;
import com.shangpin.demo.core.service.PriceApiService;
import com.shangpin.demo.model.dto.PriceResponseDto;
import com.shangpin.demo.model.dto.common.ResponseDto;
import com.shangpin.demo.utils.ConfigHelper;
import com.shangpin.demo.utils.HttpClientUtil;
import com.shangpin.demo.utils.JsonUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@Service
public class PriceApiServiceImpl implements PriceApiService {
    public BigDecimal getPriceByProductNo(String productNo)
    {
        try {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("productNo", productNo);
            String apiUrl = ConfigHelper.getPriceApiUrl()+"data/getPrice";
            String result = HttpClientUtil.httpGetRequest(apiUrl, params);

            ResponseDto<PriceResponseDto> responseDto = JsonUtil.fromJson(result, new TypeToken<ResponseDto<PriceResponseDto>>(){}.getType());//TypeToken，它是gson提供的数据类型转换器，可以支持各种数据集合类型转换。
            PriceResponseDto priceDto =responseDto.getContent();

            if(priceDto == null)
            {
                throw new Exception("商品号不存在");
            }
            return priceDto.getPrice();
        }
        catch (Exception ex)
        {
            return new BigDecimal("0");
        }
    }
}
