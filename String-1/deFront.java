// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

public String deFront(String str) {    
  if (str.length() >= 2)
  {
    if (str.substring(0,2).equals("ab"))
    {
      return str;
    }
    else if (str.charAt(0) == 'a')
    {
      return "a" + str.substring(2);
    }
    else if (str.charAt(1) == 'b')
    {
      return "b" + str.substring(2);
    }
    else return str.substring(2);
      
  }
  return str;
}

