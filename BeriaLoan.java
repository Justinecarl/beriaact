package BeriaLoan;


import java.util.Scanner;
public class BeriaLoan {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
       double InterestPerYear,InterestPerMonth = 0,InterestPerMonth2 = 0, MonthlyPayment,MonthlyPayment2=0,LoanMoney, LoanMOney2 , count=0 ;
   
       System.out.println("Input the value of loaned money: ");
       LoanMoney = myObj.nextInt();
       System.out.println("Input value of the interest per year: ");
       InterestPerYear = myObj.nextDouble();
       System.out.println("Input the value of monthly payment:");
       MonthlyPayment = myObj.nextDouble();
double ri = InterestPerYear/100;

while (LoanMoney > 0){
InterestPerYear = ri/12;
InterestPerMonth2 = LoanMoney*InterestPerMonth;
MonthlyPayment2 = MonthlyPayment - InterestPerYear;


    if (MonthlyPayment < InterestPerMonth2)
    {
     System.out.println();
         System.out.println("The monthly payment is too low and with this monthly "
              + "payment loan amount could not be repaid.");
          System.exit(0);
    }
      else{
               LoanMoney= LoanMoney - MonthlyPayment2 ;
               count++;
            
                }
}
                System.out.println();
                System.out.println("Number of months it would take to repay the loan :" + count +" months");
  
              

    }
    
}