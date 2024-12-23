package com.easy.erp.service.impl;

import com.easy.erp.entity.Language;
import com.easy.erp.repository.LanguageRepository;
import com.easy.erp.service.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public Language findByCode(String language) {
        return languageRepository.findByLangCode(language);
    }

    public List<Language> findAll(){
        return languageRepository.findAll();
    }
}
