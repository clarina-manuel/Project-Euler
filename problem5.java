//Smallest Multiple
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? 
//https://projecteuler.net/problem=5

int multiple = 2520;
boolean isMultiple = false;

while (isMultiple != true) {
  multiple += 2520; //incrementing the multiples of 2510, which is divisible by 1-10
  boolean isEven = false;

  for (int count = 11; count <= 20; count++) {
    if (multiple % count == 0) {
      isEven = true;
    } else {
      isEven = false;
      break;
    }
  }
  
  if (isEven) isMultiple = true;
}

System.out.println(multiple);
