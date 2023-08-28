// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

public String mixString(String a, String b) {
  String mixed = "";
  int minLength = Math.min(a.length(), b.length());
  
  for (int i =0; i < minLength; i++)
    mixed += a.charAt(i) + "" + b.charAt(i);
    // in java it will auto convert stuff before the "" into a string and
    // then concatenate. 
    
  mixed += a.substring(minLength) + b.substring(minLength);
  
  return mixed;
  
}

