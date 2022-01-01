package practice.openchat;

public class OpenChatting {

    public static void main(String[] args) {
        OpenChatSolution solution = new OpenChatSolution();

        String[] resultArray = solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});
        String[] successArray = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        if(resultArray.length != successArray.length) {
            throw new Error("failed test#1 || expected length: 4, actual: " + resultArray.length);
        }
        for(int i = 0 ; i < successArray.length ; i++) {
            if(!resultArray[i].equals(successArray[i])) {
                throw new Error("failed test#1 || expected: " + successArray[i] + ", actual: " + resultArray[i]);
            }
        }
        System.out.println("Success");
    }
}
