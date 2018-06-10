package com.hgg.po;

import java.util.Date;

public class User {
    private String userId;
    private String loginAccount;
    private String loginPassword;
    private String bindEmail;
    private String bindMobile;
    private String nickName;
    private String avatarUrl;
    private Integer userType;
    private Integer userState;
    private String thirdPartyOpenId;
    private String thirdPartyType;
    private Integer shortId;
    private Integer recordState;
    private Date createTime;
    private Date updateTime;
    private String lastOperator;
    private String lastOperatorIp;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getBindEmail() {
        return bindEmail;
    }

    public void setBindEmail(String bindEmail) {
        this.bindEmail = bindEmail;
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getThirdPartyOpenId() {
        return thirdPartyOpenId;
    }

    public void setThirdPartyOpenId(String thirdPartyOpenId) {
        this.thirdPartyOpenId = thirdPartyOpenId;
    }

    public String getThirdPartyType() {
        return thirdPartyType;
    }

    public void setThirdPartyType(String thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
    }

    public Integer getShortId() {
        return shortId;
    }

    public void setShortId(Integer shortId) {
        this.shortId = shortId;
    }

    public Integer getRecordState() {
        return recordState;
    }

    public void setRecordState(Integer recordState) {
        this.recordState = recordState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    public String getLastOperatorIp() {
        return lastOperatorIp;
    }

    public void setLastOperatorIp(String lastOperatorIp) {
        this.lastOperatorIp = lastOperatorIp;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", loginAccount='" + loginAccount + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", bindEmail='" + bindEmail + '\'' +
                ", bindMobile='" + bindMobile + '\'' +
                ", nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", userType=" + userType +
                ", userState=" + userState +
                ", thirdPartyOpenId='" + thirdPartyOpenId + '\'' +
                ", thirdPartyType='" + thirdPartyType + '\'' +
                ", shortId=" + shortId +
                ", recordState=" + recordState +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", lastOperator='" + lastOperator + '\'' +
                ", lastOperatorIp='" + lastOperatorIp + '\'' +
                '}';
    }
}
