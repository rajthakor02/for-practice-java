import java.util.Scanner;

public class Maxnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter 3 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println(num1+"is the greatest number.");
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            System.out.println(num2+"is the greatest number.");
        }
        else
        {
            System.out.println(num3+"is the greatest number.");
        }

    }
    
}
