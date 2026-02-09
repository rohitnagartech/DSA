class Solution {
    public boolean isPowerOfThree(int n) {     // function to check power of 3

        if (n < 1) {                           // if number is 0 or negative
            return false;                      // not power of 3
        } 
        else if (n == 1) {                    // if number is exactly 1
            return true;                      // 3^0 = 1 → power of 3
        } 
        else {                                // for numbers greater than 1
            while (n % 3 == 0) {              // while n is divisible by 3
                n = n / 3;                    // keep dividing by 3
            }

            if (n == 1) {                     // if after division n becomes 1
                return true;                  // then it's power of 3
            } 
            else {                            // otherwise
                return false;                 // not power of 3
            }
        }
    }
}
