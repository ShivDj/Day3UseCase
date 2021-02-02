package helloworld;

public class EmpWageForMonth{
	
	public static void main(String[] args) {
		int HoursEveryDay=8;
		int EarnPerHour=20;
		int EveryMonthWork=20;
		int MonthEarning=0;
		int DayEarn=0;

		for (int i =1; i<30; i++)
			{
			int present =(int)Math.floor((Math.random()*10)%2);
			if (present==1)
				DayEarn=HoursEveryDay*EarnPerHour; 
				MonthEarning=MonthEarning+DayEarn;
				EveryMonthWork=EveryMonthWork+1;
				if (EveryMonthWork==20)
					break;
			}
		System.out.println(" A Employee Earns Every Month:- "+MonthEarning);
        
	}

}