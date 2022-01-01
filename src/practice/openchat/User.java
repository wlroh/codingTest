package practice.openchat;

public class User {

    private String userId;
    private String nickName;

    public User(String userId, String nickName) {
        this.userId = userId;
        this.nickName = nickName;
    }

    public void changeNickName(String newName) {
        nickName = newName;
    }

    public String getUserId() {
        return userId;
    }

    public String getNickName() {
        return nickName;
    }
}
