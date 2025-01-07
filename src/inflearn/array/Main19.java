package src.inflearn.array;

import java.util.Scanner;

// 점수계산
public class Main19 {
    public static void main(String[] args) {
        Main19 T = new Main19();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for(int i =0; i<num; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }
    public int solution(int[] arr){
        int result = 0;
        int tmp = 0;
        for(int i :arr){
            if(i == 1){
                ++tmp;
                result = result +tmp;
            } else{
                tmp =0;
            }
        }
        return result;
    }
}
