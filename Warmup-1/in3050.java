// Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

public boolean in3050(int a, int b) {
    return ((30 <= a && a <= 40) && (30 <= b && b <= 40)) ||
           ((40 <= a && a <= 50) && (40 <= b && b <= 50));
}

