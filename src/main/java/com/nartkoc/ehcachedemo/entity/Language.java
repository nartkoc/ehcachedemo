package com.nartkoc.ehcachedemo.entity;

import java.util.UUID;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "language")
public class Language {

	@Id
	@Column(name = "languageUuid", nullable = false, unique = true)
	private UUID languageUuid;

	@Column(name = "languageCode", length = 4, nullable = false)
	private String languageCode;

	@Column(name = "languageName", length = 16, nullable = false)
	private String languageName;

	@Column(name = "languageImage", length = 64, nullable = false)
	private String languageImage;

	@JsonIgnore
	@Column(name = "isDeleted", nullable = false)
	private Boolean isDeleted;

	public UUID getLanguageUuid() {
		return this.languageUuid;
	}

	public Language languageUuid(UUID languageUuid) {
		this.setLanguageUuid(languageUuid);
		return this;
	}

	public void setLanguageUuid(UUID languageUuid) {
		this.languageUuid = languageUuid;
	}

	public String getLanguageCode() {
		return this.languageCode;
	}

	public Language languageCode(String languageCode) {
		this.setLanguageCode(languageCode);
		return this;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageName() {
		return this.languageName;
	}

	public Language languageName(String languageName) {
		this.setLanguageName(languageName);
		return this;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageImage() {
		return this.languageImage;
	}

	public Language languageImage(String languageImage) {
		this.setLanguageImage(languageImage);
		return this;
	}

	public void setLanguageImage(String languageImage) {
		this.languageImage = languageImage;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public Language isDeleted(Boolean isDeleted) {
		this.setIsDeleted(isDeleted);
		return this;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
