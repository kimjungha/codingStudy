package src.beakJun;

import java.util.Scanner;

/** 실버 4 : 한수
 * 한수 : 숫자의 자릿수가 등차수열을 이루는것을 말함
 */
public class Main01 {
    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }

    public int solution(int num){
        int result = 0;
        for (int i = num; i>0; i--){
            if(i>100){
                int a = i%10;
                int b = (i/10)%10;
                int c = i/100;
                if(a==b && b==c){
                    result++;
                }else if(b-a ==c-b){
                    result++;
                }
            }else if(i<100){
                result++;
            }

        }

        return result;
    }
}
