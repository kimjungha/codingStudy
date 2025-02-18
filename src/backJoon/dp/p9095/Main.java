package src.backJoon.dp.p9095;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T =  new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        int[] cntArr = new int[cnt];
        for (int i =0; i<cnt; i++){
            cntArr[i] = kb.nextInt();
        }

        int[] answer = T.solution(cntArr);
        for(int k=0; k<cnt; k++){
            System.out.println(answer[cntArr[k]]);
        }
    }

    private int[] solution(int[] cntArr) {
        int max = Arrays.stream(cntArr).max().orElse(1);
        int[] answer = new int[max+1];
        answer[1] = 1;
        answer[2] = 2;
        answer[3] = 4;

        for (int j =4; j<max+1; j++){
            answer[j] = answer[j-1]+answer[j-2]+answer[j-3];
        }

        return answer;
    }
}
