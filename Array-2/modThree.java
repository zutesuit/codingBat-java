// Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

// initially did:

public boolean modThree(int[] nums) {
  for (int i = 1; i < nums.length -1; i++)
  {
    if (nums[i-1] % 2 == 1 && nums[i] % 2 ==1 && nums[i+1] % 2 == 1)
      return true;
      
    if (nums[i-1] % 2 == 0 && nums[i] % 2 == 0 && nums[i+1] % 2 == 0)
      return true;
  }
  return false;
}

// then realised can just equate them to each other. 

public boolean modThree(int[] nums) {
  for (int i = 1; i < nums.length -1; i++)
  {
    if (nums[i-1] % 2 == nums[i] % 2 && nums[i+1] % 2 == nums[i] % 2)
      return true;
  }
  
  return false;
}

