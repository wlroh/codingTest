package practice.puppetdraw;

import java.util.ArrayList;
import java.util.List;

public class PuppetDrawSolution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> storedDolls = new ArrayList<>();
        for(int move : moves) {
            for(int i = 0 ; i < board.length ; i++) {
                if (board[i][move - 1] > 0) {
                    if(storedDolls.size() > 0) {
                        Integer storedDoll = storedDolls.get(storedDolls.size() - 1);
                        if(board[i][move - 1] == storedDoll) {
                            storedDolls.remove(storedDolls.size() - 1);
                            answer = answer + 2;
                        } else {
                            storedDolls.add(board[i][move - 1]);
                        }
                    } else {
                        storedDolls.add(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
