package Emp_info;

class Employee_func
{
	    public static final int full_time=1;
	    public static final int part_time=0;
	    public int emp_wage_hr;
	    public int total_no_days;
	    public int total_hr=0;
	    int emp_hours;

	    public int get_total_wage()  
	    { 
	    	int emp_wage=total_hr*emp_wage_hr;
	    	return emp_wage;
	    } 
	    public int get_total_hours()  
	    { 
	    	int emp_hr=0;
	    	int days=0;
	 
	    	while(days<total_no_days && total_hr<=emp_hours)
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

	    
	    public void set_working_days(int total_days) 
	    { 
	      total_no_days=total_days; 
	    }
	    
	    public void set_work_hours_month(int hr) 
	    { 
	      emp_hours=hr;
	    }
	    
	    public void set_wage_per_hour(int wage) 
	    { 
	    	emp_wage_hr=wage; 
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

		Employee_func company1=new Employee_func();
		company1.set_working_days(20);
		company1.set_work_hours_month(20);
		company1.set_wage_per_hour(50);
		System.out.println("The number of hours employee worked :"+company1.get_total_hours());
		System.out.println("Employee wage is : "+company1.get_total_wage());

	}
}
	    
