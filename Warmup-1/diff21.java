// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

public int diff21(int n) {
  if (n >= 21) {
    return (n-21) * 2;
  }
  else {
    return (21-n);
  }
  
}


// ternary

public int diff21(int n) {
  return n >= 21 ? (n-21) * 2 : 21-n;
}

