// Given three int values, a b c, return the largest.

// initially went with MathMax, which only takes 2 inputs but you can chain usage like so:

public int intMax(int a, int b, int c) {
  return MathMax(a, MathMax(b,c)); 
}

// didn't allow for MathMax method so did normal:

public int intMax(int a, int b, int c) {
  int max;
  if (a > b) 
  {
    max = a;
  }
  else
  {
    max = b;
  }
  
  if (c > max)
  {
    max = c;
  }
  return max;
}


// so then of course put into ternary:

public int intMax(int a, int b, int c) {
    return (a > b ? (a > c ? a : c) : (b > c ? b : c));
}

