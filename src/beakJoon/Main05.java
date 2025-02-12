package src.beakJoon;

import java.util.Scanner;

/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1000                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: kimg2311 <boj.kr/u/kimg2311>                +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1000                           #+#        #+#      #+#    */
/*   Solved: 2025/02/12 11:38:34 by kimg2311      ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
public class Main05 {
    public static void main(String[] args) {
        Main05 T =new Main05();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();

        System.out.println(T.soultion(a,b));
    }

    private int soultion(int a, int b) {
        return a+b;
    }
}

