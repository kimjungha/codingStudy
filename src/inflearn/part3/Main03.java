package src.inflearn.part3;

import java.util.Scanner;

/**
 * 최대 매출
 * 시간복잡도 줄이기 위해서 다중 for 문 사용보다는 투포인터, 윈도우밀듯이 코딩하면 시간복잡도를 대폭 줄일수 있다.
 * 다중 포문 지양!
 */
public class Main03 {
    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);
        int days = kb.nextInt();
        int maxDay = kb.nextInt();

        int[] dayArray = new int[days];
        for (int i = 0; i < days; i++) {
            dayArray[i] = kb.nextInt();
        }
        System.out.println(T.solution2(dayArray, maxDay));

    }

    /**
     * 시간초과
     * 이중 포문이기에 o(n2) 제곱이 되어버림
     */
    private int solution(int[] dayArray, int maxDay) {
        int result = 0;

        for (int i = 0; i < dayArray.length - maxDay + 1; i++) {
            int tmp = 0;
            for (int k = i; k < maxDay + i; k++) {
                tmp += dayArray[k];
            }
            if (result < tmp) {
                result = tmp;
            }
        }
        return result;
    }

    /** two points , sliding window */
    private int solution2(int[] dayArray, int maxDay) {

        int result = 0;
        // 처음 윈도우 값 셋팅
        for (int i = 0; i < maxDay; i++) {
            result += dayArray[i];
        }
        int answer = result; // 반환값

        // window 밀듯이
        for (int i = maxDay; i < dayArray.length - maxDay + 1; i++) {
            result += dayArray[i] - dayArray[i - maxDay];
//            if (result > answer) {
//                answer = result;
//            }
            answer=Math.max(answer,result);
        }
        return answer;
    }

}
