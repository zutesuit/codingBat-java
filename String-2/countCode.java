// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

public int countCode(String str) {
  int count = 0;
  
  for (int i = 0; i < str.length() -3; i++)
  {
    if (str.substring(i,i+2).equals("co") && str.charAt(i+3) =='e')
      count ++;
  }
  return count;
}

// another way I like:


public int countCode(String str) {
    str = str.replaceAll("co.e", "X");
    int count = 0;

    for (char c : str.toCharArray()) 
    {
        if (c == 'X') 
            count++;
        
    }

    return count;
}

