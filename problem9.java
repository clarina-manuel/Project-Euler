//Special Pythagorean Triplet
int sum = 1000;
int a = 0;
int b = 0;
int c = 0;
int product = 0;

for (a = 1; a < sum/2; a++){
  for (b = 1; b < sum/2; b++) {
    c = 1000 - b - a;
    
    if ((a * a) + (b * b) == (c * c)){
      product = a * b * c;
    }
  }
}

System.out.println(product);
