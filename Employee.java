package Emp_info;

public class Employee 
{
	public static final int full_time=1;
	public static final int part_time=0;
	public static final int emp_wage_hr=20;
	public static void main(String[] args)
	{
		int emp_hr=0;
		int emp_wage=0;
		double number=Math.floor(Math.random()*10)%3;
		int val= (int)number;
		switch(val)
		{
	        case 0:
	        	emp_hr=4;
	        	break;
	        case 1:
	        	emp_hr=8;
	        	break;
	        default:
	        	emp_hr=0;
		}
		emp_wage=emp_hr*emp_wage_hr;
		System.out.println("Employee wage: "+emp_wage);
	}
}
