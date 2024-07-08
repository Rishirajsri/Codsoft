import java.util.*;
class Grade
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER MARKS IN PHYSICS OUT OF 100");
    int p=sc.nextInt();
    System.out.println("ENTER MARKS IN CHEMISTRY OUT OF 100");
    int c=sc.nextInt();
    System.out.println("ENTER MARKS IN MATHS OUT OF 100");
    int m=sc.nextInt();
    System.out.println("ENTER MARKS IN ENGLISH OUT OF 100");
    int e=sc.nextInt();
    System.out.println("ENTER MARKS IN COMPUTER OUT OF 100");
    int com=sc.nextInt();
    int total=p+c+m+e+com;
double avg=total/5.0;
System.out.println("YOUR TOTAL MARKS OUT OF 500 IS "+total);
System.out.println("YOUR AVERAGE PERCENTAGE IS="+avg);
if(avg>=90)
System.out.println("GRADE=EXCELLENT");
else if(avg>=80.00&&avg<=89.00)
System.out.println("GRADE=VERY GOOD");
else if(avg>=70.00&&avg<=79.00)
System.out.println("GRADE= GOOD");
else if(avg>=60.00&&avg<=69.00)
System.out.println("GRADE= NEED IMPROVEMENT");
else if(avg>=40.00&&avg<=59.00)
System.out.println("GRADE= JUST PASSED NEED TO WORK HARDER");
else
System.out.println("GRADE=FAILED");
}
}
    
    