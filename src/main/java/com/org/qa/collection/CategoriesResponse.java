package com.org.qa.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class CategoriesResponse {

    @JsonProperty("CategoryId")
    private Integer categoryId;

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions = false;
    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds = false;
    @JsonProperty("CanRelist")
    private Boolean canRelist = false;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private Integer defaultDuration;
    @JsonProperty("FreePhotoCount")
    private Integer freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private Integer maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist = false;
    @JsonProperty("MaximumTitleLength")
    private Integer maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private Integer areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private Integer defaultRelistDuration;
    @JsonProperty("CanUseCounterOffers")
    private Boolean canUseCounterOffers = false;


    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions = null;
    @JsonProperty("AllowedDurations")
    private ArrayList<Integer> allowedDurations = new ArrayList<>();
    @JsonProperty("Promotions")
    private ArrayList<Promotion> promotions = new ArrayList<>();
    @JsonProperty("Fees")
    private ArrayList<Fees> fees = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     */
    public CategoriesResponse() {
    }

    /**
     * @param fees
     * @param canRelist
     * @param freePhotoCount
     * @param defaultDuration
     * @param areaOfBusiness
     * @param canListClassifieds
     * @param legalNotice
     * @param embeddedContentOptions
     * @param path
     * @param promotions
     * @param defaultRelistDuration
     * @param maximumPhotoCount
     * @param canUseCounterOffers
     * @param name
     * @param canListAuctions
     * @param allowedDurations
     * @param categoryId
     * @param isFreeToRelist
     * @param maximumTitleLength
     */
    public CategoriesResponse(Integer categoryId, String name, String path, Boolean canListAuctions, Boolean canListClassifieds, Boolean canRelist, String legalNotice, Integer defaultDuration, ArrayList<Integer> allowedDurations, ArrayList<Fees> fees, Integer freePhotoCount, Integer maximumPhotoCount, Boolean isFreeToRelist, ArrayList<Promotion> promotions, List<Object> embeddedContentOptions, Integer maximumTitleLength, Integer areaOfBusiness, Integer defaultRelistDuration, Boolean canUseCounterOffers) {
        super();
        this.categoryId = categoryId;
        this.name = name;
        this.path = path;
        this.canListAuctions = canListAuctions;
        this.canListClassifieds = canListClassifieds;
        this.canRelist = canRelist;
        this.legalNotice = legalNotice;
        this.defaultDuration = defaultDuration;
        this.allowedDurations = allowedDurations;
        this.fees = fees;
        this.freePhotoCount = freePhotoCount;
        this.maximumPhotoCount = maximumPhotoCount;
        this.isFreeToRelist = isFreeToRelist;
        this.promotions = promotions;
        this.embeddedContentOptions = embeddedContentOptions;
        this.maximumTitleLength = maximumTitleLength;
        this.areaOfBusiness = areaOfBusiness;
        this.defaultRelistDuration = defaultRelistDuration;
        this.canUseCounterOffers = canUseCounterOffers;
    }


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("CanListAuctions")
    public Boolean getCanListAuctions() {
        return canListAuctions;
    }

    @JsonProperty("CanListAuctions")
    public void setCanListAuctions(Boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    @JsonProperty("CanListClassifieds")
    public Boolean getCanListClassifieds() {
        return canListClassifieds;
    }

    @JsonProperty("CanListClassifieds")
    public void setCanListClassifieds(Boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    @JsonProperty("CanRelist")
    public Boolean getCanRelist() {
        return canRelist;
    }

    @JsonProperty("CanRelist")
    public void setCanRelist(Boolean canRelist) {
        this.canRelist = canRelist;
    }

    @JsonProperty("LegalNotice")
    public String getLegalNotice() {
        return legalNotice;
    }

    @JsonProperty("LegalNotice")
    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    @JsonProperty("DefaultDuration")
    public Integer getDefaultDuration() {
        return defaultDuration;
    }

    @JsonProperty("DefaultDuration")
    public void setDefaultDuration(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    @JsonProperty("AllowedDurations")
    public ArrayList<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    @JsonProperty("AllowedDurations")
    public void setAllowedDurations(ArrayList<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    @JsonProperty("Fees")
    public ArrayList<Fees> getFees() {
        return fees;
    }

    @JsonProperty("Fees")
    public void setFees(ArrayList<Fees> fees) {
        this.fees = fees;
    }

    @JsonProperty("FreePhotoCount")
    public Integer getFreePhotoCount() {
        return freePhotoCount;
    }

    @JsonProperty("FreePhotoCount")
    public void setFreePhotoCount(Integer freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public Integer getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public void setMaximumPhotoCount(Integer maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    @JsonProperty("IsFreeToRelist")
    public Boolean getIsFreeToRelist() {
        return isFreeToRelist;
    }

    @JsonProperty("IsFreeToRelist")
    public void setIsFreeToRelist(Boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
    }

    @JsonProperty("Promotions")
    public ArrayList<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("Promotions")
    public void setPromotions(ArrayList<Promotion> promotions) {
        this.promotions = promotions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public List<Object> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public void setEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    @JsonProperty("MaximumTitleLength")
    public Integer getMaximumTitleLength() {
        return maximumTitleLength;
    }

    @JsonProperty("MaximumTitleLength")
    public void setMaximumTitleLength(Integer maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    @JsonProperty("AreaOfBusiness")
    public Integer getAreaOfBusiness() {
        return areaOfBusiness;
    }

    @JsonProperty("AreaOfBusiness")
    public void setAreaOfBusiness(Integer areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    @JsonProperty("DefaultRelistDuration")
    public Integer getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    @JsonProperty("DefaultRelistDuration")
    public void setDefaultRelistDuration(Integer defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    @JsonProperty("CanUseCounterOffers")
    public Boolean getCanUseCounterOffers() {
        return canUseCounterOffers;
    }

    @JsonProperty("CanUseCounterOffers")
    public void setCanUseCounterOffers(Boolean canUseCounterOffers) {
        this.canUseCounterOffers = canUseCounterOffers;
    }

}