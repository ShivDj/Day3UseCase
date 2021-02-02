package helloworld;

public class EmployeeAttendenceCheck{
	
	public static void main(String[] args) {
		int present=1;
		int aval =(int)Math.floor((Math.random()*10)%2);
		System.out.println(aval);
		if (present==aval)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is NOT Present");
	}

}