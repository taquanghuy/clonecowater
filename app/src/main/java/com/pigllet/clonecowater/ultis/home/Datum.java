package com.pigllet.clonecowater.ultis.home;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pigllet.clonecowater.ultis.MerlList;
import com.pigllet.clonecowater.ultis.TechList;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("validated_status")
    @Expose
    private Integer validatedStatus;
    @SerializedName("validated_user")
    @Expose
    private Object validatedUser;
    @SerializedName("approved_status_del")
    @Expose
    private Integer approvedStatusDel;
    @SerializedName("approved_user")
    @Expose
    private Object approvedUser;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("postcashs")
    @Expose
    private Object postcashs;
    @SerializedName("tech_note")
    @Expose
    private Object techNote;
    @SerializedName("tech_user")
    @Expose
    private Object techUser;
    @SerializedName("partner_note")
    @Expose
    private Object partnerNote;
    @SerializedName("partner_user")
    @Expose
    private Object partnerUser;
    @SerializedName("created_user")
    @Expose
    private Object createdUser;
    @SerializedName("updated_user")
    @Expose
    private Object updatedUser;
    @SerializedName("file")
    @Expose
    private Object file;
    @SerializedName("created_at")
    @Expose
    private Object createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;
    @SerializedName("request_at")
    @Expose
    private Object requestAt;
    @SerializedName("tech_note_day")
    @Expose
    private Object techNoteDay;
    @SerializedName("partner_note_day")
    @Expose
    private Object partnerNoteDay;
    @SerializedName("ops_note")
    @Expose
    private Object opsNote;
    @SerializedName("ops_user")
    @Expose
    private Object opsUser;
    @SerializedName("ops_note_day")
    @Expose
    private Object opsNoteDay;
    @SerializedName("pmu_note")
    @Expose
    private Object pmuNote;
    @SerializedName("pmu_user")
    @Expose
    private Object pmuUser;
    @SerializedName("pmu_note_day")
    @Expose
    private Object pmuNoteDay;
    @SerializedName("great_note")
    @Expose
    private Object greatNote;
    @SerializedName("great_user")
    @Expose
    private Object greatUser;
    @SerializedName("great_note_day")
    @Expose
    private Object greatNoteDay;
    @SerializedName("merl_note")
    @Expose
    private Object merlNote;
    @SerializedName("merl_user")
    @Expose
    private Object merlUser;
    @SerializedName("merl_note_day")
    @Expose
    private Object merlNoteDay;
    @SerializedName("greatList")
    @Expose
    private List<Object> greatList = null;
    @SerializedName("techList")
    @Expose
    private List<TechList> techList = null;
    @SerializedName("pmuList")
    @Expose
    private List<Object> pmuList = null;
    @SerializedName("opsList")
    @Expose
    private List<Object> opsList = null;
    @SerializedName("partnerList")
    @Expose
    private List<Object> partnerList = null;
    @SerializedName("merlList")
    @Expose
    private List<MerlList> merlList = null;
    @SerializedName("created_user_by")
    @Expose
    private Object createdUserBy;
    @SerializedName("approved_user_by")
    @Expose
    private Object approvedUserBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getValidatedStatus() {
        return validatedStatus;
    }

    public void setValidatedStatus(Integer validatedStatus) {
        this.validatedStatus = validatedStatus;
    }

    public Object getValidatedUser() {
        return validatedUser;
    }

    public void setValidatedUser(Object validatedUser) {
        this.validatedUser = validatedUser;
    }

    public Integer getApprovedStatusDel() {
        return approvedStatusDel;
    }

    public void setApprovedStatusDel(Integer approvedStatusDel) {
        this.approvedStatusDel = approvedStatusDel;
    }

    public Object getApprovedUser() {
        return approvedUser;
    }

    public void setApprovedUser(Object approvedUser) {
        this.approvedUser = approvedUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getPostcashs() {
        return postcashs;
    }

    public void setPostcashs(Object postcashs) {
        this.postcashs = postcashs;
    }

    public Object getTechNote() {
        return techNote;
    }

    public void setTechNote(Object techNote) {
        this.techNote = techNote;
    }

    public Object getTechUser() {
        return techUser;
    }

    public void setTechUser(Object techUser) {
        this.techUser = techUser;
    }

    public Object getPartnerNote() {
        return partnerNote;
    }

    public void setPartnerNote(Object partnerNote) {
        this.partnerNote = partnerNote;
    }

    public Object getPartnerUser() {
        return partnerUser;
    }

    public void setPartnerUser(Object partnerUser) {
        this.partnerUser = partnerUser;
    }

    public Object getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Object createdUser) {
        this.createdUser = createdUser;
    }

    public Object getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(Object updatedUser) {
        this.updatedUser = updatedUser;
    }

    public Object getFile() {
        return file;
    }

    public void setFile(Object file) {
        this.file = file;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getRequestAt() {
        return requestAt;
    }

    public void setRequestAt(Object requestAt) {
        this.requestAt = requestAt;
    }

    public Object getTechNoteDay() {
        return techNoteDay;
    }

    public void setTechNoteDay(Object techNoteDay) {
        this.techNoteDay = techNoteDay;
    }

    public Object getPartnerNoteDay() {
        return partnerNoteDay;
    }

    public void setPartnerNoteDay(Object partnerNoteDay) {
        this.partnerNoteDay = partnerNoteDay;
    }

    public Object getOpsNote() {
        return opsNote;
    }

    public void setOpsNote(Object opsNote) {
        this.opsNote = opsNote;
    }

    public Object getOpsUser() {
        return opsUser;
    }

    public void setOpsUser(Object opsUser) {
        this.opsUser = opsUser;
    }

    public Object getOpsNoteDay() {
        return opsNoteDay;
    }

    public void setOpsNoteDay(Object opsNoteDay) {
        this.opsNoteDay = opsNoteDay;
    }

    public Object getPmuNote() {
        return pmuNote;
    }

    public void setPmuNote(Object pmuNote) {
        this.pmuNote = pmuNote;
    }

    public Object getPmuUser() {
        return pmuUser;
    }

    public void setPmuUser(Object pmuUser) {
        this.pmuUser = pmuUser;
    }

    public Object getPmuNoteDay() {
        return pmuNoteDay;
    }

    public void setPmuNoteDay(Object pmuNoteDay) {
        this.pmuNoteDay = pmuNoteDay;
    }

    public Object getGreatNote() {
        return greatNote;
    }

    public void setGreatNote(Object greatNote) {
        this.greatNote = greatNote;
    }

    public Object getGreatUser() {
        return greatUser;
    }

    public void setGreatUser(Object greatUser) {
        this.greatUser = greatUser;
    }

    public Object getGreatNoteDay() {
        return greatNoteDay;
    }

    public void setGreatNoteDay(Object greatNoteDay) {
        this.greatNoteDay = greatNoteDay;
    }

    public Object getMerlNote() {
        return merlNote;
    }

    public void setMerlNote(Object merlNote) {
        this.merlNote = merlNote;
    }

    public Object getMerlUser() {
        return merlUser;
    }

    public void setMerlUser(Object merlUser) {
        this.merlUser = merlUser;
    }

    public Object getMerlNoteDay() {
        return merlNoteDay;
    }

    public void setMerlNoteDay(Object merlNoteDay) {
        this.merlNoteDay = merlNoteDay;
    }

    public List<Object> getGreatList() {
        return greatList;
    }

    public void setGreatList(List<Object> greatList) {
        this.greatList = greatList;
    }

    public List<TechList> getTechList() {
        return techList;
    }

    public void setTechList(List<TechList> techList) {
        this.techList = techList;
    }

    public List<Object> getPmuList() {
        return pmuList;
    }

    public void setPmuList(List<Object> pmuList) {
        this.pmuList = pmuList;
    }

    public List<Object> getOpsList() {
        return opsList;
    }

    public void setOpsList(List<Object> opsList) {
        this.opsList = opsList;
    }

    public List<Object> getPartnerList() {
        return partnerList;
    }

    public void setPartnerList(List<Object> partnerList) {
        this.partnerList = partnerList;
    }

    public List<MerlList> getMerlList() {
        return merlList;
    }

    public void setMerlList(List<MerlList> merlList) {
        this.merlList = merlList;
    }

    public Object getCreatedUserBy() {
        return createdUserBy;
    }

    public void setCreatedUserBy(Object createdUserBy) {
        this.createdUserBy = createdUserBy;
    }

    public Object getApprovedUserBy() {
        return approvedUserBy;
    }

    public void setApprovedUserBy(Object approvedUserBy) {
        this.approvedUserBy = approvedUserBy;
    }

}

