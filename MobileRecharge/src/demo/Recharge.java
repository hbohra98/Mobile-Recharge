package demo;
import java.math.BigInteger;
import java.util.*;

public class Recharge extends MobileDB {
double balance;
double internet=0;
int rechargeamount;
int days=0;
static Scanner ac=new Scanner(System.in);


//recharge constructor
 Recharge(int b,int n,BigInteger mobnum,String comp,int id,String name,String addr){
    	super(mobnum,comp,id,name,addr);
	    balance=b;	
}

 
 //displaybalance
public void display_balance(){
	
	System.out.println("Talktime balance: "+balance+"\nInternet Balance:"
	                         +internet+" MB validity: "+days+" Days");
}


//rechargeprocess
public void Recharge_process(int recharge_amount) throws InterruptedException
{
	if(recharge_amount>100)
	{
			balance=balance+recharge_amount;
			System.out.println("Processing...");
	Thread.sleep(2000);
	System.out.println("Recharge Successful...");
	System.out.println("\n"+recharge_amount+" Rs = "+recharge_amount+" Rs Talktime.\n");
     }
if(recharge_amount<=100)
	{
	if(recharge_amount==5)
    {
		internet=internet+20;	
		days=1;
		System.out.println("Processing...");
Thread.sleep(2000);
System.out.println("Recharge Successful...");
System.out.println("\n"+recharge_amount+" Rs = "+internet+" Mb "+days+" Days\n");
}
	else if(recharge_amount==99)
{
		internet=internet+120;
		days=30;
		System.out.println("Processing...");
	Thread.sleep(2000);
	System.out.println("Recharge Successful...");
	System.out.println("\n"+recharge_amount+" Rs = "+internet+" Mb "+days+" Days\n");
}
else
{
    		double net_charge=(recharge_amount*25/100);
    	balance=balance+(recharge_amount-net_charge);
    	System.out.println("Processing...");
	Thread.sleep(2000);
	System.out.println("Recharge Successful...");
	System.out.println("\n"+recharge_amount+" Rs = "
	                         +(recharge_amount-net_charge)+" Rs Talktime.\n");
	    	}
	
	
	}

}


//offer
public void  Offer()
{
			int choice,again=0;
			do{
				again=0;
			System.out.println("Enter a choice:\n1.FUll TALKTIME\n2.INTERNET OFFERS\n");
	
	choice=ac.nextInt();
	switch(choice){
	case 1:
		System.out.println("1.150Rs=150TT\n2.258Rs=258TT\n");
		break;
	case 2:
		System.out.println("1.5Rs=20MB 1day\n2.99Rs=120MB 30days\n");
		break;
   default:
			System.out.println("Invalid Choice");
						again=1;
						break;
				}
				}while(again==1);
		
 }


//charcheck
public static int checkinteger(String c) {
		int n=0;
for(int i=0;i<c.length();i++)
       {
    	   
   if(c.charAt(i)=='1'||c.charAt(i)=='2'||c.charAt(i)=='3'
	   ||c.charAt(i)=='4'||c.charAt(i)=='5'||c.charAt(i)=='6'||
		c.charAt(i)=='7'||c.charAt(i)=='8'||c.charAt(i)=='9'
	    ||c.charAt(i)=='0')
    	   {
    		continue;
           }
   else
	   n++;
       }    
    if(n>0)
           return 1;
     else
    	   return 0;  
}


//menu
public static void menu(Recharge r1) {
	
char option=0;
char c,m='n';


System.out.println("Menu:");
System.out.println("1.Recharge\n"+"2.Offers\n"+"3.Edit details\n"+"4.View Details\n");	
System.out.println("Enter your choice:");
try{
option=ac.next().charAt(0);
}
catch(InputMismatchException e)
{
	
	System.out.println("Invalid choice.");     
				
			}
switch(option){
case '1':
//amountrecharge process
try{ 

    	System.out.println("Enter the amount of recharge:\n");
         String a; 
			int u=0;
			ac.nextLine();
		         a=ac.nextLine();
		        u=checkinteger(a);
		      
   if(u==0)
         {
				        	int amt=Integer.parseInt(a);
				        	System.out.println(amt);
				         r1.Recharge_process(amt);
         }			
        else
			        	System.out.println("Invalid input.");
		        
		         r1.display_balance( );
  }
  catch (InputMismatchException | InterruptedException |NumberFormatException  e) {
		System.out.println("Invalid input.");
		}
break;
//offer

case '2':
System.out.println("Todays offers are:\n");
r1.Offer();
break;
//Edit detail		    
case '3':
{
System.out.println("1.Edit customer name.\n"+"2.Edit customer Address.\n"
                                   +"3.Edit Company.");
char r=ac.next().charAt(0);
switch(r){
case '1':
		r1.setcustomer_name();
		r1.getcustomer_name();
		break;
case '2':
		r1.setaddress();
		r1.getaddress();
		break;
case '3':
		r1.setcompany();
		r1.getcompany();
        break;

default:
		System.out.println("Invalid input");
		 break;
      }
     break;
  }
case '4':
	r1.Display_mobilenumber_Record();
	break;

default:
		System.out.println("Invalid input.");
		break;
}

}


//main
public static void main(String[] args) throws Exception{
			
	BigInteger b=new BigInteger("9872861416");
	Recharge r1=new Recharge(100,0,b,"airtel",12 ,"hb","add");
	char v='n';
	String c;
	Scanner pc=new Scanner(System.in);
	
r1.getmobile_number();
	
do{
		menu(r1);
	System.out.println("Do you want to go to menu again(y/n):");
       c =ac.next();
      v=c.charAt(0);
  
}while(v=='y'||v=='Y');
			
 
	System.out.println("\nyour details are :\n\n");	
r1.Display_mobilenumber_Record( );
r1.display_balance();
System.out.println("\n\n********Thank You For Connecting With Us********");
    	}
}
