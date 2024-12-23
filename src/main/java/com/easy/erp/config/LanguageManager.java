package com.easy.erp.config;


import com.easy.erp.I18N;
import com.easy.erp.entity.Language;
import com.easy.erp.service.LanguageService;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Service
public class LanguageManager {
    public static final String ENGLISH= "en";
    public static final String FRENCH= "fr";
    private final LanguageService languageService;
    private final I18N i18n;

    public LanguageManager(LanguageService languageService, I18N i18n) {
        this.languageService = languageService;
        this.i18n = i18n;
    }



    public Language getCurrentLanguage() {
        Locale locale = LocaleContextHolder.getLocale();
        return languageService.findByCode(locale.getLanguage());

    }

    public Set<Language> getAllLanguages() {
        Set<Language> list = new HashSet<>();
        list.addAll(languageService.findAll());
        return list;

    }




}
