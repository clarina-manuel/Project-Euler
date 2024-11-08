//Collatz Sequence
public static void main(String[] args){
  int maxSequence = 0;
  int maxStart = 0;
  
  for (int count = 1; count < 1000000; count ++){
    if (collatzSequence(count) > maxSequence){
      maxSequence = collatzSequence(count);
      maxStart = count;
    }
  }
  System.out.println(maxSequence);
  System.out.println(maxStart);
}

//helper method to check for sequence
public static int collatzSequence(int startingNum) {
  long startingNumLong = startingNum; //use the long data type so it can hold all the digits
  int chainLength = 1;
  while (startingNum > 1){
    if (startingNum % 2 == 0) startingNum /= 2;
    else startingNum = ((3 * startingNum) + 1);
    chainLength++; 
  }
  return chainLength;
}
