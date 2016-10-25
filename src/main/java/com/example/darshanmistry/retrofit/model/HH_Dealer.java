package com.example.darshanmistry.retrofit.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;


@Table(name = "HH_DealerBean")
public class HH_Dealer extends Model{

    public HH_Dealer() {

        super();
    }

    @Expose
    @Column(name = "DMSID", onUniqueConflict = Column.ConflictAction.REPLACE, unique = true)
    private String DMSID;

    @Expose
    @Column(name = "Name", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String Name;

    @Expose
    @Column(name = "ServiceUsers", onUniqueConflict = Column.ConflictAction.REPLACE)
    private Integer ServiceUsers;

    @Expose
    @Column(name = "DeliveryUsers", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String DeliveryUsers;

    @Expose
    @Column(name = "Address1", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String Address1;

    @Expose
    @Column(name = "Address2", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String Address2;

    @Expose
    @Column(name = "PhoneNumber1", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String PhoneNumber1;

    @Expose
    @Column(name = "PhoneNumber2", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String PhoneNumber2;

    @Expose
    @Column(name = "PhoneNumber3", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String PhoneNumber3;

    @Expose
    @Column(name = "DbServerName", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String DbServerName;

    @Expose
    @Column(name = "DbName", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String DbName;

    @Expose
    @Column(name = "DbUserId", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String DbUserId;

    @Expose
    @Column(name = "DbPassword", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String DbPassword;

    @Expose
    @Column(name = "FromEmailId", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String FromEmailId;

    @Expose
    @Column(name = "IsActive", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String IsActive;

    @Expose
    @Column(name = "CreatedBy", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String CreatedBy;

    @Expose
    @Column(name = "CreatedDate", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String CreatedDate;

    @Expose
    @Column(name = "ModifiedBy", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String ModifiedBy;

    @Expose
    @Column(name = "ModifiedDate", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String ModifiedDate;


    @Expose
    @Column(name = "City", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String City;

    @Expose
    @Column(name = "State", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String State;

    @Expose
    @Column(name = "ZipCode", onUniqueConflict = Column.ConflictAction.REPLACE)
    private String ZipCode;

    public String getDMSID() {
        return DMSID;
    }

    public void setDMSID(String DMSID) {
        this.DMSID = DMSID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getServiceUsers() {
        return ServiceUsers;
    }

    public void setServiceUsers(Integer serviceUsers) {
        ServiceUsers = serviceUsers;
    }

    public String getDeliveryUsers() {
        return DeliveryUsers;
    }

    public void setDeliveryUsers(String deliveryUsers) {
        DeliveryUsers = deliveryUsers;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getPhoneNumber1() {
        return PhoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        PhoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return PhoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        PhoneNumber2 = phoneNumber2;
    }

    public String getPhoneNumber3() {
        return PhoneNumber3;
    }

    public void setPhoneNumber3(String phoneNumber3) {
        PhoneNumber3 = phoneNumber3;
    }

    public String getDbServerName() {
        return DbServerName;
    }

    public void setDbServerName(String dbServerName) {
        DbServerName = dbServerName;
    }

    public String getDbName() {
        return DbName;
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    public String getDbUserId() {
        return DbUserId;
    }

    public void setDbUserId(String dbUserId) {
        DbUserId = dbUserId;
    }

    public String getDbPassword() {
        return DbPassword;
    }

    public void setDbPassword(String dbPassword) {
        DbPassword = dbPassword;
    }

    public String getFromEmailId() {
        return FromEmailId;
    }

    public void setFromEmailId(String fromEmailId) {
        FromEmailId = fromEmailId;
    }

    public String getIsActive() {
        return IsActive;
    }

    public void setIsActive(String isActive) {
        IsActive = isActive;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }
}
