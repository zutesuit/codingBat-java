// Given a string, return a new string where the first and last chars have been exchanged.

public String frontBack(String str) {
  if (str.length() <= 1) {
    return str; // No change for strings of length 0 or 1
    }
    
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length() - 1);
    
    return lastChar + str.substring(1, str.length() - 1) + firstChar;
}

