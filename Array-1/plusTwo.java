// Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

public int[] plusTwo(int[] a, int[] b) {
  return new int[] {a[0], a[1], b[0], b[1]};
}

// another way to do this, useful to know - copying elements of arrays into new arrays:

public int[] plusTwo(int[] a, int[] b) {
  int[] result = new int[4];
  System.arraycopy(a, 0, result, 0, 2);
  System.arraycopy(b, 0, result, 2, 2);
  return result;
}

