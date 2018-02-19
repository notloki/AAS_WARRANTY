package com.notloki.AAS_Warranty.java;

public class Record {

    private String coilNumber;
    private String date;
    private String contractor;
    private String owner;
    private String location;
    private String purchaseOrder;
    private String substrate;
    private String color;
    private String feet;

    public Record(String coilNumber, String date, String contractor, String owner, String location,
                  String purchaseOrder, String substrate, String color, String feet) {
        this.coilNumber = coilNumber;
        this.date = date;
        this.contractor = contractor;
        this.owner = owner;
        this.location = location;
        this.purchaseOrder = purchaseOrder;
        this.substrate = substrate;
        this.color = color;
        this.feet = feet;
    }

    public String getCoilNumber() {
        return coilNumber;
    }

    public void setCoilNumber(String coilNumber) {
        this.coilNumber = coilNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getSubstrate() {
        return substrate;
    }

    public void setSubstrate(String substrate) {
        this.substrate = substrate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
    }
}
