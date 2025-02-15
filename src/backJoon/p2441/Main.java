package src.backJoon.p2441;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        T.solution(cnt);
    }
    private void solution(int cnt){
        for (int i =cnt; i>0; i--){
            System.out.print(" ".repeat(cnt-i));
            System.out.println("*".repeat(i));
        }
    }
}
