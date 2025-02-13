package src.backJoon.p1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int month = kb.nextInt();
        int day = kb.nextInt();

        int[] year = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int result = 0;

        for (int i = 1; i < month; i++) {
            result += year[i];
        }
        result += day;

        System.out.println(dayOfWeek[result % 7]);

    }
}
