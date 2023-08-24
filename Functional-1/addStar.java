// Given a list of strings, return a list where each string has "*" added at its end.

public List<String> addStar(List<String> strings) {
  strings.replaceAll(s -> s + "*");
  return strings;
}


// other method 

public List<String> addStar(List<String> strings) {
  List<String> result = new ArrayList<>();
  for (String s : strings)
  {
    result.add(s + "*");
  }
  return result;
}


