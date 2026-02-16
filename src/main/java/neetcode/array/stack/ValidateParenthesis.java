package neetcode.array.stack;

import java.util.Stack;

class ValidateParenthesis {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> parenthesis = new Stack<>();
        for (char c :  chars) {
            switch (c) {
                case '(': parenthesis.push(c); break;
                case '[': parenthesis.push(c); break;
                case '{': parenthesis.push(c); break;
                case ')':
                    if(!parenthesis.isEmpty() && parenthesis.peek() == '(') {
                        parenthesis.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if(!parenthesis.isEmpty() && parenthesis.peek() == '[') {
                        parenthesis.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if(!parenthesis.isEmpty() && parenthesis.peek() == '{') {
                        parenthesis.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return parenthesis.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        String s = "]";
        ValidateParenthesis validateParenthesis = new ValidateParenthesis();
        System.out.println(validateParenthesis.isValid(s));
    }
}
