package com.cw.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/typo")
public class TypoController {

    @RequestMapping(value = "/typo", method = RequestMethod.GET)
    public JSONObject getTypo(HttpServletRequest request){
        String query = request.getQueryString();
        JSONObject data = new JSONObject();
        data.put("query",query);
        return data;
    }
}

