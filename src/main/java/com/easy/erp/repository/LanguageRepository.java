package com.easy.erp.repository;


import com.easy.erp.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {
    Language findByLangCode(String langCode);
    @Query("select model from Language model where model.activeStatus = true")
    @NonNull
    List<Language> findAll();
}
