package LeetCode;

import java.util.Stack;

public class isValid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char par = s.charAt(i);
            if(par=='(' || par=='[' || par=='{') stack.push(par);
                // If it is open then add into stack
            else{
                if(stack.isEmpty()) return false;
                char el = stack.pop();
                if(par == ')' && el != '(') return false;
                if(par == ']' && el != '[') return false;
                if(par == '}' && el != '{') return false;
                //If they are closing then check if stack has this
                //if type matches then continue
                //else return false
            }
        }
        return stack.isEmpty();
    }
}

