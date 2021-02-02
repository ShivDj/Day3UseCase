package helloworld;

public class EmployeeDailyWages{
	
	public static void main(String[] args) {
		int HoursEveryDay=8;
		int EarnPerHour=20;
		int present =(int)Math.floor((Math.random()*10)%2);
		if (present==1)
			System.out.println(" A Employee Earns Daily Wages :- "+HoursEveryDay*EarnPerHour);
		else
			System.out.println("Employee is absent");
			
	}

}