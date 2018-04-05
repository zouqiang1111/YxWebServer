package com.zouqiang.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author 邹强
 */
// 2.同步患者消费数据
public class ConsumData {
    @JSONField(ordinal = 1)
    private String patientId;// 病人编号
    @JSONField(ordinal = 2)
    private String inPatientId;// 住院号
    @JSONField(ordinal = 3)
    private String dmId;// 科室编码
    @JSONField(ordinal = 4)
    private String cdTime;// 业务时间
    @JSONField(ordinal = 5)
    private String cdNo;// 明细序号
    @JSONField(ordinal = 6)
    private String cdProjectNo;// 收费项目编号
    @JSONField(ordinal = 7)
    private String cdName;// 收费项目
    @JSONField(ordinal = 8)
    private Float cdNums;// 数量
    @JSONField(ordinal = 9)
    private String cdSpecify;// 规格
    @JSONField(ordinal = 10)
    private String cdUnit;// 单位
    @JSONField(ordinal = 11)
    private Float cdypNums;// 药品数量
    @JSONField(ordinal = 12)
    private Float cdypPrice;// 药品单价
    @JSONField(ordinal = 13)
    private String cdypName;// 药品名字
    @JSONField(ordinal = 14)
    private Float cdPrice;// 单价
    @JSONField(ordinal = 15)
    private Float cdPayAmount;// 金额
    @JSONField(ordinal = 16)
    private String cdType;// 类别
    @JSONField(ordinal = 17)
    private String cdMaker;// 开单人

    public ConsumData() {
        super();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getInPatientId() {
        return inPatientId;
    }

    public void setInPatientId(String inPatientId) {
        this.inPatientId = inPatientId;
    }

    public String getDmId() {
        return dmId;
    }

    public void setDmId(String dmId) {
        this.dmId = dmId;
    }

    public String getCdTime() {
        return cdTime;
    }

    public void setCdTime(String cdTime) {
        this.cdTime = cdTime;
    }

    public String getCdNo() {
        return cdNo;
    }

    public void setCdNo(String cdNo) {
        this.cdNo = cdNo;
    }

    public String getCdProjectNo() {
        return cdProjectNo;
    }

    public void setCdProjectNo(String cdProjectNo) {
        this.cdProjectNo = cdProjectNo;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public Float getCdNums() {
        return cdNums;
    }

    public void setCdNums(Float cdNums) {
        this.cdNums = cdNums;
    }

    public String getCdSpecify() {
        return cdSpecify;
    }

    public void setCdSpecify(String cdSpecify) {
        this.cdSpecify = cdSpecify;
    }

    public String getCdUnit() {
        return cdUnit;
    }

    public void setCdUnit(String cdUnit) {
        this.cdUnit = cdUnit;
    }

    public Float getCdypNums() {
        return cdypNums;
    }

    public void setCdypNums(Float cdypNums) {
        this.cdypNums = cdypNums;
    }

    public Float getCdypPrice() {
        return cdypPrice;
    }

    public void setCdypPrice(Float cdypprice) {
        this.cdypPrice = cdypprice;
    }

    public String getCdypName() {
        return cdypName;
    }

    public void setCdypName(String cdypName) {
        this.cdypName = cdypName;
    }

    public Float getCdPrice() {
        return cdPrice;
    }

    public void setCdPrice(Float cdPrice) {
        this.cdPrice = cdPrice;
    }

    public Float getCdPayAmount() {
        return cdPayAmount;
    }

    public void setCdPayAmount(Float cdPayAmount) {
        this.cdPayAmount = cdPayAmount;
    }

    public String getCdType() {
        return cdType;
    }

    public void setCdType(String cdType) {
        this.cdType = cdType;
    }

    public String getCdMaker() {
        return cdMaker;
    }

    public void setCdMaker(String cdMaker) {
        this.cdMaker = cdMaker;
    }

    @Override
    public String toString() {
        return "ConsumData [patientId=" + patientId + ", inPatientId=" + inPatientId + ", dmId=" + dmId + ", cdTime="
                + cdTime + ", cdNo=" + cdNo + ", cdProjectNo=" + cdProjectNo + ", cdName=" + cdName + ", cdNums="
                + cdNums + ", cdSpecify=" + cdSpecify + ", cdUnit=" + cdUnit + ", cdypNums=" + cdypNums + ", cdypPrice="
                + cdypPrice + ", cdypName=" + cdypName + ", cdPrice=" + cdPrice + ", cdPayAmount=" + cdPayAmount
                + ", cdType=" + cdType + ", cdMaker=" + cdMaker + "]";
    }

}
