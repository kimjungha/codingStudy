package src.backJoon.dp.p11726;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        System.out.println(T.solution(cnt));
    }

    private int solution(int cnt) {
        if(cnt ==1) return 1;
        else{
            int[] cntArr = new int[cnt+1];
            cntArr[1] = 1;
            cntArr[2] = 2;
            for (int i=3; i<cnt+1; i++){
                cntArr[i] = (cntArr[i-1]+cntArr[i-2])%10007;
            }
            return cntArr[cnt];
        }
    }
}
