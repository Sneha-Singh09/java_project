
import java.util.Scanner;

 class Bill{
	 public int fc,ch=78,p;
	public	double e,e1,e2,e3,e4;
	public double fac,f1,f2,f3,f4;
	public double ed,tax;
	public double ec;
	// to calculate fixed charge
		void fixed(){
		Scanner s=new Scanner(System.in);
		System.out.println("Select phase\t (1)1phase   (3)3phase");
		int i=s.nextInt();
		System.out.print("Billed Units:  ");
		 int u=s.nextInt();
		if(i==1) { 
			if(0<=u&&u<=100) {fc=65;System.out.println("Fixed charge: "+fc);}
			if(100<u&&u<=500) {fc=105;System.out.println("Fixed charge: "+fc);}}
		else {fc=130;
			System.out.println("FIXED CHARGE: "+fc);}
	      tax=0.2604*u;
	System.out.println("ENERGY TAX: "+tax);     
	double wheeling=1.48*u;
	//for energy size and fac
	if(u<100) {
		f1=.17*u;
		 e1=1.45*u;
	}
	else
		{ e1=1.45*100;
		  f1=.17*100;
		    if(101<=u&&u<=300) {
		    	 e2=3.70*(u-100);
		    	 f2=.30*(u-100);
		    }
		    else {
		    	 e2=3.70*200;
		    	 f2=.30*200;
		    	if(301<=u&&u<=500) {
		    		f3=.42*(u-300);
		    		e3=6.31*(u-300);
		    	}
		    	else {
		    		f3=.42*200;
		    		e3=6.31*200;
		    		f4=.49*(u-500);
		    		e4=7.71*(u-500);
		    	}
		    }
		}
	  e=e1+e2+e3+e4;
	  fac=f1+f2+f3+f4;
	  ec=e+fac+wheeling;
	 System.out.println("ENERGY CHARGE: "+ec);
	 ed= (16*(fc+ec))/100;
	 double fbill=fc+ec+ed+tax;
	 System.out.println("TOTAL: "+fbill);
	s.close();
	}
}
public class ElectricBill {
   public static void main(String[] args) {
		Bill b=new Bill();
        b.fixed();
	}
}
