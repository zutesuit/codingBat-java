// Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n -> n % 10);
  return nums;
}

// 

public List<Integer> rightDigit(List<Integer> nums) {
  List<Integer> result = new ArrayList<>();
    
  for (Integer num : nums) 
    result.add(num % 10);
  
  return result;
}

