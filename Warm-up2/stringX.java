// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

public String stringX(String str) {
  if (str.length() <=2) return str;
  char firstChar = str.charAt(0);
  char lastChar = str.charAt(str.length() -1);
  String middle = str.substring(1, str.length() -1);
  middle = middle.replace("x", "");
  return firstChar + middle + lastChar;
}

