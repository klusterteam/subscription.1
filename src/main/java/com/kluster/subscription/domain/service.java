package com.kluster.subscription.domain;

public class service {

    public String subCode;
    public String subName;
    public String subUrl;
    public String subDescription;
    public String subThumbnail;

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubUrl() {
        return subUrl;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    public String getSubDescription() {
        return subDescription;
    }

    public void setSubDescription(String subDescription) {
        this.subDescription = subDescription;
    }

    public String getSubThumbnail() {
        return subThumbnail;
    }

    public void setSubThumbnail(String subThumbnail) {
        this.subThumbnail = subThumbnail;
    }

    @Override
    public String toString() {
        return "service{" +
                "subCode='" + subCode + '\'' +
                ", subName='" + subName + '\'' +
                ", subUrl='" + subUrl + '\'' +
                ", subDescription='" + subDescription + '\'' +
                ", subThumbnail='" + subThumbnail + '\'' +
                '}';
    }
}
