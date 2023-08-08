// Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

// so did this the traditional way first:

public String delDel(String str) {
  if (str.length() >= 4 && str.substring(1,4).equals("del"))
  {
    return str.substring(0,1) + str.substring(4);
  }
  else
  {
    return str;
  }
  
}

// then found that using str.charAt() makes more sense:

public String delDel(String str) {
    if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
        return str.charAt(0) + str.substring(4);
    }
    return str;
}

// and for practice, putting into one line:

public String delDel(String str) {
    return str.length() >= 4 && str.substring(1, 4).equals("del") ? str.charAt(0) + str.substring(4) : str;
}

