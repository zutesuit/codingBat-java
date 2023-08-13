// Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;





public String frontTimes(String str, int n) {
  int frontLen = Math.min(str.length(), 3);
  String front = str.substring(0, frontLen);
  String result = "";
  for(int i=0; i<n; i++)
  {
    result = result + front;
  }
  return result;
}


// slightly different, just using stringbuilder
public String frontTimes(String str, int n) {
  int frontLen = Math.min(str.length(), 3);
  String front = str.substring(0, frontLen);
  StringBuilder result = new StringBuilder();
  for(int i=0; i<n; i++)
  {
    result.append(front);
  }
  return result.toString();
}
