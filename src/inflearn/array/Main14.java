package src.inflearn.array;

import java.util.Scanner;

/** 보이는 학생 */
public class Main14 {
    public static void main(String[] args){
        Main14 T = new Main14();
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int[] arr = new int[size];
        for (int i =0; i<size; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }

    public int solution(int[] arr){
        int answer = 1; //맨 앞의 학생
        int max = arr[0]; //max 의 첫 기준은 맨 앞의 학생
        for(int i =1; i<arr.length; i++){
            if(arr[i]>max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
