package ro.iteahome.bikeSharingSystem.model;

public class Admin {

    private User user;
    private String nickName;

    public Admin(User user, String nickName) {
        this.user = user;
        this.nickName = nickName;
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
}
