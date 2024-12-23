/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package com.easy.erp.controller;

import com.easy.erp.config.SessionManager;
import com.easy.erp.service.AppInfoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private AppInfoService appInfoService;

    @Autowired
    private SessionManager sessionManager;

    @GetMapping("/home")
    public String getHome(Model model,HttpServletRequest request) {
        model.addAttribute("appInfo", appInfoService.getAppInfo());
        HttpSession session = request.getSession();
        sessionManager.setLanguage(session);
        return "dashboard";
    }

}
