package practice.openchat;

import java.util.*;

public class OpenChatSolution {

    Repository repository = new Repository();
    List<History> historyList = new ArrayList<>();

    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();

        for(String rc : record) {
            String[] s = rc.split(" ");
            History history = new History(s[1], s[0]);
            if(history.isAccessHistory()) {
                historyList.add(history);
            }

            if(!history.isLeave()) {
                Optional<User> result = repository.findOne(s[1]);
                User user;
                if(result.isEmpty()) {
                    user = new User(s[1], s[2]);
                } else {
                    user = result.get();
                    user.changeNickName(s[2]);
                }
                repository.save(user);
            }
        }

        for(History history : historyList) {
            User user = repository.findOne(history.getUserId()).get();
            answer.add(user.getNickName() + history.getAction());
        }

        return answer.toArray(new String[answer.size()]);
    }
}
