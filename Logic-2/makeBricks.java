// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. 

public boolean makeBricks(int small, int big, int goal) {
  int bigBricks = big * 5;
  int remainingLength = goal - bigBricks;
  
  if (small + maxBigBricks >= goal) 
  {
    if (goal % 5 <= small) 
      return true;
  }

        return false;
}

