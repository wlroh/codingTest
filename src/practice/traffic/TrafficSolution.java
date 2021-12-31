package practice.traffic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrafficSolution {

    public int solution(String[] lines) {
        int answer = 0;
        List<Long> checkPointList = new ArrayList<>();
        List<Log> logList = new ArrayList<>();

        for(String line : lines) {
            Log log = new Log();
            log.init(line);
            checkPointList.add(log.getStartTime());
            checkPointList.add(log.getEndTime());
            logList.add(log);
        }

        Collections.sort(checkPointList);

        for(Long checkPoint : checkPointList) {
            int count = 0;
            for(Log log : logList) {
                if(log.isIn(checkPoint, (checkPoint + 999))) {
                    count++;
                }
            }
            answer = answer == 0 ? count : Math.max(answer, count);
        }
        return answer;
    }
}
