package com.org.qa.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MinimumTierPrice",
        "FixedFee"
})

public class ListingFeeTier {

    @JsonProperty("MinimumTierPrice")
    private Integer minimumTierPrice;
    @JsonProperty("FixedFee")
    private Double fixedFee;

    /**
     * No args constructor for use in serialization
     */
    public ListingFeeTier() {
    }

    /**
     * @param minimumTierPrice
     * @param fixedFee
     */
    public ListingFeeTier(Integer minimumTierPrice, Double fixedFee) {
        super();
        this.minimumTierPrice = minimumTierPrice;
        this.fixedFee = fixedFee;
    }

    @JsonProperty("MinimumTierPrice")
    public Integer getMinimumTierPrice() {
        return minimumTierPrice;
    }

    @JsonProperty("MinimumTierPrice")
    public void setMinimumTierPrice(Integer minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    @JsonProperty("FixedFee")
    public Double getFixedFee() {
        return fixedFee;
    }

    @JsonProperty("FixedFee")
    public void setFixedFee(Double fixedFee) {
        this.fixedFee = fixedFee;
    }

}