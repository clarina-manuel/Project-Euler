//Number Letter Counts

int sum [];
int numFirst10 = [3, 3, 5, 4, 4, 3, 5, 5, 4, 3]; //1-10
int numTens = [3, 6, 6, 5, 5, 5, 7, 6, 6]; //10-90

//append numFirst10 array to sum array
//append numTens array to sum array

//finding numbers 21-99
for (int count = 0; count <= numTens.length(); count++){
  for (int i = 1; i <= 9; i++){
    sum += numTens[count] + numFirst10[i];
    System.out.println(sum);
  }
}

//finding numbers 100-999




