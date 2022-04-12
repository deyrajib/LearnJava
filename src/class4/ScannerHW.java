package class4;

import java.util.Scanner;

public class ScannerHW {
public static void main(String [] args) {
	
	
	Scanner scn = new Scanner (System.in);
	
	float Stax = 0.088f;
	
	System.out.println("Chips Qty");
	int Chipsq = scn .nextInt();
	System.out.println("Chips Price");
	double Chipsp = scn.nextDouble();
	double totalChips=Chipsq*Chipsp;
	
	System.out.println("Gum Qty");
	int Gumq=scn.nextInt();
	System.out.println("Gum Price");
	float Gump= scn.nextFloat();
	double totalGums=Gumq*Gump;
	
	System.out.println("Pen Qty");
	int Penq=scn.nextInt();
	System.out.println("Pen price");
    double Penp=scn.nextDouble();	
    double totalPens=Penq*Penp;
	
    double Stotal= (totalChips+totalGums+totalPens);
   
    double totaltax =  (( totalChips+totalGums+totalPens)*(Stax));
	
    double totalafttx= (totalChips+totalGums+totalPens + totaltax);
	
    
    
	
    
	System.out.println("              BUSINESS  NAME                     ");
	System.out.println("              11 Main Street                     ");
	System.out.println("           City Name, State, NY                  ");
	System.out.println("               123-412-1235                      ");
	System.out.println("*************************************************");
	System.out.println("  *  Item      Qty              Price");
	
	System.out.println("                                                  ");
	System.out.println("  *  Chips "+"\t"  + Chipsq +   "\t\t" +  "$"+totalChips);


	System.out.println("  *  GUM   "+"\t"   +   Gumq +   "\t\t" +  "$"+totalGums   );
	
	System.out.println("  *  Pens   "+"  \t"     +   Penq  +  "\t\t" +   "$"+totalPens   );
	
	
	System.out.println( "--------------------------------------------------");
	
	System.out.printf("                              Sub Total = $%.2f", Stotal);
	System.out.println();
	System.out.printf("                              Sales Tax = $ %.2f" ,totaltax);
	System.out.println();
	System.out.printf("                                  TOTAL = $ %.2f" , totalafttx);
	System.out.println();
	//System.out.println("                                  TOTAL = $" +" "+totalafttx ); 
	
	System.out.println("..................THANK YOU.........................");
	scn.close();
	
	
	
}
	
}
