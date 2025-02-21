import java.util.Scanner;
class MeterToFeetConverter
{
    public static void main(String[] args)
    {
float meters;
Scanner s = new Scanner(System.in);
System.out.println("enter value in meters:-");
meters=s.nextFloat();
float feet = (meters)/3;
System.out.println("Feet=" +feet);
}
}