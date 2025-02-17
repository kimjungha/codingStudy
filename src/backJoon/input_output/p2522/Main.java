package src.backJoon.input_output.p2522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        T.solution(cnt);
    }
    private void solution(int cnt){
        for (int i =1; i<cnt+1; i++){
            makeStar(cnt, i);
        }

        for (int k =cnt-1; k>0; k--){
            makeStar(cnt, k);
        }
    }

    private void makeStar(int cnt, int k) {
        int blank = cnt - k;
        System.out.print(" ".repeat(blank));
        System.out.println("*".repeat(k));
    }
}
