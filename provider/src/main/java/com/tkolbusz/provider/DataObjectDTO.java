
package com.tkolbusz.provider;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class DataObjectDTO {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("dataset")
    @Expose
    private String dataset;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("mp_url")
    @Expose
    private String mpUrl;
    @SerializedName("schema_url")
    @Expose
    private String schemaUrl;
    @SerializedName("global_id")
    @Expose
    private String globalId;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("dataDTO")
    @Expose
    private DataDTO dataDTO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public DataDTO getDataDTO() {
        return dataDTO;
    }

    public void setDataDTO(DataDTO dataDTO) {
        this.dataDTO = dataDTO;
    }

}
