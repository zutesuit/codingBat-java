// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

public String stringYak(String str) {
    String result = "";
    int i = 0;

    while (i < str.length()) {
        if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') 
        {
            i += 3; 
        } else 
        {
            result += str.charAt(i);
            i++;
        }
    }

    return result;
}

// that's the long, ridiculous way. Regular expression way is hilariously better:

public String stringYak(String str) {
  return str.replaceAll("y.k", "");
}
