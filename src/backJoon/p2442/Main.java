package src.backJoon.p2442;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        T.solution(cnt);
    }

    private void solution(int cnt){
        int max = 2*cnt - 1;
        for (int i =1; i<max+1; i=i+2){
            int blank = (max-i)/2;
            System.out.print(" ".repeat(blank));
            System.out.print("*".repeat(i));
            System.out.println(" ".repeat(blank));
        }
    }
}
