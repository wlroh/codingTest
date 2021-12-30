package practice.puppetdraw;

import java.util.*;

public class PuppetDrawSolution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> dollsStack = new Stack<>();
        for(int move : moves) {
            for(int i = 0 ; i < board.length ; i++) {
                if (board[i][move - 1] > 0) {
                    if(dollsStack.isEmpty()) {
                        dollsStack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }
                    if(board[i][move - 1] == dollsStack.peek()) {
                        dollsStack.pop();
                        answer += 2;
                    } else {
                        dollsStack.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
