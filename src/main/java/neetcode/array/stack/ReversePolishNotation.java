package neetcode.array.stack;

import java.util.Stack;

class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
            Stack<String> evalStack  = new Stack<>();
            for (String token : tokens) {
                if(Character.isDigit(token.charAt(0))) {
                    evalStack.push(token);
                } else {
                    switch (token) {
                        case "+":
                            String token2 = evalStack.pop();
                            String token1 = evalStack.pop();
                            evalStack.push(String.valueOf(Integer.parseInt(token1) + Integer.parseInt(token2)));
                            break;
                        case "*":
                            String token4 = evalStack.pop();
                            String token3 = evalStack.pop();
                            evalStack.push(String.valueOf(Integer.parseInt(token3) * Integer.parseInt(token4)));
                            break;
                        case "-":
                            token4 = evalStack.pop();
                            token3 = evalStack.pop();
                            evalStack.push(String.valueOf(Integer.parseInt(token3) - Integer.parseInt(token4)));
                            break;
                        case "/":
                            token4 = evalStack.pop();
                            token3 = evalStack.pop();
                            evalStack.push(String.valueOf(Integer.parseInt(token3) * Integer.parseInt(token4)));
                            break;
                    }
                }
            }
            return Integer.parseInt(evalStack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = new String[]{"1", "2", "+", "3", "*", "4", "-"};
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        System.out.println(reversePolishNotation.evalRPN(tokens));
    }
}
