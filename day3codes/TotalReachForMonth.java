package helloworld;

public class TotalReachForMonth{
	
	public static void main(String[] args) {
		int MaxHour=0;
		int EarnPerHour=20;
		for (int i =1;i<=20;i++)
			{
			MaxHour=MaxHour+8;
			if (MaxHour==100)
			{
				break;
			}
			}
		System.out.println(" A Employee Can Earns in 100 hours and 20 days:-"+MaxHour*EarnPerHour);
	}

}