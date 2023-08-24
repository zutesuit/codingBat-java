// Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(n -> n >= 13 && n <= 19);
  return nums;
}

