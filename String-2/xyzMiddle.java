// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

public boolean xyzMiddle(String str) {
  int length = str.length();
  if (length < 3)
    return false;
    
  int middle = length / 2;
  
  if (length % 2 == 0)
    return str.substring(middle -1, middle +2).equals("xyz")
      || str.substring(middle -2, middle + 1).equals("xyz");
  else
    return str.substring(middle -1, middle +2).equals("xyz");
    
    
}

