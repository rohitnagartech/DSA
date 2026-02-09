class Solution {
    public int fib(int n) {               // function to return nth Fibonacci number

        if (n == 0) return 0;             // base case: F(0) = 0
        if (n == 1) return 1;             // base case: F(1) = 1

        int a = 0;                        // stores F(0)
        int b = 1;                        // stores F(1)

        for (int i = 2; i <= n; i++) {    // loop from 2 to n
            int c = a + b;                // F(n) = previous two sum
            a = b;                        // shift a to next position
            b = c;                        // shift b to next position
        }

        return b;                         // final Fibonacci value
    }
}
