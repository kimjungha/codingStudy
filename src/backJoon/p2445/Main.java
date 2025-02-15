package src.backJoon.p2445;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        T.solution(cnt);
    }
    private void solution(int cnt){
        int max = cnt*2;
        for (int i=1; i<cnt+1; i++){
            extractStar(i, max);
        }
        for (int m=cnt-1; m>0; m--){
            extractStar(m, max);
        }
    }

    private void extractStar(int m, int max) {
        for (int j = 1; j< m +1; j++){
            System.out.print("*");
        }
        System.out.print(" ".repeat(max - m *2));
        for (int k = 1; k< m +1; k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
