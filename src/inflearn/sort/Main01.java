package src.inflearn.sort;

import java.util.Scanner;

public class Main01{
    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]  = in.nextInt();
        }
        int[] sortedArr = T.solution(arr);
        for(int x : sortedArr){
            System.out.print(x + " ");
        }
        in.close();
    }


    // 선택정렬 매 단계마다 “가장 작은 값(또는 큰 값)을 선택해서 맨 앞(또는 맨 뒤)과 교체하는 방식
    public int[] solution(int[] arr){
      for(int i =0; i<arr.length; i++){
         for(int j =i+1; j<arr.length; j++){
            if(arr[i] > arr[j]){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
         }
      }
      return arr;
    }
    
}