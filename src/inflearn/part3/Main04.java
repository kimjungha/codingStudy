package src.inflearn.part3;

import java.util.Scanner;

/** 연속 부분 수열 */
public class Main04 {
    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);
        int numSize = kb.nextInt();
        int searchNum = kb.nextInt();
        int[] numArr = new int[numSize];

        for (int i = 0; i < numSize; i++) {
            numArr[i] = kb.nextInt();
        }
        System.out.println(T.solution(numArr, searchNum));
    }

    private int solution(int[] numArr, int searchNum) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        // window 밀듯이 - for문이 rt
        for (int rt = 0; rt < numArr.length; rt++) {
           sum += numArr[rt];

           if(sum==searchNum){
               answer++;
           }
          while (sum>=searchNum){
              sum-=numArr[lt++];
              if(sum==searchNum)answer++;
          }
        }
        return answer;
    }
}
