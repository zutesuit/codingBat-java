// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

public boolean haveThree(int[] nums) {
  int count = 0;
  int prevNum = -1;
  
  for (int num : nums) 
  {
    if (num == 3) 
    {
      count++;
      
      if (prevNum == 3) 
        return false; 
      
      if (count > 3) 
        return false; 
      
    }
    prevNum = num;
  }
  
  return count == 3;
}

