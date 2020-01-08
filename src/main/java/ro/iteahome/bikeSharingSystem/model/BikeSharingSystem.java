package ro.iteahome.bikeSharingSystem.model;

import java.util.ArrayList;

public class BikeSharingSystem {

    private String name;
    private ArrayList<User> users;
    private ArrayList<Station> stations;

    public BikeSharingSystem(String name, ArrayList<User> users, ArrayList<Station> stations) {
        this.name = name;
        this.users = users;
        this.stations = stations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }
}
