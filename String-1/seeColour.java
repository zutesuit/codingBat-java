// Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

public String seeColor(String str) {
  if (str.startsWith("red"))
  {
    return "red";
  }
  else if (str.startsWith("blue"))
  {
    return "blue";
  }
  return "";
}

// or single statement

public String seeColor(String str) {
  return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : ""; 
}



