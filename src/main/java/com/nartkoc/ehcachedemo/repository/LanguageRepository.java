package com.nartkoc.ehcachedemo.repository;

import com.nartkoc.ehcachedemo.entity.Language;

import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

	Language findByLanguageUuid(UUID languageUuid);

}
