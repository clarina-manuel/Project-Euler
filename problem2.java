//Even Fibonacci Numbers
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
//https://projecteuler.net/problem=2

int num1 = 1;
int num2 = 2;
int nextNum = 0;
int sum = 2; //for the first even number

while (nextNum < 4000000){
  nextNum = num1 + num2;
  if(nextNum % 2 == 0) sum += nextNum;
  
  num1 = num2;
  num2 = nextNum;
}

System.out.println(sum);
