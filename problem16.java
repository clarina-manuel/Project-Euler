//Power Digit Sum
//What is the sum of the digits of the number 2^1000?
//https://projecteuler.net/problem=16

import java.math.BigInteger;

BigInteger digit = BigInteger.valueOf(2).pow(1000);
String strDigit = digit.toString();

BigInteger one;
BigInteger sum = BigInteger.ZERO;

for (int count = strDigit.length(); count > 0; count--) {
  one = digit.mod(BigInteger.valueOf(10));
  sum = sum.add(one);
  digit = digit.divide(BigInteger.valueOf(10));
}

System.out.println(sum);
