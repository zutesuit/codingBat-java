// Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
  String result = "";
  
  for (int i = 0; i < str.length(); i++)
  {
    char c = str.charAt(i);
    result +=c;
    result +=c;
  }
  return result;
}

