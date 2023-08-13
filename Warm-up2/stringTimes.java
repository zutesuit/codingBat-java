// Given a string and a non-negative int n, return a larger string that is n copies of the original string.

public String stringTimes(String str, int n) {
  String newString = "";
  for (int i=0; i<n; i++)
  {
    newString = newString + str;
  }
  return newString;
}

// fo rone line can use StringJoiner class:

public String stringTimes(String str, int n) {
    return new StringJoiner("").add(str.repeat(n)).toString();
}

