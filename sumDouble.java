Given two int values, return their sum. Unless the two values are the same, then return double their sum.

public int sumDouble(int a, int b) {
  return (a == b) ? (a+b) * 2 : (a+b);
  // ternary operators are so cool
}
