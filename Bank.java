
package bank;
import java.util.*;
import javax.swing.JOptionPane;

public class Bank {
    //three aray describe id,name , money
           static ArrayList<Integer>id=new ArrayList<Integer>();
	   static ArrayList<String>name=new ArrayList<String>();
	   static ArrayList<Double>money=new ArrayList<Double>();
   
    public static void main(String[] args) {
  
		 prog();
	 }
	 public static void prog(){
	        String m = JOptionPane.showInputDialog( "1-Add customer .\n 2-Deposit .\n 3-widthrawr.\n 4-remove.\n 5-print.\n 6-Exit .\n \n Select the number[1-6]"  , "input");
	 

	      switch (m) {
	        case ("1"):
	        add();//دالة إظافة زبون
	        break;
	        case ("2"):
	       Deposite();//دالة إيداع مبلغ
	        break;
	        case ("3"):
	        Widthraw();//دالة سحب مبلغ
	        break;
	        case ("4"):
	      delete();//دالة حدف حساب 
	        break;
	        case ("5"):
	        print();// طباعة معلومات عن حساب معين 
	        break;
	        case ("6"):
	        	JOptionPane.showMessageDialog(null, "thank you");
			 ;
	        break;
	        
	        
	    }
	        
	 

}
	 public static void print(){
		 for(int i=0;i<id.size();i++){
				JOptionPane.showMessageDialog(null, " number customer"+id.get(i)+"\n name customer"+name.get(i)+"\n balance of customer"+money.get(i));
				
				}
	 }
	 public static void add(){
		
		 String m = JOptionPane.showInputDialog("Enter the number customer ");
                 
		 int y = Integer.parseInt(m); 
                  if((id.size()<100)&&y!=0){
		 if(id.contains(y)==false){
		id.add(y);
		 String m2 = JOptionPane.showInputDialog("Enter the name customer ");
		 name.add(m2);
		 String m3 = JOptionPane.showInputDialog(" Enter the balance of customer "
                         + "");
		 double x = Double.parseDouble(m);  
		 money.add(x);
		 
		String inp = JOptionPane.showInputDialog(null, "do you want to add new customer [yes=1][No=0]");
			 int input=Integer.parseInt(inp);
			if(input==1)
				add();
			else
				prog();
	 }
		 else  JOptionPane.showMessageDialog(null, "acount exists");
		 
		 }
		 else
			 JOptionPane.showMessageDialog(null, "area full");
			 
		 
	 }
	 public static void delete(){
		 String m = JOptionPane.showInputDialog("اenter the acount delete"); 
		 int y = Integer.parseInt(m); 
		 if(id.contains(y)==true){
		id.remove(y);
		prog();
		 } else
			 JOptionPane.showMessageDialog(null, "acount not exists"); 
                 
		 
}
	 
         public static void Deposite(){
String de;
de=    JOptionPane.showInputDialog(null, "enter the number deposite");
int y=Integer.parseInt(de);
 if(id.contains(y)==true){
     int nu=id.indexOf(y);
     double x=money.get(nu);
    String e=    JOptionPane.showInputDialog(null, "enter the money");
    double m2=Integer.parseInt(e);
    double m3=m2+x;
    money.set(nu,m3);
     prog();
 }
 else
      JOptionPane.showMessageDialog(null, "acount not exists"); 
                 

}
 public static void Widthraw(){
     String de;
de=    JOptionPane.showInputDialog(null, "enter the number a count");
int y=Integer.parseInt(de);
 if(id.contains(y)==true){
     int nu=id.indexOf(y);
     double x=money.get(nu);
    String e=    JOptionPane.showInputDialog(null, "enter the money");
    double m2=Integer.parseInt(e);
    double m3=m2-x;
    money.set(nu,m3);
    prog();
 }
 else
      JOptionPane.showMessageDialog(null, "acount not  exists");

    }    
}
