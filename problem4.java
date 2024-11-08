//Largest Prime Factor

int num1;
int num2; 


public static boolean isPalindrome(int num) {
  int original = num;
  int reversed = 0;

  while (num > 0) {
    int oneNum = num % 10;
    reversed = (reversed * 10) + oneNum;
    num /= 10;
  }
}
