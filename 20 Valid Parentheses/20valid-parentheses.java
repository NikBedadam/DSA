class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Go through each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If it's an opening bracket, push to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty when closing comes, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop(); // Remove the last open bracket

                // Check if it matches
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty at the end, it's valid
        return stack.isEmpty();
    }
}