// Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

public String conCat(String a, String b) {
  if (a.isEmpty() || b.isEmpty()) return a+b;
  
  return a.charAt(a.length()-1) == b.charAt(0) ? a + b.substring(1) : a+b;
}

//a little redundancy here but I'll come back at some point
