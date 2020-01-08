package ro.iteahome.bikeSharingSystem.model;

import java.util.ArrayList;

public class Station {

    private int id;
    private String name;
    private ArrayList<Bike> bikes;

    public Station(int id, String name, ArrayList<Bike> bikes) {
        this.id = id;
        this.name = name;
        this.bikes = bikes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }
}
