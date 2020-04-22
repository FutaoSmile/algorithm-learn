package com.futao;

import java.util.Stack;

/**
 * @author futao
 * @date 2020/4/21.
 */
public class LeetCode {
    public static void main(String[] args) {
        System.out.println(isValid("[{()}]"));
        System.out.println(isValid(""));
        System.out.println(isValid("]"));
        System.out.println(isValid("(])"));
        System.out.println(isValid("[{()}][]{}()(){}"));
    }


    /**
     * leetCode 20
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c || '[' == c || '{' == c) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                //当前栈顶元素
                Character topC = stack.pop();
                //需要入栈的元素是否和当前栈顶的元素匹配
                if (c == ')' && topC != '(') {
                    return false;
                }
                if (c == ']' && topC != '[') {
                    return false;
                }
                if (c == '}' && topC != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
