package com.cortez.willie.i18n.config;

import com.cortez.willie.i18n.domain.Language;
import com.cortez.willie.i18n.repository.LanguageRepository;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Locale;

@Component("messages")
public class DBMessageSource extends AbstractMessageSource {

    private final LanguageRepository languageRepository;
    private static final String DEFAULT_LOCALE_CODE = "en";


    public DBMessageSource(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    protected MessageFormat resolveCode(String key, Locale locale) {
        Language message = languageRepository.findByKeyAndLocale(key,locale.getLanguage());
        if (message == null) {
            message = languageRepository.findByKeyAndLocale(key,DEFAULT_LOCALE_CODE);
        }
        return new MessageFormat(message.getContent(), locale);
    }
}
