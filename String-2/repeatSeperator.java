// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

public String repeatSeparator(String word, String sep, int count) {
  String template = word + sep;
  String repeat = new String(new char[count]).replace("\0", template);
    
  if (count > 0) 
  {
    repeat = repeat.substring(0, repeat.length() - sep.length());
  }
    
  return repeat;
}

// other method:

public String repeatWithSeparator(String word, String sep, int count) {
  StringBuilder result = new StringBuilder();

  for (int i = 0; i < count; i++) 
  {
    result.append(word);
        
    if (i < count - 1) 
    {
        result.append(sep);
    }
  }

    return result.toString();
}
