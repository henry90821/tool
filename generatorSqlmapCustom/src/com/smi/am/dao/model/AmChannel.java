package com.smi.am.dao.model;

public class AmChannel {
    private Integer cId;

    private String cChannelname;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcChannelname() {
        return cChannelname;
    }

    public void setcChannelname(String cChannelname) {
        this.cChannelname = cChannelname == null ? null : cChannelname.trim();
    }
}