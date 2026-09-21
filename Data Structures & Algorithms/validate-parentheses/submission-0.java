class Solution {
    public boolean isValid(String s) {
        //initialize stack
        Deque<Character> stack = new ArrayDeque<>();
        //push elements in string one my one
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){

                stack.push(c);
            }else{
                if (stack.isEmpty()) {
        return false;
    }
                

                char top = stack.pop();

                if (c == ')' && top != '(') {
        return false;
    }

    if (c == '}' && top != '{') {
        return false;
    }
    if (c == ']' && top != '[') {
        return false;
    }
            }
        }
        //if the current element is matching closing parentheses pop the top element and move further
        //repeat further till the length of string
        //check if stack is empty if yes return true or return false
        return stack.isEmpty();
    }
}
