package src.inflearn.array;

import java.util.Scanner;

/** 소수 찾기 */
public class Main17 {
    public static void main(String[] args) {
        Main17 T = new Main17();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextInt()));
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

    public int solution(int num){
        int answer = 0;

        for(int i =2; i<num+1; i++){

        }

        return answer;
    }
}
