package src.inflearn.array;


import java.util.Arrays;
import java.util.Scanner;

//등수 구하기
public class Main20 {
    public static void main(String[] args) {
        Main20 T = new Main20();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for(int i =0; i<num; i++){
            arr[i] = kb.nextInt();
        }
        for(int i :T.solution2(arr)){
            System.out.print(i+" ");
        }
        kb.close();
    }

    /** 내림차순은 직접 구현해야한다. */
    public int[] solution(int[] num){
        int[] answer = num.clone();
        Arrays.sort(num);
        for (int i = 0; i < num.length/2; i++) {
            int temp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }

        // 내림차순으로 정렬 완료
        int[] result = new int[num.length];
        for(int i =0; i<answer.length; i++){
           for(int k =0; k<num.length; k++){
               if(answer[i] == num[k]){
                   answer[i] = k+1;
                   break;
               }

           }
        }
        System.out.println();

        return answer;
    }

    public int[] solution2(int[] num){
        int[] answer = new int[num.length];
        for(int i =0; i<num.length; i++){
            int cnt = 1;
            for(int j =0; j<num.length;j++){
                if(num[j]>num[i]) cnt++; //i 를 기준으로 크다 -> 순위의 수가 커짐
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
