// Given an int array length 2, return true if it does not contain a 2 or 3.

public boolean no23(int[] nums) {
  for (int checkNum : nums) 
  {
    if (checkNum == 2 || checkNum == 3) 
    {
      return false; 
    }
  }
  return true; 
}
 

