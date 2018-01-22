package com.zhazhapan.efo.web.controller;

import com.zhazhapan.efo.service.impl.ConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pantao
 * @date 2018/1/22
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    ConfigServiceImpl configService;

    @RequestMapping(value = "/global", method = RequestMethod.GET)
    public String getGlobalConfig() {
        return configService.getGlobalConfig();
    }
}