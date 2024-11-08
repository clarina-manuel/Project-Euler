//Sum Square Difference

int sumOfSquares = 0;
int squareofSum = 0;
int sum = 0;

//sum of squares
for (int count = 1; count <= 100; count++) {
  int squaringNum = count;
  squaringNum *= squaringNum;
  sumOfSquares += squaringNum;
}

//square of sum
for (int count = 1; count <= 100; count++) {
  sum += count;
}
squareofSum = sum*sum;


int difference = Math.abs(sumOfSquares - squareofSum);
System.out.println(difference);
