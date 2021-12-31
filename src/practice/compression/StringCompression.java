package practice.compression;

public class StringCompression {

    public static void main(String[] args) {

        CpsSolution solution = new CpsSolution();

        int result1 = solution.solution("aabbaccc");
        if(result1 != 7) {
            throw new Error("failed test#1 || expected: 7, actual: " + result1);
        }

        int result2 = solution.solution("ababcdcdababcdcd");
        if(result2 != 9) {
            throw new Error("failed test#2 || expected: 9, actual: " + result2);
        }

        int result3 = solution.solution("abcabcdede");
        if(result3 != 8) {
            throw new Error("failed test#3 || expected: 8, actual: " + result3);
        }

        int result4 = solution.solution("abcabcabcabcdededededede");
        if(result4 != 14) {
            throw new Error("failed test#4 || expected: 14, actual: " + result4);
        }

        int result5 = solution.solution("xababcdcdababcdcd");
        if(result5 != 17) {
            throw new Error("failed test#5 || expected: 17, actual: " + result5);
        }

        int result6 = solution.solution("a");
        if(result6 != 1) {
            throw new Error("failed test#1 || expected: 1, actual: " + result6);
        }

        System.out.println("Success");
    }
}
