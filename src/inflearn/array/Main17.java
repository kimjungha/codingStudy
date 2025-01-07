package src.inflearn.array;

import java.util.Arrays;
import java.util.Scanner;

/** 소수 찾기 */
public class Main17 {
    public static void main(String[] args) {
        Main17 T = new Main17();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution2(kb.nextInt()));
    }

    /** 시간 초과 */
    public int solution(int num){
        int answer = 0;

        for(int i =2; i<num+1; i++){
            boolean numYn = true;
            for(int k =2; k<i; k++){
                if(i%k ==0){
                  numYn = false;
                  break;
                }
            }
            if (numYn) answer++;
        }

        return answer;
    }

    /** 소수 찾기는 이중포문 돌리면 시간 많이 소요되니
     * 에라토스테네스 체 방법으로 해결해야한다.
     * 에라토스테네스 체 : 2를 체크했을때, 2의 배수들을 다 체크해버리기 (2의 배수들은 소수가 아니니까)
     */
    public int solution2(int num){
        int answer = 0;
        int[] solArr = new int[num+1]; // 인덱스가 n 까지 생겨야 하니까 n+1 로 배열 생성해줌
        // int 배열의 기본 값은 0

        for(int i =2; i<num+1; i++){
            if(solArr[i] ==0){
                answer++;
                for(int k =1; k*i<num+1; k++){
                    solArr[k*i] =1;
                }
            }
        }
        return answer;
    }
}
