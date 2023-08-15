// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


public String altPairs(String str) {
  String result = "";

    for (int i = 0; i < str.length(); i += 4) 
    {
      result += str.substring(i, Math.min(i + 2, str.length()));
    }

    return result;
}


