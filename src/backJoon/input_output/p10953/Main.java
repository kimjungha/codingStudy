package src.backJoon.input_output.p10953;
/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10953                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kimg2311 <boj.kr/u/kimg2311>                +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10953                          #+#        #+#      #+#    */
/*   Solved: 2025/02/12 15:10:09 by kimg2311      ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt =kb.nextInt();
        kb.nextLine(); // 🔥 버퍼 비우기 (개행문자 제거 ->nextInt에서는 숫자만 받기에 \n 개행문자가 존재하는 상태)
        String[] cntArr = new String[cnt];
        for(int i =0; i<cnt; i++){
            String line = kb.nextLine();
            String[] lineArr = line.split(",");
            int a = Integer.parseInt(lineArr[0]);
            int b = Integer.parseInt(lineArr[1]);
            System.out.println(a+b);
        }

    }
}