import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class AgePr1
{
  public static void main (String args[])
  {
    System.out.println ("Enter date of birth formate is YYYY-MM-DD:");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine ();
      s.close ();
    LocalDate dob = LocalDate.parse (input);

      System.out.println ("You are age is " + calculateAge(dob) );
  }

  public static int calculateAge (LocalDate dob)
  {
    LocalDate currentDate= LocalDate.now ();
	if((dob != null) &&(currentDate != null))
	{
	return Period.between(dob,currentDate).getYears();	
	}
	else
	{
	return 0;
	}
  }
}