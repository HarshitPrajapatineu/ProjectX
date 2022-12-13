/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PackageManagementEnterprise;

import model.Customer;
import common.Enum.*;
import java.util.ArrayList;

/**
 *
 * @author akshb
 */
public class Package {

    public Package() {
    }

    private String toAddressLine1;
    private String toAddressLine2;
    private String fromAddressLine1;
    private String fromAddressLine2;

    public String getToAddressLine1() {
        return toAddressLine1;
    }

    public void setToAddressLine1(String toAddressLine1) {
        this.toAddressLine1 = toAddressLine1;
    }

    public String getToAddressLine2() {
        return toAddressLine2;
    }

    public void setToAddressLine2(String toAddressLine2) {
        this.toAddressLine2 = toAddressLine2;
    }

    public String getFromAddressLine1() {
        return fromAddressLine1;
    }

    public void setFromAddressLine1(String fromAddressLine1) {
        this.fromAddressLine1 = fromAddressLine1;
    }

    public String getFromAddressLine2() {
        return fromAddressLine2;
    }

    public void setFromAddressLine2(String fromAddressLine2) {
        this.fromAddressLine2 = fromAddressLine2;
    }
    private String toName;
    private String fromName;
    private int type;
    private int service;
    private int provider;
    private int toCity;
    private int fromCity;
    private String toPostalCode;
    private String fromPostalCode;
    private Long packageId;
    private Long trackingId;
    private float weight;
    private Status status;
    private float cost;
    private Customer customer;
    private String franchise;
    private String currentLocationCity;
    private Long fromPhoneNumber;
    private Long toPhoneNumber;

    public Long getToPhoneNumber() {
        return toPhoneNumber;
    }

    public void setToPhoneNumber(Long toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }
    private String fromEmail;
    private String toEmail;

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }
    private int packageType;

    public int getPackageType() {
        return packageType;
    }

    public void setPackageType(int packageType) {
        this.packageType = packageType;
    }

    public Long getFromPhoneNumber() {
        return fromPhoneNumber;
    }

    public void setFromPhoneNumber(Long fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getCurrentLocationCity() {
        return currentLocationCity;
    }

    public void setCurrentLocationCity(String currentLocationCity) {
        this.currentLocationCity = currentLocationCity;
    }
    private ArrayList<Status> statusHistory;

    public ArrayList<Status> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(ArrayList<Status> statusHistory) {
        this.statusHistory = statusHistory;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getProvider() {
        return provider;
    }

    public void setProvider(int provider) {
        this.provider = provider;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getToCity() {
        return toCity;
    }

    public void setToCity(int toCity) {
        this.toCity = toCity;
    }

    public int getFromCity() {
        return fromCity;
    }

    public void setFromCity(int fromCity) {
        this.fromCity = fromCity;
    }

    public String getToPostalCode() {
        return toPostalCode;
    }

    public void setToPostalCode(String toPostalCode) {
        this.toPostalCode = toPostalCode;
    }

    public String getFromPostalCode() {
        return fromPostalCode;
    }

    public void setFromPostalCode(String fromPostalCode) {
        this.fromPostalCode = fromPostalCode;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public Long getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(Long trackingId) {
        this.trackingId = trackingId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
