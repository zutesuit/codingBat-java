// Given a list of strings, return a list where each string has "y" added at its start and end.

public List<String> moreY(List<String> strings) {
  strings.replaceAll(s -> "y" + s + "y");
  return strings;
}

// other way just because

public List<String> moreY(List<String> strings) {
  List<String> result = new ArrayList<>();
  for (String s : strings)
  {
    result.add("y" + s + "y");
  }
  return result;
}

