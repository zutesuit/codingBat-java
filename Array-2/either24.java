// Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public boolean either24(int[] nums) {
  boolean hasTwoTwo = false;
  boolean hasFourFour = false;
  
  for (int i = 0; i < nums.length -1; i++)
  {
    if (nums[i] == 2 && nums[i+1] == 2)
      hasTwoTwo = true;
      
    if (nums[i] == 4 && nums[i+1] == 4)
      hasFourFour = true;
      
  }
  return hasTwoTwo ^ hasFourFour;
}

