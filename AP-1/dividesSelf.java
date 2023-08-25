// We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

public boolean dividesSelf(int n) {
  int value = n;
 
  while (n > 0) 
  {
    int digit = n % 10;
    if (digit == 0 || value % digit !=0)
      return false;
    
    n /= 10; // this discards the rightmost digit.
  }
    
      
  return true;
}

