// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

public int max1020(int a, int b) {
  if (b > a)
  {
    int temp = a;
    a = b;
    b = temp; // if one is larger than the other, just guarantee which one it is
  }
  
  return (10 <= a && a <= 20) ? a : (10 <= b && b <= 20) ? b : 0;
  
}

