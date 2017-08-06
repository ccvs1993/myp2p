package com.wang.p2p.base.domain;

public class Userinfo extends BaseDomain{

    private int version; // 版本号,用于乐观锁
    private long bitState = 0; // 用户状态码
    private String realName;
    private String idNumber;
    private String phoneNumber;
    private String email;

    private SystemDictionaryItem incomeGrade; // 收入
    private SystemDictionaryItem Marriage; // 婚姻情况
    private SystemDictionaryItem kidCount; // 子女情况
    private SystemDictionaryItem educationBackground; // 学历
    private SystemDictionaryItem houseCondition; // 住房条件

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getBitState() {
        return bitState;
    }

    public void setBitState(long bitState) {
        this.bitState = bitState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SystemDictionaryItem getIncomeGrade() {
        return incomeGrade;
    }

    public void setIncomeGrade(SystemDictionaryItem incomeGrade) {
        this.incomeGrade = incomeGrade;
    }

    public SystemDictionaryItem getMarriage() {
        return Marriage;
    }

    public void setMarriage(SystemDictionaryItem marriage) {
        Marriage = marriage;
    }

    public SystemDictionaryItem getKidCount() {
        return kidCount;
    }

    public void setKidCount(SystemDictionaryItem kidCount) {
        this.kidCount = kidCount;
    }

    public SystemDictionaryItem getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(SystemDictionaryItem educationBackground) {
        this.educationBackground = educationBackground;
    }

    public SystemDictionaryItem getHouseCondition() {
        return houseCondition;
    }

    public void setHouseCondition(SystemDictionaryItem houseCondition) {
        this.houseCondition = houseCondition;
    }
}
