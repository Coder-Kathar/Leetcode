class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int empty = numBottles;
        while(empty >= numExchange)
        {
            int newBottles = empty / numExchange;
            drink += newBottles;
            empty = empty % numExchange + newBottles;
        }
        return drink;
    }
}