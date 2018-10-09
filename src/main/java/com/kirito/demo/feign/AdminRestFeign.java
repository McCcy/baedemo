package com.kirito.demo.feign;

import com.kirito.demo.dto.ResultDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        name = "AdminRestFeign",
        url = "http://127.0.0.1:8080"
)
public interface AdminRestFeign {

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    ResultDTO getArticle();
}
