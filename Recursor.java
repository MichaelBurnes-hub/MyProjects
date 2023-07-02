import java.util.Scanner;
class Recursor
{
public static void main(String[] args)
{
int[] rayray = new int[5]; // variable declaration
Scanner s = new Scanner(System.in); //declaring new scanner
System.out.print("Enter five numbers: ");
for(int i = 0;i < 5;i++) //loop counter set for five iterations
rayray[i] = s.nextInt(); //Accepting array elements
System.out.println("The multiple of your five numbers is " + multiply (rayray,4)); //calling method multiply
}

public static int multiply(int x[], int count) // Called function
{
if(count < 0)
return 1; // return statement
return x[count] * multiply(x, --count); //recursive call
}
}