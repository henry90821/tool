package com.smi.am.dao.model;

import java.util.Date;

public class AmGiftPackage {
    private Integer gpId;

    private String gpName;

    private Integer gpDeliveringway;

    private String gpChannel;

    private String gpSendnum;

    private String gpActivityarea;

    private String gpActivityzone;

    private String gpActivityshop;

    private Date gpStarttime;

    private Date gpEndtime;

    private Integer gpProvideall;

    private String gpStatus;

    private Date gpCreatedate;

    private String gpCreateuser;

    private Date gpLastmoddate;

    private String gpLastmoduser;

    private String gpRemark;

    private Integer gpIsdetele;

    private Integer gpRemainnum;

    private byte[] gpProvideuser;

    public Integer getGpId() {
        return gpId;
    }

    public void setGpId(Integer gpId) {
        this.gpId = gpId;
    }

    public String getGpName() {
        return gpName;
    }

    public void setGpName(String gpName) {
        this.gpName = gpName == null ? null : gpName.trim();
    }

    public Integer getGpDeliveringway() {
        return gpDeliveringway;
    }

    public void setGpDeliveringway(Integer gpDeliveringway) {
        this.gpDeliveringway = gpDeliveringway;
    }

    public String getGpChannel() {
        return gpChannel;
    }

    public void setGpChannel(String gpChannel) {
        this.gpChannel = gpChannel == null ? null : gpChannel.trim();
    }

    public String getGpSendnum() {
        return gpSendnum;
    }

    public void setGpSendnum(String gpSendnum) {
        this.gpSendnum = gpSendnum == null ? null : gpSendnum.trim();
    }

    public String getGpActivityarea() {
        return gpActivityarea;
    }

    public void setGpActivityarea(String gpActivityarea) {
        this.gpActivityarea = gpActivityarea == null ? null : gpActivityarea.trim();
    }

    public String getGpActivityzone() {
        return gpActivityzone;
    }

    public void setGpActivityzone(String gpActivityzone) {
        this.gpActivityzone = gpActivityzone == null ? null : gpActivityzone.trim();
    }

    public String getGpActivityshop() {
        return gpActivityshop;
    }

    public void setGpActivityshop(String gpActivityshop) {
        this.gpActivityshop = gpActivityshop == null ? null : gpActivityshop.trim();
    }

    public Date getGpStarttime() {
        return gpStarttime;
    }

    public void setGpStarttime(Date gpStarttime) {
        this.gpStarttime = gpStarttime;
    }

    public Date getGpEndtime() {
        return gpEndtime;
    }

    public void setGpEndtime(Date gpEndtime) {
        this.gpEndtime = gpEndtime;
    }

    public Integer getGpProvideall() {
        return gpProvideall;
    }

    public void setGpProvideall(Integer gpProvideall) {
        this.gpProvideall = gpProvideall;
    }

    public String getGpStatus() {
        return gpStatus;
    }

    public void setGpStatus(String gpStatus) {
        this.gpStatus = gpStatus == null ? null : gpStatus.trim();
    }

    public Date getGpCreatedate() {
        return gpCreatedate;
    }

    public void setGpCreatedate(Date gpCreatedate) {
        this.gpCreatedate = gpCreatedate;
    }

    public String getGpCreateuser() {
        return gpCreateuser;
    }

    public void setGpCreateuser(String gpCreateuser) {
        this.gpCreateuser = gpCreateuser == null ? null : gpCreateuser.trim();
    }

    public Date getGpLastmoddate() {
        return gpLastmoddate;
    }

    public void setGpLastmoddate(Date gpLastmoddate) {
        this.gpLastmoddate = gpLastmoddate;
    }

    public String getGpLastmoduser() {
        return gpLastmoduser;
    }

    public void setGpLastmoduser(String gpLastmoduser) {
        this.gpLastmoduser = gpLastmoduser == null ? null : gpLastmoduser.trim();
    }

    public String getGpRemark() {
        return gpRemark;
    }

    public void setGpRemark(String gpRemark) {
        this.gpRemark = gpRemark == null ? null : gpRemark.trim();
    }

    public Integer getGpIsdetele() {
        return gpIsdetele;
    }

    public void setGpIsdetele(Integer gpIsdetele) {
        this.gpIsdetele = gpIsdetele;
    }

    public Integer getGpRemainnum() {
        return gpRemainnum;
    }

    public void setGpRemainnum(Integer gpRemainnum) {
        this.gpRemainnum = gpRemainnum;
    }

    public byte[] getGpProvideuser() {
        return gpProvideuser;
    }

    public void setGpProvideuser(byte[] gpProvideuser) {
        this.gpProvideuser = gpProvideuser;
    }
}