package src.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/** 뒤집은 소수*/
public class Main18 {
    public static void main(String[] args) {
        Main18 T = new Main18();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for (int i =0; i<num; i++){
            arr[i] = kb.nextInt();
        }

        for(int i : T.solution(arr)){
            System.out.print(i + " ");
        }

    }

    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr){
            int check = reverse(i);
            if(isPrime(check)){
                answer.add(check);
            }
        }
        return answer;
    }

    // 숫자 뒤집기
    public int reverse(int num){
        int result = 0;
        while(num>=1){
            int tmp = num % 10;
            num = num/10;
            result  = result*10 + tmp;
        }
        return result;
    }

    // 소수인지 확인
    public boolean isPrime(int num){
        if(num ==1)return false;
        for(int i=2; i<num; i++){
            if(num%i ==0) return false;
        }
        return true;
    }

}
