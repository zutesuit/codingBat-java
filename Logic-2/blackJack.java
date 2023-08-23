// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

public int blackjack(int a, int b) {
  if (a > 21 && b > 21)
    return 0;
  else if (b > 21)
    return a;
  else if (a > 21)
    return b;
  else
    return Math.max(a,b);
}

// or

public int blackjack(int a, int b) {
  return a>21 && b>21 ? 0 : b > 21 ? a : a > 21 ? b : Math.max(a,b);
}
