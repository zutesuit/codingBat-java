// Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

public String nTwice(String str, int n) {
  String firstN = str.substring(0,n);
  String lastN = str.substring(str.length() -n);
  
  return firstN + lastN;
}

