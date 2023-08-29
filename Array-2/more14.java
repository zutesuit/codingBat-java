// Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
  int countOnes = 0;
  int countFours = 0;
  
  for (int num : nums)
  {
    if (num == 1)
      countOnes++;
      
    else if(num == 4)
      countFours++;
    
  }
      
  return countOnes > countFours;
}

