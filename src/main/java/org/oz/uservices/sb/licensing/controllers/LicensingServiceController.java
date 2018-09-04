package org.oz.uservices.sb.licensing.controllers;

import org.oz.uservices.sb.licensing.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicensingServiceController {
	@RequestMapping(path = "/{licenseId}", method = RequestMethod.GET)
	public License getLicences(@PathVariable String organizationId, @PathVariable String licenseId) {
		return new License().
				withId(licenseId).
				withProductName("Telco").
				withLicenceType("Seat").
				withOrganizationId(organizationId);
	}
}
