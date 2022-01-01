package practice.openchat;

public class History {

    private final String userId;
    private final String status;

    public History(String userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public String getAction() {
        String action = "";
        switch (status) {
            case "Enter":
                action = "님이 들어왔습니다.";
                break;
            case "Leave":
                action = "님이 나갔습니다.";
                break;
        }
        return action;
    }

    public boolean isLeave() {
        return status.equals("Leave");
    }

    public boolean isAccessHistory() {
        return !status.equals("Change");
    }
}
