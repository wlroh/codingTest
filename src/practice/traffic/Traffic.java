package practice.traffic;


public class Traffic {

    public static void main(String[] args) {

        TrafficSolution solution = new TrafficSolution();

        int result1 = solution.solution(new String[]{"2016-09-15 00:00:00.000 3s"});
        if(result1 != 1) {
            throw new Error("failed test#1 || expected: 1, actual: " + result1);
        }

        int result2 = solution.solution(new String[]{"2016-09-15 23:59:59.999 0.001s"});
        if(result2 != 1) {
            throw new Error("failed test#2 || expected: 1, actual: " + result2);
        }

        int result3 = solution.solution(new String[]{"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"});
        if(result3 != 1) {
            throw new Error("failed test#3 || expected: 1, actual: " + result3);
        }

        int result4 = solution.solution(new String[]{"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"});
        if(result4 != 2) {
            throw new Error("failed test#4 || expected: 2, actual: " + result4);
        }

        int result5 = solution.solution(new String[]{"2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s", "2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s", "2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s", "2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s"});
        if(result5 != 7) {
            throw new Error("failed test#5 || expected: 7, actual: " + result5);
        }

        int result6 = solution.solution(new String[]{"2016-09-15 00:00:00.000 2.3s", "2016-09-15 23:59:59.999 0.1s"});
        if(result6 != 1) {
            throw new Error("failed test#1 || expected: 1, actual: " + result6);
        }

        System.out.println("Success");
    }
}
