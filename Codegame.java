
import java.util.*;
class Codegame
{
public static void main(String args[])
{ 
    int t=0,c=0;
Random r=new Random();
int num=r.nextInt(100)+1;
Scanner sc=new Scanner(System.in);
System.out.println("GUESS A NUMBER BETWEEN 1 TO 100");
for(int i=3;i>=1;i--)
{
 
System.out.println("NOTE: YOU HAVE " +i +" ATTEMPTS LEFT");
int n=sc.nextInt();
if(n==num)
{
System.out.println("CONGRATULATIONS!! YOU GUESSED THE CORRECT NUMBER");
c++;
break;
}
else if(n>num)
System.out.println("YOU GUESSED THE LARGER NUMBER");
else
System.out.println("YOU GUESSED THE SMALLER NUMBER");
}
t+=3;
System.out.println("DO YOU WANT TO PLAY ONE MORE ROUND");
System.out.println("IF YES,TYPE YES!!");
String st=sc.next();
st=st.toUpperCase();
switch(st)
{
    case "YES":
        Random rs=new Random();
int ns=rs.nextInt(100)+1;
System.out.println("GUESS A NUMBER BETWEEN 1 TO 100");
for(int i=3;i>=1;i--)
{
 
System.out.println("NOTE: YOU HAVE " +i +" ATTEMPTS LEFT");
int n=sc.nextInt();
if(ns==num)
{
System.out.println("CONGRATULATIONS!! YOU GUESSED THE CORRECT NUMBER");
c++;
break;
}
else if(n>num)
System.out.println("YOU GUESSED THE LARGER NUMBER");
else
System.out.println("YOU GUESSED THE SMALLER NUMBER");
}
t+=3;
}
System.out.println("YOUR SCORE IS "+c+" OUT  OF "+t);
}
}
