	package demo;
	import java.util.*;
	import java.math.*;
	
	public class MobileDB {
	
		BigInteger mobile_number;
		String company;
		int customer_id;
		String customer_name;
		String address;
		Scanner sc=new Scanner(System.in);
		int l=0;
		
		public MobileDB(BigInteger mobnum,String comp,int id,String name,String addr){
			mobile_number=mobnum;
			company=comp;
			customer_id=id;
		    customer_name=name;
			address=addr;		
		}
		
		public void Add_number(BigInteger n) throws InputMismatchException{
		try{	
			BigInteger b1=new BigInteger("999999999");
	BigInteger b2=new BigInteger("10000000000");
	int min=0,max=0;
	
	min=n.compareTo(b1);
	 max=n.compareTo(b2);
		if(min!=1||max!=-1)
		{		
		System.out.println("Invalid mobile number.");
	    	setmobile_number();
	    	}
	    	else
	    		mobile_number=n;
	}
	catch(InputMismatchException e){
		System.out.println("Invalid mobile number.");
		}
	
	}
	public void setcompany(){
		 int c=1;
		
		do{
			c=1;
		System.out.println("Enter the company name:");
	company=sc.nextLine();
	   for(int i=0;i<company.length();i++)
	    {
		   if(company.charAt(i)=='1'||company.charAt(i)=='2'||company.charAt(i)=='3'
	 ||company.charAt(i)=='4'||company.charAt(i)=='5'||company.charAt(i)=='6'||
	 company.charAt(i)=='7'||company.charAt(i)=='8'||company.charAt(i)=='9'
	 ||company.charAt(i)=='0')
	    	   {
	    		   c=0;
	           } 
	       }
	   if(c==0)
	     System.out.print("Invalid Service Provider.\nRe-enter your service provider.\n");
	    	   
		}while(c==0);
	}
	public void setmobile_number(){
		do{
			
		try{
			l=0;
		 System.out.println("Mobile number:");
	     	mobile_number=sc.nextBigInteger();
	
		Add_number(mobile_number);
	
		}
		catch(InputMismatchException e)
		{
         System.out.println("Invalid Input.");
          l=1;
		}
	}while(l==1);
	
}
	public void setcustomer_id(){     
	//customer id
	try{
	   System.out.println("Enter your Customer id:");
	  customer_id=sc.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("Invalid exception.");
		}
	}	
	       //customer name
	public void setcustomer_name(){ 
	int n=1;
			
	do{
				n=1;
				
				 System.out.println("Enter the Customer name:");
			 customer_name=sc.nextLine();
	for(int i=0;i<customer_name.length();i++)
	       {
	    	   
	  if(customer_name.charAt(i)=='1'||customer_name.charAt(i)=='2'||customer_name.charAt(i)=='3'
	 ||customer_name.charAt(i)=='4'||customer_name.charAt(i)=='5'||customer_name.charAt(i)=='6'||
	customer_name.charAt(i)=='7'||customer_name.charAt(i)=='8'||customer_name.charAt(i)=='9'
	 ||customer_name.charAt(i)=='0')
		   {
			   n=0;
	       } 
	   }
		   if(n==0)
	 System.out.print("Invalid Customer name.\nRe-enter your name.\n");
			    	   
	     }while(n==0);       
	}    
		    //address 
	   public void setaddress(){
	     System.out.println("Enter the Customer address:");
		     address=sc.nextLine();
		     
	   }
			    public void getcompany(){
			    	System.out.println("Service provider:"+company);
	    }
	 public void getcustomer_id(){
		 System.out.println("Customer id:"+customer_id);
	    }
	 public void getcustomer_name(){
		 System.out.println("Customer name:"+customer_name);
	 }
	 public void getaddress(){
		 System.out.println("Customer adress:"+address);
		 }
			
	 public void getmobile_number(){
		 System.out.println("Mobile number :"+mobile_number);
		 }
	  public void Display_mobilenumber_Record( ){
				System.out.println("Mobile number:"+mobile_number);
	System.out.println("Service provider:"+company);
	 System.out.println("Customer id:"+customer_id);
	 System.out.println("Customer name:"+customer_name);
	 System.out.println("Customer adress:"+address);
		
			}
	 }
