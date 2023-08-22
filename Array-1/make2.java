// Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

public int[] make2(int[] a, int[] b) {
  int[] result = new int[2];
  int count = 0; 
  
  for (int i = 0; i < a.length && count < 2; i++) 
  {
    result[count] = a[i];
    count++;
  }
  
  for (int i = 0; i < b.length && count < 2; i++) 
  {
    result[count] = b[i];
    count++;
  }
  
  return result;
}

