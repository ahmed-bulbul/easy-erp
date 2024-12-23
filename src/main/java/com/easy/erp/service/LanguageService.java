package com.easy.erp.service;

import com.easy.erp.entity.Language;

import java.util.List;


public interface LanguageService {

    public Language findByCode(String language);
    List<Language> findAll();

}
