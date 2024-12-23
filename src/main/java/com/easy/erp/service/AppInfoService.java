/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package com.easy.erp.service;

import com.easy.erp.entity.AppInfo;
import jakarta.servlet.ServletContext;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;
import org.thymeleaf.Thymeleaf;

@Service
public class AppInfoService {

    private final ServletContext servletContext;

    public AppInfoService(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(getJavaRuntimeVersion());
        appInfo.setSpringVersion(getSpringVersion());
        appInfo.setSpringBootVersion(getSpringBootVersion());
        appInfo.setThymeleafVersion(getThymeleafVersion());
        appInfo.setServerInfo(getServerInfo());
        return appInfo;
    }

    private String getJavaRuntimeVersion() {
        return Runtime.version().toString();   // Java 9+
    }

    private String getSpringVersion() {
        return SpringVersion.getVersion();
    }

    private String getSpringBootVersion() {
        return SpringBootVersion.getVersion();
    }

    private String getThymeleafVersion() {
        return Thymeleaf.getVersion();
    }

    private String getServerInfo() {
        return servletContext.getServerInfo();
    }
}
