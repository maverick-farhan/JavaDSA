import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter Operator(+,-,/,*) number1 number2");
            //ch is operator for the arithmetic to perform
            System.out.println("Press Ctrl+C to exit the code\n");
            char ch = in.next().trim().charAt(0);
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            switch(ch){
                case '+':
                    System.out.println("Answer: "+ (num1+num2)+"\n");
                    break;
                case '-':
                    System.out.println("Answer: "+ (num1-num2)+"\n");
                    break;
                case '*':
                    System.out.println("Answer: "+ (num1*num2)+"\n");
                    break;

                case '/':
                    System.out.println("Answer: "+ (num1/num2)+"\n");
                    break;
                default:
                    System.out.println("Enter valid operations \n");
            }
        }
    }
}
