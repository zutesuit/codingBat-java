// Given an int array length 2, return true if it contains a 2 or a 3.

public boolean has23(int[] nums) {
  for (int checkNum : nums) 
  {
    if (checkNum == 2 || checkNum == 3) 
    {
      return true; 
    }
  }
  return false; 
}

