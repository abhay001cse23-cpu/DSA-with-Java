import java.util.Scanner;

public class JavaBasicEx9 
{
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Radious of Circle : ");
    Float rad = sc.nextFloat();
    Float are = 3.14f * rad * rad;
    System.out.println(are);
   } 
}
