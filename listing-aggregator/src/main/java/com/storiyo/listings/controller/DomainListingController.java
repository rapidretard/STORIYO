package com.storiyo.listings.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DomainListingController {

    private static Logger logger = LoggerFactory.getLogger(DomainListingController.class);

    @Autowired
    private RestTemplate oAuth2RestTemplate;

    @ResponseBody
    @GetMapping("/hello")
    public String getSomeThing() {
        return oAuth2RestTemplate.postForObject("https://api.domain.com.au/v1/listings/residential/_search", null, String.class);
    }

}
