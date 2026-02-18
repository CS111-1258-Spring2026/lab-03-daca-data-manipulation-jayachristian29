// STUDENT NAME: Jaya Eckert
// DATE: 02/11/26

public class Main 
{
  public static void main(String[] args) 
	{
		/***** DECLARATION SECTION + INITIALIZATION SECTION *****/
		int julianDayNumberTodayDate;
		int julianDayNumberBirthdate;
		int differenceJulianDayNumbers;
		int approximateAge;

		int a1 = (14 - 2) /12 , a2 = (14 - 8) /12 ;
		int todayDay = 2 , birthDay = 26 ;
		int todayMonth = 2 + (12*a1) - 3, birthMonth = 8 + (12*a2) - 3 ;
		int todayYear = 2020 + 4800 - a1 , birthYear = 1918 + 4800 - a2 ;
		
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		//y = year + 4800 - a;
		//m = month + 12a - 3;
		//a = (14 - month) / 12:
		
		julianDayNumberTodayDate = todayDay + (((153*todayMonth) + 2)/5) + 365 * todayYear + (todayYear/4) - (todayYear/100) + (todayYear/400) - 32045;
		julianDayNumberBirthdate = birthDay + (((153*birthMonth) +2)/5) + 365 * birthYear + (birthYear/4) - (birthYear/100) + (birthYear/400) - 32045;
		differenceJulianDayNumbers = julianDayNumberTodayDate - julianDayNumberBirthdate;
		approximateAge = (differenceJulianDayNumbers - 14) / 365; 



		
		/***** OUTPUT SECTION *****/

		System.out.println("Julian Day Number for today's date, 2/2/2020, is " + julianDayNumberTodayDate);
		System.out.println();
		System.out.println("Julian Day Number for birthday, 8/26/1918, is " + julianDayNumberBirthdate);
		System.out.println();
		System.out.println("The difference in days is " + differenceJulianDayNumbers + ", which makes you approximately " + approximateAge +" years old!" );
  }
}