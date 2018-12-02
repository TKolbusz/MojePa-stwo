
package com.tkolbusz.provider;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class DataResponseDTO {

    @SerializedName("DataObjectDTO")
    @Expose
    private List<DataObjectDTO> dataObjectDTO = null;
    @SerializedName("Count")
    @Expose
    private Integer count;
    @SerializedName("Took")
    @Expose
    private Integer took;
    @SerializedName("LinksDTO")
    @Expose
    private LinksDTO linksDTO;

    public List<DataObjectDTO> getDataObjectDTO() {
        return dataObjectDTO;
    }

    public void setDataObjectDTO(List<DataObjectDTO> dataObjectDTO) {
        this.dataObjectDTO = dataObjectDTO;
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
        return linksDTO;
    }

    public void setLinksDTO(LinksDTO linksDTO) {
        this.linksDTO = linksDTO;
    }

}
