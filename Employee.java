package Emp_info;

public class Employee 
{
	public static void main(String[] args)
	{
		int full_time=1;
		int part_time=0;
		int emp_wage_hr=20;
		int emp_hr=0;
		int emp_wage=0;
		double number=Math.floor(Math.random()*10)%2;
		if(full_time== number)
		     emp_hr=8;
		else if(part_time== number)
			emp_hr=4;
		emp_wage=emp_hr*emp_wage_hr;
		System.out.println("Employee wage: "+emp_wage);
	}
}
