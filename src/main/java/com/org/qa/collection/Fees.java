package com.org.qa.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Bundle",
        "EndDate",
        "Feature",
        "Gallery",
        "Listing",
        "Reserve",
        "Subtitle",
        "TenDays",
        "ListingFeeTiers",
        "SecondCategory"
})
public class Fees {

    @JsonProperty("Bundle")
    private Double bundle;
    @JsonProperty("EndDate")
    private Double endDate;
    @JsonProperty("Feature")
    private Double feature;
    @JsonProperty("Gallery")
    private Double gallery;
    @JsonProperty("Listing")
    private Double listing;
    @JsonProperty("Reserve")
    private Double reserve;
    @JsonProperty("Subtitle")
    private Double subtitle;
    @JsonProperty("TenDays")
    private Double tenDays;
    @JsonProperty("ListingFeeTiers")
    private ArrayList<ListingFeeTier> listingFeeTiers = new ArrayList<>();
    @JsonProperty("SecondCategory")
    private Double secondCategory;

    /**
     * No args constructor for use in serialization
     */
    public Fees() {
    }

    /**
     * @param feature
     * @param secondCategory
     * @param endDate
     * @param listingFeeTiers
     * @param subtitle
     * @param reserve
     * @param listing
     * @param bundle
     * @param gallery
     * @param tenDays
     */
    public Fees(Double bundle, Double endDate, Double feature, Double gallery, Double listing, Double reserve, Double subtitle, Double tenDays, ArrayList<ListingFeeTier> listingFeeTiers, Double secondCategory) {
        super();
        this.bundle = bundle;
        this.endDate = endDate;
        this.feature = feature;
        this.gallery = gallery;
        this.listing = listing;
        this.reserve = reserve;
        this.subtitle = subtitle;
        this.tenDays = tenDays;
        this.listingFeeTiers = listingFeeTiers;
        this.secondCategory = secondCategory;
    }

    @JsonProperty("Bundle")
    public Double getBundle() {
        return bundle;
    }

    @JsonProperty("Bundle")
    public void setBundle(Double bundle) {
        this.bundle = bundle;
    }

    @JsonProperty("EndDate")
    public Double getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Double endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Feature")
    public Double getFeature() {
        return feature;
    }

    @JsonProperty("Feature")
    public void setFeature(Double feature) {
        this.feature = feature;
    }

    @JsonProperty("Gallery")
    public Double getGallery() {
        return gallery;
    }

    @JsonProperty("Gallery")
    public void setGallery(Double gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("Listing")
    public Double getListing() {
        return listing;
    }

    @JsonProperty("Listing")
    public void setListing(Double listing) {
        this.listing = listing;
    }

    @JsonProperty("Reserve")
    public Double getReserve() {
        return reserve;
    }

    @JsonProperty("Reserve")
    public void setReserve(Double reserve) {
        this.reserve = reserve;
    }

    @JsonProperty("Subtitle")
    public Double getSubtitle() {
        return subtitle;
    }

    @JsonProperty("Subtitle")
    public void setSubtitle(Double subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("TenDays")
    public Double getTenDays() {
        return tenDays;
    }

    @JsonProperty("TenDays")
    public void setTenDays(Double tenDays) {
        this.tenDays = tenDays;
    }

    @JsonProperty("ListingFeeTiers")
    public ArrayList<ListingFeeTier> getListingFeeTiers() {
        return listingFeeTiers;
    }

    @JsonProperty("ListingFeeTiers")
    public void setListingFeeTiers(ArrayList<ListingFeeTier> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    @JsonProperty("SecondCategory")
    public Double getSecondCategory() {
        return secondCategory;
    }

    @JsonProperty("SecondCategory")
    public void setSecondCategory(Double secondCategory) {
        this.secondCategory = secondCategory;
    }

}