import java.util.Scanner;
public class Program1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("1-ADDITION \n 2-SUBTRACTION \n 3-MULTIPLICATION \n 4-DIVISION");
        int choice=sc.nextInt();
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(choice){
            case 1: System.out.println("Addition: " + (a + b));
                    break;

            case 2: System.out.println("Subtraction: " + (a - b));
                    break;
            case 3: System.out.println("Multiplication: " + (a * b));
                    break;
            case 4: 
                if(b != 0){ 
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
        }
        
    }
}