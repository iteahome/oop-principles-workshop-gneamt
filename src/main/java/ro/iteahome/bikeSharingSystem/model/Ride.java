package ro.iteahome.bikeSharingSystem.model;

import java.util.Date;

public class Ride {

    private int id;
    private Station startStation;
    private Station endStation;
    private Bike bike;
    private Biker biker;
    private Date startTime;
    private Date endTime;

    public Ride(int id, Station startStation, Station endStation, Bike bike, Biker biker, Date startTime, Date endTime) {
        this.id = id;
        this.startStation = startStation;
        this.endStation = endStation;
        this.bike = bike;
        this.biker = biker;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Station getStartStation() {
        return startStation;
    }

    public void setStartStation(Station startStation) {
        this.startStation = startStation;
    }

    public Station getEndStation() {
        return endStation;
    }

    public void setEndStation(Station endStation) {
        this.endStation = endStation;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Biker getBiker() {
        return biker;
    }

    public void setBiker(Biker biker) {
        this.biker = biker;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
