package src;

import java.util.Stack;

public class StackInfo {
    /**
     * 프로그래머스 : 올바른 괄호
     * 스택 push, pop, isEmpty 익숙해지기
     */
    public static boolean solution(String s) {
        boolean answer = false;
        Stack<Character> storeStack = new Stack<>();
        char change = '(';
        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                storeStack.push(s.charAt(i));
                a++;
            } else if (!storeStack.isEmpty()) {
                storeStack.pop();
                b++;
            } else {
                b++;
            }
        }
        if (storeStack.isEmpty()) {
            answer = true;
        }
        return answer;
    }

    /**
     * 프로그래머스 : 같은 숫자는 싫어
     * peek 은 반환하지 않음
     * stack 반환, 출력하면 쌓인 순서대로 보임
     */
    public static Stack<Integer> solution2(int[] arr) {

        Stack<Integer> st = new Stack<Integer>();

        for(int i=0; i<arr.length; i++){
            if(i==0) st.push(arr[i]);
            else if(st.peek() !=arr[i]) st.push(arr[i]);
        }
        return st;
    }


    public static void main(String[] args) {
        int[] request =new int[]{1,1,3,3,0,1,1};
        Stack<Integer> result = solution2(request);
        System.out.println("결과" + result);

    }

}
