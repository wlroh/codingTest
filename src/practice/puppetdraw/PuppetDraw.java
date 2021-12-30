package practice.puppetdraw;

public class PuppetDraw {

    public static void main(String[] args) {
        PuppetDrawSolution solution = new PuppetDrawSolution();

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int result = solution.solution(board, moves);

        if(result != 4) {
            throw new Error("failed test#1 || expected: 4, actual: " + result);
        }

        System.out.println("Success");
    }
}
