package projectlist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class List1 {


	public static void main(String[] args) throws ClassNotFoundException, SQLException  
	{
		int x=1;
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydb","root","abc123");
     Statement st=con.createStatement();
     System.out.println("Statement created");
     Scanner sc=new Scanner(System.in);
    while(x!=0)
    {
    	
    	System.out.println("********** LIST **********");
        System.out.println("1. INSERT ");
        System.out.println("2. UPDATE ");
        System.out.println("3. DELETE ");
        System.out.println("4. SHOW   ");
        System.out.println("0. EXIT");
        System.out.println("ENTER YOUR CHOICE");
     int a=Integer.parseInt(sc.nextLine());	
 
     switch(a)
     {
     case 1:
    	 System.out.println("HOW MANY ENTER YOU WANT TO INSERT ");
    	 int b=Integer.parseInt(sc.nextLine());
    	 for(int i=0;i<b;i++)
    	 {
    		System.out.println("ENTER THE ID OF EMPLOYEE");
    		int id=Integer.parseInt(sc.nextLine());
    		System.out.println("ENTER THE NAME OF EMPLOYEE");
    		String name=sc.nextLine();
    		System.out.println("ENTER THE CITY OF EMPLOYEE");
    		String city=sc.nextLine();
    		int c=st.executeUpdate("INSERT INTO emptb1 VALUES("+id+",'"+name+"','"+city+"')");
    	
    	 }
    	 break;
     case 2:
    	 System.out.println("WHAT YOU WANT TO UPDATE");
    	 System.out.println("1. EMPID");
    	 System.out.println("2. NAME");
    	 System.out.println("3. CITY");
    	 System.out.println("ENTER YOUR CHOICE");
    	 int d=Integer.parseInt(sc.nextLine());
    	
    	switch(d)
    	{
    	case 1:
    		System.out.println("WHICH ID YOU WANT TO UPDATE");
    		int id1=Integer.parseInt(sc.nextLine());
    		System.out.println("ENTER THE UPDATED ID");
    		int newid=Integer.parseInt(sc.nextLine());
    	
   		 int e=st.executeUpdate("UPDATE emptb1 SET EMPID="+newid+" WHERE EMPID="+id1+"");
   		 break;
    	case 2:
    		System.out.println("WHICH ID YOU WANT TO UPDATE");
    		int id2=Integer.parseInt(sc.nextLine());
    		System.out.println("ENTER THE UPDATED NAME");
    		String newname=sc.nextLine();
    		
      		 int f=st.executeUpdate("UPDATE emptb1 SET NAME='"+newname+"' WHERE EMPID="+id2+"");
      		 break;
    	case 3:
    		System.out.println("WHICH ID YOU WANT TO UPDATE");
    		int id3=Integer.parseInt(sc.nextLine());
    		System.out.println("ENTER THE UPDATED CITY");
    		String newcity=sc.nextLine();
    		
      		 int g=st.executeUpdate("UPDATE emptb1 SET CITY='"+newcity+"' WHERE EMPID="+id3+"");
      		 break;
      	}
    	break;
     case 3:
    	 System.out.println("WHICH ID DATA YOU WANT TO DELETE");
    	 int rol=Integer.parseInt(sc.nextLine());
    	 int h=st.executeUpdate("DELETE FROM emptb1 WHERE roll="+rol+"");   
     break;
     case 4:
    	 ResultSet rs=st.executeQuery("select * from emptb1");
         
  		while(rs.next()) {
  		
          System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
  		}
  		break;
     case 0:
    	 System.out.println("Exit");
    	 x=0;
    	 break;
    	 default:
    		 System.out.println("Wrong choice");
     }
     
    }
     con.close();
	}

}
