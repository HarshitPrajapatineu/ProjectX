/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.TransportServiceEnterprise;

import java.util.ArrayList;

/**
 *
 * @author akshb
 */
public class packageHistory {

    public packageHistory(long trackingId, int status, int Location) {
        this.trackingId = trackingId;
        this.status = status;
        this.Location = Location;
    }

    public packageHistory() {
    }

    public long trackingId;
    public int status;
    public int Location;

    public long getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(long trackingId) {
        this.trackingId = trackingId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLocation() {
        return Location;
    }

    public void setLocation(int Location) {
        this.Location = Location;
    }

}
