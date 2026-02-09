class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles; // store total bottles drunk (start with initial bottles)

        while (numBottles >= numExchange) { // loop while exchange is possible

            int newBottles = numBottles / numExchange; // number of new bottles we get by exchange

            int remBottles = numBottles % numExchange; // remaining empty bottles after exchange

            ans = ans + newBottles; // drink new bottles → add to total count

            numBottles = newBottles + remBottles; // update bottles for next round
        }

        return ans; // return total bottles drunk
    }
}
