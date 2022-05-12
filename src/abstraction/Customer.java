package abstraction;

import java.util.Scanner;

abstract class Bank
{
	public String Name ="SBI";
	public String IFSC ="SBIN0001511";
	
	/*public void bankDetail()
	{
		System.out.println("Bank Name:" +Name+" "+"Bank IFSC Code:" +IFSC);
	}*/
	
	abstract void bankDetail();
	abstract void Deposite();
	abstract void Withdraw();
	abstract void CheckBal();
}

class SBIBank extends Bank
{
	private double bal=5000;
	private int pwd;
	public double money;
	
	public String Name ="SBI";
	public String IFSC ="SBIN0001511";
	
	public void Deposite()
	{
		System.out.println("SBI: Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("SBI: Enter Deposite Amount:");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("SBI: Deposited Money:"+money);
			System.out.println("SBI: Total Balance:"+bal);
		}
		else
		{
			System.out.println("SBI: Incorrect Passworod...");
		}
		
	}
	
	public void Withdraw()
	{
		System.out.println("SBI: Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("SBI: Enter Withdraw Amount:");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("SBI: Withdrawn Money:"+money);
			System.out.println("SBI: Total Balance:"+bal);
		}
		else
		{
			System.out.println("SBI: Incorrect Passworod...");
		}
		
	}
	
	
	public void CheckBal()
	{
		System.out.println("SBI: Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("SBI: Total Balance:"+bal);
		}
		else
		{
			System.out.println("SBI: Incorrect Passworod...");
		}
		
	}

	@Override
	void bankDetail() {
		System.out.println("Bank Name:" +Name+" "+"Bank IFSC Code:" +IFSC);
		
	}
}

class HDFCBank extends Bank
{
	private double bal=5000;
	private String pwd;
	public double money;
	
	public String Name ="HDFC";
	public String IFSC ="HDFC0001500";
	
	public void Deposite()
	{
		System.out.println("HDFC: Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.next();
		
		if(pwd.equals("ABC123"))
		{
			System.out.println("HDFC: Enter Deposite Amount:");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("HDFC: Deposited Money:"+money);
			System.out.println("HDFC: Total Balance:"+bal);
		}
		else
		{
			System.out.println("HDFC: Incorrect Passworod...");
		}
		
	}
	
	public void Withdraw()
	{
		System.out.println("HDFC: Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.next();
		
		if(pwd.equals("ABC123"))
		{
			System.out.println("HDFC: Enter Withdraw Amount:");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("HDFC: Withdrawn Money:"+money);
			System.out.println("HDFC: Total Balance:"+bal);
		}
		else
		{
			System.out.println("HDFC: Incorrect Passworod...");
		}
		
	}
	
	
	public void CheckBal()
	{
		System.out.println("HDFC: Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.next();
		s.close();
		
		if(pwd.equals("ABC123"))
		{
			System.out.println("HDFC: Total Balance:"+bal);
		}
		else
		{
			System.out.println("HDFC: Incorrect Passworod...");
		}
		
	}

	@Override
	void bankDetail() {
		System.out.println("Bank Name:" +Name+" "+"Bank IFSC Code:" +IFSC);
		
	}
}

public class Customer {

	public static void main(String[] args) {
		
		Bank sbi=new SBIBank();
		sbi.bankDetail();
		
		Bank hdfc=new HDFCBank();
		hdfc.bankDetail();
		
		System.out.println("SBI user press 1 & HDFC user press 2: ");
		Scanner bankChoice=new Scanner(System.in);
		int bankChoiceinput = bankChoice.nextInt();
		
		
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		
		System.out.println("\n Enter Your Choice");
		Scanner s2=new Scanner(System.in);
		int ch=s2.nextInt();
		
		switch (bankChoiceinput) {
		case 1:
				switch(ch)
				{
					case 1: sbi.Deposite();
							break;
					case 2: sbi.Withdraw();
							break;
					case 3: sbi.CheckBal();
							break;
					default: System.out.println("Invalid Choice");
				}
				break;
		case 2:
				switch(ch)
				{
					case 1: hdfc.Deposite();
							break;
					case 2: hdfc.Withdraw();
							break;
					case 3: hdfc.CheckBal();
							break;
					default: System.out.println("Invalid Choice");
				}
				break;	

		default:
			System.out.println("Wrong Choice");
		}
		
		
	}

}
