class Solution {
    public boolean isPowerOfFour(int n) {      // function to check power of 4

        if (n < 1) {                           // if number is 0 or negative
            return false;                      // not power of 4
        } 
        else if (n == 1) {                    // if number is exactly 1
            return true;                      // 4^0 = 1 → power of 4
        } 
        else {                                // for numbers greater than 1
            while (n % 4 == 0) {              // while n is divisible by 4
                n = n / 4;                    // keep dividing by 4
            }

            if (n == 1) {                     // if after division n becomes 1
                return true;                  // then it's power of 4
            } 
            else {                            // otherwise
                return false;                 // not power of 4
            }
        }
    }
}
