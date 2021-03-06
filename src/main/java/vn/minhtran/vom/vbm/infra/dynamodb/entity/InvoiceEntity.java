/*
 * Class: InvoiceEntity
 *
 * Created on Nov 13, 2020
 *
 * (c) Copyright Swiss Post Solutions Ltd, unpublished work
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Swiss Post Solution.
 * Floor 4-5-8, ICT Tower, Quang Trung Software City
 */
package vn.minhtran.vom.vbm.infra.dynamodb.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;

@DynamoDBTable(tableName = "vom_invoices")
@Access(AccessType.PROPERTY)
public class InvoiceEntity implements Serializable {

    private static final long serialVersionUID = -3228223901723345675L;

    private String id;

    private String name;

    private String rawData;

    private String guestName;

    private String checkInDate;

    private String checkOutDate;

    private String country;

    private String rooms;

    private Integer totalAmount;

    private Integer paidAmount;

    private Integer remainAmount;

    private String pdfLink;

    private String createdTime;

    private String lastModifiedTime;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.N)
    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.N)
    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.N)
    public Integer getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Integer remainAmount) {
        this.remainAmount = remainAmount;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @DynamoDBAttribute
    @DynamoDBTyped(DynamoDBAttributeType.S)
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

}
