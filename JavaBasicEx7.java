import java.util.Scanner;
public class JavaBasicEx7 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Eneter The First Number : ");
    int a = sc.nextInt();
    System.out.println("Enter The Second Number : ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("Result : " + sum);
    sc.close();
}
}