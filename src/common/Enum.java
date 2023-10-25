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
        SYSADMIN, //0
        EMSADMIN, //1
        CSADMIN, //2
        TRANSPORTADMIN, //3
        REGIONALMANAGER, //4
        CSASSOCIATE, //5
        CUSTOMER, //6

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

    public enum PackageProvider {
        DHL,
        PUROLATOR,
        FEDEX
    };

    public enum PackageService {
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
