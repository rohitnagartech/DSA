class Solution {
    public boolean isPalindrome(int x) {

        // If number is negative, it cannot be palindrome
        if (x < 0) {
            return false;                  // return false for negative numbers
        }

        int n = x;                        // store original number in n
        int revNum = 0;                  // variable to store reversed number

        while (n > 0) {                  // loop until all digits are processed

            int lastDigit = n % 10;      // get last digit of number
            revNum = revNum * 10 + lastDigit; // build reverse number
            n = n / 10;                  // remove last digit
        }

        if (revNum == x) {               // compare reversed number with original
            return true;                 // if same → palindrome
        } else {
            return false;                // else → not palindrome
        }
    }
}
