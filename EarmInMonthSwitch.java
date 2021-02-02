package helloworld;

public class EarmInMonthSwitch{
	public static final int parthour=2;
	public static final int fullhour=1;
	public static final int EarnPerHour=20;

	public static void main(String[] args) {
		int Hour=0;
		int TotalWage=0;
		int Onedaywage=0;
		for (int day=0;day<20;day++)
		{
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
			Onedaywage=Hour+EarnPerHour;
			TotalWage=TotalWage+Onedaywage;
		}
	System.out.println("Employee Earn in Month mworking 20 days:-"+TotalWage);

}
}