// Given a list of strings, return a list where each string has all its "x" removed.

public List<String> noX(List<String> strings) {
  strings.replaceAll(s -> s.replaceAll("x", ""));
  return strings;
}

//

public List<String> noX(List<String> strings) {
  List <String> result = new ArrayList<>();
  
  for (String s : strings)
    result.add(s.replace("x", ""));
    
  return result;
}

