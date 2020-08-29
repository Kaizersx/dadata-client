package com.kuliginstepan.dadata.client.domain.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kuliginstepan.dadata.client.domain.BasicRequest;
import com.kuliginstepan.dadata.client.domain.OrganizationStatus;
import com.kuliginstepan.dadata.client.domain.address.FilterProperty;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @see <a href="https://confluence.hflabs.ru/pages/viewpage.action?pageId=204669122">Dadata organization suggestion
 * docs</a>
 * @see com.kuliginstepan.dadata.client.domain.organization.OrganizationRequestBuilder
 */

@Value
@EqualsAndHashCode(callSuper = true)
public class OrganizationRequest extends BasicRequest {

    @JsonProperty("locations_boost")
    List<Map<FilterProperty, String>> locationsBoost;
    List<Map<FilterProperty, String>> locations;
    @JsonProperty("status")
    Set<OrganizationStatus> statuses;
    OrganizationType type;
    @JsonProperty("branch_type")
    BranchType branchType;

    public OrganizationRequest(String query,
        Integer count,
        List<Map<FilterProperty, String>> locationsBoost,
        List<Map<FilterProperty, String>> locations, Set<OrganizationStatus> statuses,
        OrganizationType type, BranchType branchType) {
        super(query, count);
        this.locationsBoost = locationsBoost;
        this.locations = locations;
        this.statuses = statuses;
        this.type = type;
        this.branchType = branchType;
    }
}
