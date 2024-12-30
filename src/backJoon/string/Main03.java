package src.backJoon.string;

import java.util.Scanner;
/**  문자열 처음, 끝 추출 : 9086번 */
public class Main03 {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int num =kb.nextInt();
        String[] strArray = new String[num];
        for(int i =0; i<num; i++){
            strArray[i] =kb.next();
        }

        for(String x:strArray){
            System.out.print(x.charAt(0));
            System.out.println(x.charAt(x.length()-1));
        }
    }
}
