import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
          Scanner x = new Scanner(System.in);
          int n = x.nextInt();
          int r,s=0,m=n;
          while(n!=0)
          {
             r=n%10;
             s+=(r*r*r);
             n/=10;
           }
           if(s==m)
           {
              System.out.println("Yes,"+m+" is an Armstrong number");
            }
            else
            {
               System.out.println("No,"+m+" is not an Armstrong number");
            }
       }
   }
