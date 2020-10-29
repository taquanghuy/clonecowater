package com.pigllet.clonecowater.ultis;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Project {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("main_partner")
    @Expose
    private String mainPartner;
    @SerializedName("sub_partner")
    @Expose
    private Object subPartner;
    @SerializedName("partner_id")
    @Expose
    private String partnerId;
    @SerializedName("sub_partner_id")
    @Expose
    private Object subPartnerId;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("pm")
    @Expose
    private String pm;
    @SerializedName("sector")
    @Expose
    private Integer sector;
    @SerializedName("province_id")
    @Expose
    private Integer provinceId;
    @SerializedName("district_id")
    @Expose
    private Object districtId;
    @SerializedName("commune_id")
    @Expose
    private Object communeId;
    @SerializedName("village_id")
    @Expose
    private Object villageId;
    @SerializedName("fund_scheme")
    @Expose
    private String fundScheme;
    @SerializedName("budget_aud")
    @Expose
    private String budgetAud;
    @SerializedName("budget_vnd")
    @Expose
    private String budgetVnd;
    @SerializedName("exchange_rate")
    @Expose
    private String exchangeRate;
    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("great_outcome")
    @Expose
    private String greatOutcome;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("objective_1")
    @Expose
    private Integer objective1;
    @SerializedName("objective_2")
    @Expose
    private Integer objective2;
    @SerializedName("objective_3")
    @Expose
    private Integer objective3;
    @SerializedName("objective_1_value")
    @Expose
    private Object objective1Value;
    @SerializedName("objective_2_value")
    @Expose
    private Object objective2Value;
    @SerializedName("objective_3_value")
    @Expose
    private Object objective3Value;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("type_great")
    @Expose
    private Integer typeGreat;
    @SerializedName("type_partner")
    @Expose
    private Integer typePartner;
    @SerializedName("note")
    @Expose
    private Object note;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("finance_status")
    @Expose
    private Integer financeStatus;
    @SerializedName("business_report")
    @Expose
    private String businessReport;
    @SerializedName("userList")
    @Expose
    private List<UserList> userList = null;
    @SerializedName("productList")
    @Expose
    private List<ProductList> productList = null;
    @SerializedName("userPm")
    @Expose
    private List<UserPm> userPm = null;
    @SerializedName("communeList")
    @Expose
    private List<Object> communeList = null;
    @SerializedName("villageList")
    @Expose
    private List<Object> villageList = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMainPartner() {
        return mainPartner;
    }

    public void setMainPartner(String mainPartner) {
        this.mainPartner = mainPartner;
    }

    public Object getSubPartner() {
        return subPartner;
    }

    public void setSubPartner(Object subPartner) {
        this.subPartner = subPartner;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Object getSubPartnerId() {
        return subPartnerId;
    }

    public void setSubPartnerId(Object subPartnerId) {
        this.subPartnerId = subPartnerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public Integer getSector() {
        return sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Object getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Object districtId) {
        this.districtId = districtId;
    }

    public Object getCommuneId() {
        return communeId;
    }

    public void setCommuneId(Object communeId) {
        this.communeId = communeId;
    }

    public Object getVillageId() {
        return villageId;
    }

    public void setVillageId(Object villageId) {
        this.villageId = villageId;
    }

    public String getFundScheme() {
        return fundScheme;
    }

    public void setFundScheme(String fundScheme) {
        this.fundScheme = fundScheme;
    }

    public String getBudgetAud() {
        return budgetAud;
    }

    public void setBudgetAud(String budgetAud) {
        this.budgetAud = budgetAud;
    }

    public String getBudgetVnd() {
        return budgetVnd;
    }

    public void setBudgetVnd(String budgetVnd) {
        this.budgetVnd = budgetVnd;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getGreatOutcome() {
        return greatOutcome;
    }

    public void setGreatOutcome(String greatOutcome) {
        this.greatOutcome = greatOutcome;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getObjective1() {
        return objective1;
    }

    public void setObjective1(Integer objective1) {
        this.objective1 = objective1;
    }

    public Integer getObjective2() {
        return objective2;
    }

    public void setObjective2(Integer objective2) {
        this.objective2 = objective2;
    }

    public Integer getObjective3() {
        return objective3;
    }

    public void setObjective3(Integer objective3) {
        this.objective3 = objective3;
    }

    public Object getObjective1Value() {
        return objective1Value;
    }

    public void setObjective1Value(Object objective1Value) {
        this.objective1Value = objective1Value;
    }

    public Object getObjective2Value() {
        return objective2Value;
    }

    public void setObjective2Value(Object objective2Value) {
        this.objective2Value = objective2Value;
    }

    public Object getObjective3Value() {
        return objective3Value;
    }

    public void setObjective3Value(Object objective3Value) {
        this.objective3Value = objective3Value;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTypeGreat() {
        return typeGreat;
    }

    public void setTypeGreat(Integer typeGreat) {
        this.typeGreat = typeGreat;
    }

    public Integer getTypePartner() {
        return typePartner;
    }

    public void setTypePartner(Integer typePartner) {
        this.typePartner = typePartner;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getFinanceStatus() {
        return financeStatus;
    }

    public void setFinanceStatus(Integer financeStatus) {
        this.financeStatus = financeStatus;
    }

    public String getBusinessReport() {
        return businessReport;
    }

    public void setBusinessReport(String businessReport) {
        this.businessReport = businessReport;
    }

    public List<UserList> getUserList() {
        return userList;
    }

    public void setUserList(List<UserList> userList) {
        this.userList = userList;
    }

    public List<ProductList> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductList> productList) {
        this.productList = productList;
    }

    public List<UserPm> getUserPm() {
        return userPm;
    }

    public void setUserPm(List<UserPm> userPm) {
        this.userPm = userPm;
    }

    public List<Object> getCommuneList() {
        return communeList;
    }

    public void setCommuneList(List<Object> communeList) {
        this.communeList = communeList;
    }

    public List<Object> getVillageList() {
        return villageList;
    }

    public void setVillageList(List<Object> villageList) {
        this.villageList = villageList;
    }
}