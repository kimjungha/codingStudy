package src.beakJoon;

import java.util.Scanner;

// 투 포인터 알고리즘 3273번 두 수의 합 
public class Main04 {
    public static void main(String[] args) {
        Main04 T =new Main04();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        int[] arr = new int[cnt];
        for (int i =0; i<cnt; i++){
            arr[i] = kb.nextInt();
        }
        int searchValue = kb.nextInt();
        System.out.println(T.soultion(arr,searchValue));
    }

    private int soultion(int[] arr, int searchValue) {
        int answer =0; 
        int p1 =0; 
        
        while (p1<arr.length){
            if(arr[p1]!=0){
                int p2 = p1+1;
                int m = searchValue - arr[p1];
                while(p2<arr.length){
                    if(m ==arr[p2]){
                        answer++;
                        arr[p2] =0;
                    }
                    p2++;
                }
            }
            p1++;
        }
        return answer;
    }
}
