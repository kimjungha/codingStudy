package src.beakJoon;

import java.util.Scanner;

/** 설탕 배달 */
public class Main02 {
    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }

    public int solution(int num){
        int result = 0;
        while(num>0){
            if(num>=5 && num%5==0){
                result = result+num/5;
                return result;
            } else if(num<3){
                result = -1;
                return result;
            }else{
                result++;
                num = num-3;
            }
        }

        return result;
    }
}
