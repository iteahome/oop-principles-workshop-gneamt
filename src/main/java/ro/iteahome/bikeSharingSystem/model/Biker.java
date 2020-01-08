package ro.iteahome.bikeSharingSystem.model;

        import java.util.ArrayList;

public class Biker {

    private User user;
    private String nickName;
    private ArrayList<Ride> rides;

    public Biker(User user, String nickName, ArrayList<Ride> rides) {
        this.user = user;
        this.nickName = nickName;
        this.rides = rides;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }
}
