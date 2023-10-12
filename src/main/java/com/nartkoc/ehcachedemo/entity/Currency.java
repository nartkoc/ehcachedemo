package com.nartkoc.ehcachedemo.entity;

import java.util.UUID;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "currency")
public class Currency {

	@Id
	@Column(name = "currencyUuid", nullable = false, unique = true)
	private UUID currencyUuid;

	@Column(name = "languageUuid", nullable = false)
	private UUID languageUuid;

	@Column(name = "currencyCode", length = 4, nullable = false)
	private String currencyCode;

	@Column(name = "currencySymbol", length = 8, nullable = false)
	private String currencySymbol;

	@Column(name = "currencyName", length = 16, nullable = false)
	private String currencyName;

	@Column(name = "currencyImage", length = 64, nullable = false)
	private String currencyImage;

	@JsonIgnore
	@Column(name = "isDeleted", nullable = false)
	private Boolean isDeleted;

	public UUID getCurrencyUuid() {
		return this.currencyUuid;
	}

	public Currency currencyUuid(UUID currencyUuid) {
		this.setCurrencyUuid(currencyUuid);
		return this;
	}

	public void setCurrencyUuid(UUID currencyUuid) {
		this.currencyUuid = currencyUuid;
	}

	public UUID getLanguageUuid() {
		return this.languageUuid;
	}

	public Currency languageUuid(UUID languageUuid) {
		this.setLanguageUuid(languageUuid);
		return this;
	}

	public void setLanguageUuid(UUID languageUuid) {
		this.languageUuid = languageUuid;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public Currency currencyCode(String currencyCode) {
		this.setCurrencyCode(currencyCode);
		return this;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public Currency currencyName(String currencyName) {
		this.setCurrencyName(currencyName);
		return this;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyImage() {
		return this.currencyImage;
	}

	public Currency currencyImage(String currencyImage) {
		this.setCurrencyImage(currencyImage);
		return this;
	}

	public void setCurrencyImage(String currencyImage) {
		this.currencyImage = currencyImage;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public Currency isDeleted(Boolean isDeleted) {
		this.setIsDeleted(isDeleted);
		return this;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
