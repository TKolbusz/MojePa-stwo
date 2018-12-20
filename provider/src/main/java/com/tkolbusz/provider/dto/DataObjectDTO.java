package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

public class DataObjectDTO {

    @SerializedName("id")
    private Integer id;
    @SerializedName("dataset")
    private String dataset;
    @SerializedName("url")
    private String url;
    @SerializedName("mp_url")
    private String mpUrl;
    @SerializedName("schema_url")
    private String schemaUrl;
    @SerializedName("global_id")
    private String globalId;
    @SerializedName("slug")
    private String slug;
    @SerializedName("score")
    private Double score;
    @SerializedName("data")
    private CompanyDTO data;
    @SerializedName("layers")
    private LayersDTO layers;

    public LayersDTO getLayers() {
        return layers;
    }

    public void setLayers(LayersDTO layers) {
        this.layers = layers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMpUrl() {
        return mpUrl;
    }

    public void setMpUrl(String mpUrl) {
        this.mpUrl = mpUrl;
    }

    public String getSchemaUrl() {
        return schemaUrl;
    }

    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public CompanyDTO getDataDTO() {
        return data;
    }

    public void setDataDTO(CompanyDTO companyDTO) {
        this.data = companyDTO;
    }

}
