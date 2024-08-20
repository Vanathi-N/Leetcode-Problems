class Solution {
   public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Accumulate the number if multiple digits are present
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                // Push the currentNum and currentString to their respective stacks
                numStack.push(currentNum);
                strStack.push(currentString.toString());
                // Reset currentString for new content within the brackets
                currentString = new StringBuilder();
                // Reset currentNum for next potential number
                currentNum = 0;
            } else if (c == ']') {
                // Pop the number of times to repeat and the previous string
                StringBuilder tempString = new StringBuilder();
                int repeatCount = numStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    tempString.append(currentString);
                }
                // Combine with the previous string
                currentString = new StringBuilder(strStack.pop()).append(tempString);
            } else {
                // Append letters to the current string
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}