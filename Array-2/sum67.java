// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

public int sum67(int[] nums) {
  int sum = 0;
  boolean ignoreSection = false;
  
  for (int num : nums)
  {
    if (num == 6)
      ignoreSection = true;
      
    if (!ignoreSection)
      sum += num;
      
    if (num == 7 && ignoreSection)
      ignoreSection = false;
    
  }
  
  return sum;
      
  
}

