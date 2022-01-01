package practice.recommendnewid;

public class RecommendNewIdSolution {

    public String solution(String new_id) {
//        Step 1
        System.out.println("new_id = " + new_id);

        String checkId = new_id.toLowerCase();
        System.out.println("checkId = " + checkId);

//        Step 2  소문자, 숫자, 특수문자
        checkId = checkId.replaceAll("[^0-9a-z\\_\\-\\.]", "");
        System.out.println("checkId = " + checkId);

//        Step 3
        checkId = stepThree(checkId);
        System.out.println("checkId = " + checkId);

//        Step 4
        if(checkId.length() > 0) {
            char firstChar = checkId.charAt(0);
            if(firstChar == '.') {
                checkId = checkId.substring(1);
            }
        }

        if(checkId.length() > 0) {
            char lastChar = checkId.charAt(checkId.length() - 1);
            if(lastChar == '.') {
                checkId = checkId.substring(0, checkId.length() - 1);
            }
        }
        System.out.println("checkId = " + checkId);

        // Step 5
        if(checkId.trim().length() < 1) {
            checkId = "a";
        }
        System.out.println("checkId = " + checkId);


        // Step 6
        if(checkId.length() > 15) {
            checkId = checkId.substring(0, 15);
        }
        char lastChar2 = checkId.charAt(checkId.length() - 1);
        if(lastChar2 == '.') {
            checkId = checkId.substring(0, checkId.length() - 1);
        }
        System.out.println("checkId = " + checkId);


        // Step 7
        while (checkId.length() <= 2) {
            char c = checkId.charAt(checkId.length() - 1);
            checkId += c;
        }
        System.out.println("checkId = " + checkId);

        String answer = checkId;
        return answer;
    }

    public String stepThree(String str) {
        String result = "";
        boolean chk = false;
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if(c == '.') {
                if(chk) {
                    continue;
                }
                chk = true;
            } else {
                if(chk) chk = false;
            }
            result += c;

        }
        return result;
    }
}
