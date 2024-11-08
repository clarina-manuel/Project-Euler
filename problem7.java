//10001st Prime

public static void main(String[] args){
  int thePrime = 1;
  int numOfPrimes = 0;
    
  while (numOfPrimes < 10001){
    thePrime++;
    if (isPrime(thePrime)) numOfPrimes++;
  }
      
  System.out.println(thePrime);
      
}

//check prime - helper method
public static boolean isPrime(int num){
  if (num < 2) return false;
    
  for (int i = 2; i <= num/2; i++){
    if (num % i == 0) return false;
  } 

  return true;
}
