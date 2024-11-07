//Even Fibonacci Numbers

int num1 = 1;
int num2 = 2;
int nextNum = 0;
int sum = 0;

while (nextNum < 4000000){
  nextNum = num1 + num2;
  if(nextNum % 2 == 0){
    sum += nextNum;
  }
  num1 = num2;
  num2 = nextNum;
}

System.out.println(sum);
