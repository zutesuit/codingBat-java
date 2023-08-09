// Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

public String endUp(String str) {
  int end = str.length() - 3;
  
  if (str.length() < 3) {
    return str.toUpperCase();
  } else {
    String upEnd = str.substring(end).toUpperCase();
    return str.substring(0, end) + upEnd;
  }
}











// this was almost there. I've just woken up, brain doesn't work. Yes this is mad basic stuff but I'm foggy leave me alone. 
 public String endUp(String str) {
  int endIndex = str.length() -3;
  String upEnd = str.substring(endIndex).toUpperCase();
  return str.length() <= 3 ? str : str.substring(0, endIndex) + upEnd;
  
}

