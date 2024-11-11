//Summation of Primes
//Find the sum of all the primes below two million.
//https://projecteuler.net/problem=10

public static void main(String[] args){
  int count = 1;
  int sum = 0;

  while (count <= 2000000){
    if (isPrime(count)) sum += count;
    count++;
  }

  System.out.println(sum);
}

//check prime - helper method
public static boolean isPrime(int num){
  if (num < 2) return false;
    
  for (int i = 2; i <= num/2; i++){
    if (num % i == 0) return false;
  } 

  return true;
}
