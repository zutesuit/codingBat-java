// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

boolean doubleX(String str) {
  int x = str.indexOf("x");
  // if x is first or last character, return false, otherwise if x is followed by 'x' we win
  return (x == -1 || x == str.length() -1) ? false : str.charAt(x + 1) == 'x';
  
}

