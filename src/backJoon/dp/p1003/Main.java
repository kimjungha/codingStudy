package src.backJoon.dp.p1003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        int [] cntArr = new int[cnt];
        for (int i = 0; i<cnt; i++){
            cntArr[i] = kb.nextInt();
        }
        kb.close(); //Scanner 닫기

        int[][] answerDp = T.solution(cntArr);
        for (int i = 0; i<cnt; i++){
            int search =cntArr[i];
            System.out.println(answerDp[search][0]+" "+answerDp[search][1]);
        }
    }

    private int[][] solution(int[] cntArr) {
        int max = Arrays.stream(cntArr).max().orElse(0);
        int[][] dpArr = new int[max+1][2];
        dpArr[0] = new int[]{1, 0}; // 초깃값 셋팅

        if(max>0){
            dpArr[1] = new int[]{0, 1};

            for (int i = 2; i < max+ 1; i++) {
                dpArr[i][0] = dpArr[i-1][0]+dpArr[i-2][0];
                dpArr[i][1] = dpArr[i-1][1]+dpArr[i-2][1];
            }
        }

        return dpArr;
    }
}
