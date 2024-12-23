package com.easy.erp.entity.common;

import com.easy.erp.entity.interfaces.LanguageType;

public class EnglishLanguage implements LanguageType {
    @Override
    public String getType() {
        return "en";
    }
}
