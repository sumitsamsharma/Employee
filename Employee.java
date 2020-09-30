package Emp_info;

public class CompanyEmpWage 
{ 
   public final String company; 
   public final int emp_wage_hr,total_days,total_hours; 
   public int totalEmpWage;
   
   public CompanyEmpWage(String company, int emp_wage_hr, int total_days, int total_hours) 
   { 
	  this.company = company; 
      this.emp_wage_hr=emp_wage_hr; 
      this.total_days=total_days; 
      this.total_hours = total_hours; 
   }
   
   public void setEmpWage(int totalEmpWage) 
   { 
	   this.totalEmpWage = totalEmpWage; 
   }
   
  @Override 
   public String toString() 
  {
	  return "Total Emp Wage for Company: " +company+" is: "+ totalEmpWage; 
  }
} 

public class Employee
{
	    public static final int full_time=1;
	    public static final int part_time=0;
	   
	    int total_companies=0;
	    private CompanyEmpWage[]  company_emp_wage;
	    
	    private void add_CompanyWage(String company, int emp_wage_hr, int total_no_days, int total_hr) 
	    {
	        company_emp_wage[total_companies] = new CompanyEmpWage(company,emp_wage_hr, total_no_days,total_hr); 
	        total_companies++; 
	    } 
	    private void get_total_wage()
	    {
	         for (int i = 0; i < total_companies; i++) 
	         { 
	        	 company_emp_wage[i].setEmpWage(this.get_total_wage(company_emp_wage[i])); 
	        	 System.out.println(company_emp_wage[i]); 
	         }
	    }
	    
	    public Employee()
	    {
	    	company_emp_wage= new CompanyEmpWage[4];
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
	    
