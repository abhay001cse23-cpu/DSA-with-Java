import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class JavaBasicEx8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Frist Number :");
        float num1 = sc.nextFloat();
        System.out.print("Enter The Second Number : ");
        float num2 = sc.nextFloat();
        float Product = (num1 * num2);
        System.out.println("Product of The Number : "+Product);
    }
}
