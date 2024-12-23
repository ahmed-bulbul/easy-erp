package com.easy.erp.config;



import com.easy.erp.entity.Language;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SessionManager {
    private final LanguageManager languageManager;

    public SessionManager(LanguageManager languageManager) {
        this.languageManager = languageManager;
    }


    public void setLanguage(HttpSession session) {
        Set<Language> languageList = languageManager.getAllLanguages();

        session.setAttribute("languages", languageManager.getAllLanguages());
    }

}
