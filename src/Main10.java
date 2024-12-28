package src;

import java.util.Scanner;

/** 가장 짧은 문자거리
 * for 문을 두번돌려서 왼쪽, 오른쪽 기준으로 더 짧은 문자거리를 반환
 * */
public class Main10 {
    public static void main(String[] args){
        Main10 T = new Main10();
        Scanner kb = new Scanner(System.in);
        for(int x: T.solution(kb.nextLine())){
            System.out.print(x+" ");
        }

    }

    public int[] solution(String str){
        String[] strArray = str.split(" ");
        char[] charArray = strArray[0].toCharArray();
        char search = strArray[1].charAt(0);
        int[] answer = new int[strArray[0].length()];
        int k =1000;
        for(int i=0; i<answer.length; i++){
           if(charArray[i] ==search){
               k =0;
               answer[i] =0;
           } else{
               k++;
               answer[i] = k;
           }
        }
        for(int j =answer.length-1; j> -1; j--){
            if(answer[j]==0) {
                k = 0;
            }else if (answer[j]!=0 && k<answer[j]){
                k++;
                answer[j] = k;
            }
        }
        return answer;
    }
}
