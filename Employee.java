package Emp_info;

class Employee_func
{
	    public static final int full_time=1;
	    public static final int part_time=0;
	    public static final int emp_wage_hr=20;
	    public int total_no_days;
	    public int total_hr=0;
	    public int get_total_wage()  
	    { 
	    	int emp_wage=total_hr*emp_wage_hr;
	    	return emp_wage;
	    } 
	    public int get_total_hours()  
	    { 
	    	int emp_hr=0;
	    	int days=0;
	    	System.out.println("The number of :"+total_no_days);
	    	while(days<total_no_days)
	    	{
	    		int number=(int)Math.floor(Math.random()*10)%3;
	    		if(full_time== number)
			       emp_hr=8;
			    else if(part_time== number)
				   emp_hr=4;
			    else
				   emp_hr=0;
			    total_hr+=emp_hr;
			    days++;
	    	}
	    	return total_hr;
	    }
	    public void set_days(int total_days) 
	    { 
	      total_no_days=total_days; 
	    } 
}
public class Employee 
{
	
	public static void main(String[] args)
	{
		Employee_func obj1=new Employee_func();
		obj1.set_days(20);
		System.out.println("The number of hours employee worked :"+obj1.get_total_hours());
		System.out.println("Employee wage is : "+obj1.get_total_wage());
	}
}
	    
