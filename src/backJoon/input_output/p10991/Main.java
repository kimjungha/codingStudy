package src.backJoon.input_output.p10991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        T.solution(cnt);
    }


    private void solution(int cnt) {
        for (int i = 1; i < cnt + 1; i++) {
            for (int k = i; cnt - k > 0; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" *".repeat(i-1));
        }
    }
}
