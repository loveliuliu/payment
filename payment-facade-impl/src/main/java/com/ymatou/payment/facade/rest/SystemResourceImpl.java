/**
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.ymatou.payment.facade.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ymatou.payment.integration.IntegrationConfig;

/**
 * 系统消息实现
 * 
 * @author wangxudong 2016年5月22日 下午10:09:34
 *
 */
@Component("systemResource")
@Path("/")
@Produces(MediaType.TEXT_HTML)
public class SystemResourceImpl implements SystemResource {

    @Autowired
    private IntegrationConfig integrationConfig;

    @GET
    @Path("/version")
    @Override
    public String version() {
        return "2016-07-04.1";
    }


    @Override
    @GET
    @Path("/warmup")
    public String status() {
        File jsapiCert = new File(integrationConfig.getWxJsapiCertPath());
        File appCert = new File(integrationConfig.getWxAppCertPath());
        if (jsapiCert.exists() && appCert.exists()) {
            return "ok";
        } else {
            return "weixin cert not exist.";
        }
    }
}
