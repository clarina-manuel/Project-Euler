//Find the sum of all the multiples of 3 or 5 below 1000. 
//https://projecteuler.net/problem=1

int count = 1;
int sum = 0;

while(count < 1000){
  if ((count % 3 == 0) || (count % 5 == 0)) sum += count;
  count++;
}

System.out.println(sum);
