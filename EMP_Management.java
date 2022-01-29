import java.util.Scanner;

class Emp
{
int choice,id;
String name;
double sal;

void setId(int empId)
 {
	id =empId;
 }
void setName(String empName)
 {
	name=empName;
 }
void setSal(double empSal)
 {
	sal=empSal;
 }

int getId()
 {
	return id;	
 }
String getName()
 {
   return name;	
 }
double getSal()
 {
   return sal;	
 }

}

class Controller 
{
int n,i,choice;
Emp e[];
Scanner sc=new Scanner(System.in);

void menu()
 {
	System.out.println("==========::: MENU :::==========");
	System.out.println("1.Add Employee");
	System.out.println("2.Show Employee");
	System.out.println("3.Update Employee");
	System.out.println("4.Search Employee");
	System.out.println("5.Exit");
	
	System.out.println("Enter the choice:");
	choice=Integer.parseInt(sc.nextLine());
	switch(choice)
	{
	case 1:
		addEmp();
		break;
	case 2:
		showEmp();
		break;
	case 3:
		updateEmp();
		break;
	case 4:
		searchEmp();
	case 5:
		System.out.println("THANK U");//exit
		break;
		
	}
 }

void addEmp()
{
int empId;
String empName;
double empSal;

System.out.println("Enter Number Of Employess :");
n=Integer.parseInt(sc.nextLine());
e=new Emp[n];
System.out.println("Ok.......");
for(i=0;i<e.length;i++)
 {
	System.out.println("Employee"+(i+1));
	System.out.println("Enter Employee ID");
	empId=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Employee Name");
	empName=sc.nextLine();
	System.out.println("Enter Employee Salary");
	empSal=Double.parseDouble(sc.nextLine());
	
	e[i]=new Emp();
	e[i].setId(empId);
	e[i].setName(empName);
	e[i].setSal(empSal);
	
	
 }
menu();
}
void showEmp() 
 {
  System.out.println("=======================================================");
  
  System.out.println("----------::ALL EMPLOYEE DATA RECORD::----------");
  
  System.out.println("=======================================================");
  
  System.out.println("Sr.no"+"Emp ID"+"\t\tNAME"+"\t\tSALARY");
  
  for(i=0;i<e.length;i++)
   {
	  System.out.println((i+1)+"\t"+e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getSal());
   }
  menu();
  
 }

void updateEmp()
 {
	int tmpId,ch,x=0;
	String newName=null;
	double newSal;
	
	System.out.println("Enter Your Emp ID");
	tmpId=Integer.parseInt(sc.nextLine());
	for(i=0;i<e.length;i++)
	{
		if(tmpId==e[i].getId())
		{
			System.out.println("Sr.no"+"\tEmpId"+"\t\tNAME"+"\t\tSALARY");
			
			System.out.println((i+1)+"\t"+e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getSal());
			
			System.out.println("=======================================================");
			
			System.out.println("OK...What You want To ");
			System.out.println("1.Name\n2.Salary");
			System.out.println("Enter The Choice:");
			choice=Integer.parseInt(sc.nextLine());
			
			switch(choice) {
							  case 1:
								  System.out.println("Your Old Name is:"+e[i].getName());
								  System.out.println("What is Your Correct Name");
								  newName=sc.nextLine();
								  System.out.println("Your New Name is:"+newName+"And Your Old Name is"+e[i].getName());
								  break;
								  
							  case 2:
								  System.out.println("Your Old Salary is:"+e[i].getSal());
								  System.out.println("What is Your Correct Salary");
								  newSal=Double.parseDouble(sc.nextLine());
								  System.out.println("Your New Salary is:"+newSal+"And Your Old Salary is"+e[i].getSal());
								  
								System.out.println("Do You Really Want To Charge ?");
								System.out.println("1.Yes\n2.No");
								System.out.println("Enter choice:");
								ch=Integer.parseInt(sc.nextLine());
								
								switch(ch)
		 						{
								case 1:
									e[i].setSal(newSal);
									break;
								case 2:
									menu();
									break;
								}
								
								if(choice==1)
								{
								   System.out.println("Do You Really Want To Change ?");
								   System.out.println("1.Yes\n2.No");
								   System.out.println("Enter Choice:");
								   ch=Integer.parseInt(sc.nextLine());
								   
								   switch(ch)
								   {
								   case 1:
									   e[i].setName(newName);
									   break;
								   case 2:
									   menu();
								   
								   }
								}
								else {
									   x++;
								     }
			               }
		}
		
		if(x==n)
		{
			System.out.println("====================================================================");
			System.out.println("Sorry......invalid Employee ID");
			System.out.println("Please Check Your EmpId");
			System.out.println("====================================================================");		
			x=0;
		}
		
	}
	System.out.println("Ok done record update...");
	System.out.println("====================================================================");
	
	menu();
 }

	void searchEmp()
	{
		int tempId,x=0;
		String Name;
		System.out.println("Search By Emp ID");
		System.out.println("Enter the Emp ID");
		tempId=Integer.parseInt(sc.nextLine());
		for(i=0;i<e.length;i++)
		{
			if(tempId==e[i].getId())
			{
				System.out.println("Sr.no"+"\tEmpId"+"\t\tName"+"\t\tSalary");
				
				System.out.println((i+1)+"\t"+e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getSal());
			}
			else
			{
				x++;
			}
		}
		if(x==n)
		{
			System.out.println("Sorry you entered wrong EmpId...please enter correct Empid");
		}
		menu();	
	}    
}

public class EMP_Management {

	public static void main(String[] args) {
		
			System.out.println("----------EMPLOYEE MANAGEMENT SYSTEM----------");
			Controller c1=new Controller();
			c1.menu();
	}

}
