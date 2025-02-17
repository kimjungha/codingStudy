package src.backJoon.dp.p1463;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        System.out.println(T.solution(cnt));
    }

    private int solution(int cnt) {
        int[] dp= new int[cnt+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i=2; i<cnt+1; i++){
            // -1 뺀다고 가정
            dp[i] = dp[i-1]+1;

            if(i%2 ==0) dp[i] = Math.min(dp[i],dp[i/2]+1);
            if(i%3 ==0) dp[i] = Math.min(dp[i],dp[i/3]+1);
        }
        return dp[cnt];
    }
}
