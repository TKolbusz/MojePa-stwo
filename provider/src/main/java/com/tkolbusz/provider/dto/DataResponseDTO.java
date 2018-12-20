package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponseDTO {

    @SerializedName("Dataobject")
    private List<DataObjectDTO> dataObject;
    @SerializedName("Count")
    private Integer count;
    @SerializedName("Took")
    private Integer took;
    @SerializedName("Links")
    private LinksDTO links;

    public List<DataObjectDTO> getDataObjectDTO() {
        return dataObject;
    }

    public void setDataObjectDTO(List<DataObjectDTO> dataObject) {
        this.dataObject = dataObject;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public LinksDTO getLinksDTO() {
        return links;
    }

    public void setLinksDTO(LinksDTO links) {
        this.links = links;
    }

}
