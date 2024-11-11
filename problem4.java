//Largest Palindrome Product
//Find the largest palindrome made from the product of two 3-digit numbers.
//https://projecteuler.net/problem=4

public static void main(String[] args) {
  int palindrome = 0;
  int product;

  for (int count = 999; count >= 100; count--) {
    for (int i = count; i >= 100; i--) {
      product = count * i;
          
      if (product <= palindrome){
        break;
      }
      if (isPalindrome(product)) {
        palindrome = product;
      }  
    }
  }
  
  System.out.println(palindrome);
}
  
public static boolean isPalindrome(int num) {
  int original = num;
  int reversed = 0;

  while (num > 0) {
    int oneNum = num % 10;
    reversed = (reversed * 10) + oneNum;
    num /= 10;
  }

  return reversed == original;
}
