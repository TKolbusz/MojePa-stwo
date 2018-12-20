package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LayersDTO {

    @SerializedName("dataset")
    private Object dataset;
    @SerializedName("channels")
    private Object channels;
    @SerializedName("page")
    private Object page;
    @SerializedName("subscribers")
    private Object subscribers;
    @SerializedName("reprezentacja")
    private List<ManagementDTO> reprezentacja = null;
    @SerializedName("wspolnicy")
    private List<ShareholderDTO> wspolnicy = null;

    public Object getDataset() {
        return dataset;
    }

    public void setDataset(Object dataset) {
        this.dataset = dataset;
    }

    public Object getChannels() {
        return channels;
    }

    public void setChannels(Object channels) {
        this.channels = channels;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }

    public Object getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Object subscribers) {
        this.subscribers = subscribers;
    }

    public List<ManagementDTO> getReprezentacja() {
        return reprezentacja;
    }

    public void setReprezentacja(List<ManagementDTO> reprezentacja) {
        this.reprezentacja = reprezentacja;
    }

    public List<ShareholderDTO> getWspolnicy() {
        return wspolnicy;
    }

    public void setWspolnicy(List<ShareholderDTO> wspolnicy) {
        this.wspolnicy = wspolnicy;
    }
}