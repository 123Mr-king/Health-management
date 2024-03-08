package com.sports.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/")
public class WebContext {
    @RequestMapping(value = "heartdata.do", method = RequestMethod.GET)
    @ResponseBody
    public String getwebdata(String weburl)throws Exception {
        Document doc = null;
        doc = Jsoup.connect(weburl).header("Accept", "*/*").header("Accept-Encoding", "gzip, deflate").header("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3").header("Content-Type", "application/json;charset=UTF-8").header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0").timeout(10000).ignoreContentType(true).get();
        String data=doc.body().text();
        System.out.println(data);
        return data;
    }
}
