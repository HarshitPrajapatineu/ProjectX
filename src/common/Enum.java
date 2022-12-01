/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author dell
 */
public class Enum {

    public enum UserRole {
        SYSADMIN,
        EMSADMIN,
        CSADMIN,
        TRANSPORTADMIN,
        REGIONALMANAGER,
        CSASSOCIATE,
        CUSTOMER,

    };

    public enum Gender {
        MALE,
        FEMALE,
        PREFER_NOT_TO_SAY,
        OTHER
    };

    public enum City {
        TORONTO,
        SCARBOROUGH,
        MISSISSAUGA,
        HAMILTON,
        WINDSOR,
        LONDON,
        KINGSTON,
        BURLINGTON,
        BARRIE,
        WATERLOO,
        KITCHENER,
        VAUGHAN
    };

    public enum PackageType {
        ENVELOPE,
        DOCUMENT,
        BOX,
        POUCH
    };

    public enum Status {
        PENDING,
        APPROVED,
        SHIPPED,
        DELIVERED,
        CANCELLED
    };

    public enum PackageService {
        DHL,
        PUROLATOR,
        FEDEX
    };

    public enum PackageProvider {
        EXPRESS,
        GROUND,
        INTERNATIONAL
    };

    public enum Enterprise {
        CUSTOMERSERVICE,
        PACKAGEMANAGEMENT,
        TRANSPORTSERVICE,
        EMPLOYEEMANAGEMENT
    };

    public enum Franchise {
        QUEENSQUEY,
        EASTERN,
        DANFORTH,
        PARLIAMENT
    };
}
