// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  boolean hasOne = false;
  boolean hasFour = false;
  
  for (int num : nums)
  {
    if (num == 1)
      hasOne = true;
      
    if (num == 4)
      hasFour = true;
    
  }
      
      
  return !hasOne || !hasFour;
}

