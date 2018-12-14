package com.dzdp.pojo;

import java.util.Date;

/**
 * Created by chongyang.gao on 2018/12/14.
 */
public class Journal {

    private String clientOs;
    private String clientOsVersion;
    private String clientVersion;
    private String clientVersionName;
    private String clientVersionCode;
    private String deviceUuid;
    private String deviceModel;
    private String deviceBrand;
    private String clientMarket;
    private String deviceMac;
    private String userId;
    private Date timestamp;

    public String getClientOs() {
        return clientOs;
    }

    public void setClientOs(String clientOs) {
        this.clientOs = clientOs;
    }

    public String getClientOsVersion() {
        return clientOsVersion;
    }

    public void setClientOsVersion(String clientOsVersion) {
        this.clientOsVersion = clientOsVersion;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getClientVersionName() {
        return clientVersionName;
    }

    public void setClientVersionName(String clientVersionName) {
        this.clientVersionName = clientVersionName;
    }

    public String getClientVersionCode() {
        return clientVersionCode;
    }

    public void setClientVersionCode(String clientVersionCode) {
        this.clientVersionCode = clientVersionCode;
    }

    public String getDeviceUuid() {
        return deviceUuid;
    }

    public void setDeviceUuid(String deviceUuid) {
        this.deviceUuid = deviceUuid;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getClientMarket() {
        return clientMarket;
    }

    public void setClientMarket(String clientMarket) {
        this.clientMarket = clientMarket;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
