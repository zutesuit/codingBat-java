// Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

public boolean hasOne(int n) {
  String num = Integer.toString(n);
  return num.contains("1");
}

