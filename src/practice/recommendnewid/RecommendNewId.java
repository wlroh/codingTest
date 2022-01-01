package practice.recommendnewid;

public class RecommendNewId {

    public static void main(String[] args) {

        RecommendNewIdSolution solution = new RecommendNewIdSolution();

        String result1 = solution.solution("...!@BaT#*..y.abcdefghijklm");
        if(!result1.equals("bat.y.abcdefghi")) {
            throw new Error("failed test#1 || expected: \"bat.y.abcdefghi\", actual: " + result1);
        }

        String result2 = solution.solution("z-+.^.");
        if(!result2.equals("z--")) {
            throw new Error("failed test#2 || expected: \"z--\", actual: " + result2);
        }

        String result3 = solution.solution("=.=");
        if(!result3.equals("aaa")) {
            throw new Error("failed test#3 || expected: \"aaa\", actual: " + result3);
        }

        String result4 = solution.solution("123_.def");
        if(!result4.equals("123_.def")) {
            throw new Error("failed test#4 || expected: \"123_.def\", actual: " + result4);
        }

        String result5 = solution.solution("abcdefghijklmn.p");
        if(!result5.equals("abcdefghijklmn")) {
            throw new Error("failed test#5 || expected: \"abcdefghijklmn\", actual: " + result5);
        }

        System.out.println("Success");
    }
}
