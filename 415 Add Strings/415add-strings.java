class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;  // Pointer for num1
        int j = num2.length() - 1;  // Pointer for num2
        int carry = 0;              // Carry from previous addition

        // Loop through both strings from the end
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;  // Update carry for next digit
            result.append(sum % 10);  // Add the current digit to the result
        }

        return result.reverse().toString();  // Digits were added in reverse
    }
}
