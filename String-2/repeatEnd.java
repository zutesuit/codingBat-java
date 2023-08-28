// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

public String repeatEnd(String str, int n) {
  String result = "";
  String end = str.substring(str.length () -n);
  
  result = new String(new char[n]).replace("\0", end);
  
  return result;
}

// more simple way below, but the above is cool. 

public String repeatEnd(String str, int n) {
    StringBuilder result = new StringBuilder();
    String end = str.substring(str.length() - n);
      
    for(int i = 0; i < n; i++) {
        result.append(end);
    }
                
    return result.toString();
}


