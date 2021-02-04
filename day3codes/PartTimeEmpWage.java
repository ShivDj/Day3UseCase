package helloworld;

public class PartTimeEmpWage{
	
	public static void main(String[] args) {
		int HoursEveryDay=8;
		int EarnPerHour=20;
		int OverTimeHour=4;
		int present =(int)Math.floor((Math.random()*10)%3);
		if (present==0)
			System.out.println("Employee is absent today keep checking for next days:-");
		else if(present==1)
			System.out.println("Employee earn in ragular day:-"+HoursEveryDay*EarnPerHour);
		else
			System.out.println("Employee Earned part time :-"+OverTimeHour*EarnPerHour);
		
	}

}