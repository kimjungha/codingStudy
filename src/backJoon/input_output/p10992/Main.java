package src.backJoon.input_output.p10992;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        T.solution2(cnt);
    }
    private void solution(int cnt) {
        for (int i = 1; i < cnt + 1; i++) {
            // 마지막은 별 모두 채우기
            if(i==cnt){
                System.out.println("*".repeat(2*cnt -1));
                break;
            }
            // 별 시작 전 공백 처리
            for (int k = i; cnt - k > 0; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1){
                System.out.print("  ".repeat(i-2));
                System.out.print(" *");
            }
            System.out.println(" ");

        }
    }

    private void solution2(int cnt) {
        for (int i = 1; i <= cnt; i++) {
            // 공백 출력
            System.out.print(" ".repeat(cnt - i));

            // 첫 번째 줄과 마지막 줄은 별로만 채움
            if (i == 1 || i == cnt) {
                System.out.println("*".repeat(i == cnt ? (2 * cnt - 1) : 1));
            } else {
                // 중간 줄 처리 (양쪽 별 + 공백)
                System.out.println("*" + " ".repeat(2 * i - 3) + "*");
            }
        }
    }
}
