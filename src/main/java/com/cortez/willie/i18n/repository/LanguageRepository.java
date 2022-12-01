package com.cortez.willie.i18n.repository;

import com.cortez.willie.i18n.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {

    Language findByKeyAndLocale(String key, String locale);

}