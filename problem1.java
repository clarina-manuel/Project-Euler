//Multiples of 3 or 5

int count = 1;
int sum = 0;

while(count < 1000){
  if ((count % 3 == 0) || (count % 5 == 0)) {
    sum += count;
    count++;
  } else {
    count++;
  }
}

System.out.println(count);
