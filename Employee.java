package Emp_info;

import java.util.LinkedList;

public class Employee implements Inter_computeWage
{
	    public static final int full_time=1;
	    public static final int part_time=0;
	    private LinkedList<CompanyEmpWage> Emp_wage_list;
	    
	    int total_companies=0;
	    
	    public void add_CompanyWage(String company, int emp_wage_hr, int total_no_days, int total_hr) 
	    {
	    	CompanyEmpWage wage= new CompanyEmpWage(company,emp_wage_hr, total_no_days,total_hr); 
	    	Emp_wage_list.add(wage);
	    	total_companies++; 
	    } 
	    public void get_total_wage()
	    {
	         for (int i = 0; i < Emp_wage_list.size(); i++) 
	         { 
	        	 CompanyEmpWage wage=Emp_wage_list.get(i);
	        	 wage.setEmpWage(this.get_total_wage(wage));
	        	 System.out.println(wage); 
	         }
	    }
	    
	    public Employee()
	    {
	    	Emp_wage_list= new LinkedList<>(); 
	    	
	    }
	    
	    private int get_total_wage(CompanyEmpWage companyEmpWage) 
	    {   
	    	int emp_hr = 0, total_hours = 0, total_days = 0;
	    	
	        while (total_hours <= companyEmpWage.total_hours && total_days< companyEmpWage.total_days) 
	        { 
	          total_days++;
	          int empCheck = (int) Math.floor(Math.random() * 10) % 3; 
	          switch (empCheck) 
	          { 
	              case part_time: 
	        	     emp_hr=4; 
	        	     break; 
	        	  case full_time: 
	        		 emp_hr=8; 
	        		 break;
	        	   default: 
	        		 emp_hr=0; 
	          }
	          
	    	  total_hours += emp_hr; 
	    	}
	        return total_hours * companyEmpWage.emp_wage_hr; 
	    } 

	public static void main(String[] args)
	{
		Employee emp_wage_build=new Employee();
		emp_wage_build.add_CompanyWage("Vishal",30,3,15);
		emp_wage_build.add_CompanyWage("Rel",20,4,10);
		emp_wage_build.get_total_wage();
	}
}
	    
