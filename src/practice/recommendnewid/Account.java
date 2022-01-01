package practice.recommendnewid;

public class Account {

    private String userId;

    public Account(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void validateId() {
        toLowerCase();
        removeExtraChar();
        checkContinuousDot();
        removeFirstLastDot();
        checkEmptyString();
        limitStringLength();
        checkMinlength();
    }

    private void toLowerCase() {
        userId = userId.toLowerCase();
    }

    private void removeExtraChar() {
        userId = userId.replaceAll("[^0-9a-z\\_\\-\\.]", "");
    }

    private void checkContinuousDot() {
        userId = userId.replaceAll("[\\.]{2,}", ".");
    }

    private void removeFirstLastDot() {
        userId = userId.replaceAll("^[\\.]|[\\.]$", "");
    }

    private void checkEmptyString() {
        if(userId.trim().length() < 1) {
            userId = "a";
        }
    }

    private void limitStringLength() {
        if(userId.length() > 15) {
            userId = userId.substring(0, 15);
            userId = userId.replaceAll("[\\.]$", "");
        }
    }

    private void checkMinlength() {
        while (userId.length() <= 2) {
            char c = userId.charAt(userId.length() - 1);
            userId += c;
        }
    }
}
