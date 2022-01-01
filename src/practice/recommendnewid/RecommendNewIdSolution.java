package practice.recommendnewid;

public class RecommendNewIdSolution {

    public String solution(String new_id) {
        Account account = new Account(new_id);
        account.validateId();
        return account.getUserId();
    }
}
