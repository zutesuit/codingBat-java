// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
public String withoutX(String str) {
    
    if (str.length() == 1 && str.charAt(0) == 'x')
      return "";
    
    if (str.length() > 1)
    {
      
      if (str.charAt(0) == 'x')
      str = str.substring(1);
      
    if (str.charAt(str.length() -1) == 'x' && !str.isEmpty())
      str = str.substring(0, str.length() -1);
      
    }
    
    return str;
}



// this is a different but cool way of doing it. 

public String withoutX(String str) {
    int begin = 0;
    int end = str.length();
      
    if(str.length() > 0 && str.charAt(0) == 'x')
        begin = 1;
                
    if(str.length() > 1 && str.charAt(str.length() - 1) == 'x')
        end--;
                          
    return str.substring(begin, end);
}
