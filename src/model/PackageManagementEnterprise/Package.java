/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PackageManagementEnterprise;

import model.Customer;
import common.Enum.*;

/**
 *
 * @author akshb
 */
public class Package {

    private String toAddress;
    private String fromAddress;
    private String toName;
    private String fromName;
    private PackageType type;
    private PackageService service;
    private PackageProvider provider;
    private City toCity;
    private City fromCity;
    private String toPostalCode;
    private String fromPostalCode;
    private Long packageId;
    private Long trackingId;
    private float weight;
    private Status status;
    private float cost;
    private Customer customer;
    private Franchise franchise;

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public PackageService getService() {
        return service;
    }

    public void setService(PackageService service) {
        this.service = service;
    }

    public PackageProvider getProvider() {
        return provider;
    }

    public void setProvider(PackageProvider provider) {
        this.provider = provider;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
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

    public PackageType getType() {
        return type;
    }

    public void setType(PackageType type) {
        this.type = type;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
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
