package src.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/** 배열 큰 수 출력하기 */
public class Main13 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int[] arr = new int[size];
        for(int  i =0; i<size; i++){
            arr[i] = kb.nextInt();
        }

        for (int k =0; k<size; k++){
            if(k ==0){
                System.out.print(arr[k]);
                continue;
            }

            if(arr[k] > arr[k-1]){
                System.out.print(arr[k]);
            }
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i =1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
}
