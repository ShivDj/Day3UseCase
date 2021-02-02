package helloworld;

public class EarnInMonthwhile{
	public static final int parthour=2;
	public static final int fullhour=1;
	public static final int EarnPerHour=20;

	public static void main(String[] args) {
		int Hour=0, TotalWage=0,Totalemphour=0,TotalWorkingDays=0;
	
		while (Totalemphour<=100 && TotalWorkingDays<20)
		{
			TotalWorkingDays++;
			int present =(int)Math.floor((Math.random()*10)%3);
			switch (present) 
			{
				case fullhour:
					Hour=Hour+8;
					break;
				case  parthour:
					Hour=Hour+4;
					break;
				default:
					Hour=0;
			}
			Totalemphour+=Hour;
			TotalWage=TotalWage+Totalemphour;
		}
	System.out.println("Employee Earn in Month mworking 20 days:-"+TotalWage*EarnPerHour);

}
}