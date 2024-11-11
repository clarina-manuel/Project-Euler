//Counting Sundays
//How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
//https://projecteuler.net/problem=19

public static void main(String[] args){
  int sundays = 0;
  //sunday = 0, monday = 1, etc
  int day = 2; //jan 1 1901 is tuesday, so 2
  for (int year = 1901; year <= 2000; year++) {
    for (int month = 0; month < 12; month++) {
      if (day == 0) {
        sundays++;
      }
      day = (day + getDaysInMonth(month, year)) % 7; //how many full weeks of the month and extra (so if june 2 = wednesday, 30+2 = 32, 32%7 = 4 -> which corresponds to wednesday
    }
  }
  
  System.out.println(sundays);
}

//days in month -- helper method
public static int getDaysInMonth(int month, int year) {
  if (month == 0) return 31; //january
  else if (month == 1) { //februrary
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 29;
    else return 28; 
  } 
  else if (month == 2) return 31; //march
  else if (month == 3) return 30; //april
  else if (month == 4) return 31; //may
  else if (month == 5) return 30; //june
  else if (month == 6) return 31; //july
  else if (month == 7) return 31; //august
  else if (month == 8) return 30; //september
  else if (month == 9) return 31; //october
  else if (month == 10) return 30; //november
  else if (month == 11) return 31; //december
  else return 0;
}
