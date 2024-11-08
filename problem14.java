//Collatz Sequence

if (currentNum % 2 == 0) {
  currentNum /= 2;
} else {
  currentNum = 3 * currentNum + 1;
}

chainLength++;
