package org.oz.uservices.sb.licensing.model;

public class License {
	private String id;
	private String productName;
	private String licenseType;
	private String organizationId;
	
	public License withId(String id) {
		this.id = id;
		return this;
	}
	
	public License withProductName(String name) {
		this.productName = name;
		return this;
	}
	
	public License withLicenceType(String type) {
		this.licenseType = type;
		return this;
	}
	
	public License withOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
}
