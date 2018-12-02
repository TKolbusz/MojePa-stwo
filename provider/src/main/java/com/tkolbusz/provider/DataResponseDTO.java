
package com.tkolbusz.provider;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class DataResponseDTO {

    @SerializedName("Dataobject")
    @Expose
    private List<DataObjectDTO> dataObject;
    @SerializedName("Count")
    @Expose
    private Integer count;
    @SerializedName("Took")
    @Expose
    private Integer took;
    @SerializedName("Links")
    @Expose
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
