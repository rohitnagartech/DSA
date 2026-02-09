class Solution {
    public boolean isPowerOfTwo(int n) {      // function to check power of two

        if (n < 1) {                          // if number is 0 or negative
            return false;                     // not a power of two
        } 
        else if (n == 1) {                   // if number is exactly 1
            return true;                     // 1 = 2^0 → power of two
        } 
        else {                               // for numbers greater than 1
            while (n % 2 == 0) {             // while n is divisible by 2
                n = n / 2;                   // keep dividing by 2
            }

            if (n == 1) {                    // if after division n becomes 1
                return true;                 // then it's power of two
            } 
            else {                           // otherwise
                return false;                // not a power of two
            }
        }
    }
}
