import java.util.Scanner;

public class Main {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Sum: "+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Minus: "+result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Multiply: "+result);
        return  result;
    }
    static int divided(int a,int b){
        if (b==0){
            System.out.println("Enter the second number other than 0");
        return 0;
        }

        int result=a/b;

        System.out.println("Divided: "+result);
        return result;
    }
    static int power(int a,int b){
        int result =1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a % b;
    }
    static void  calc(int a,int b){
        System.out.println("Perimeter: "+(2*(a+b)));
        System.out.println("Area: "+(a*b));
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int select;
        String menu=
                "1- Addition \n "
                +"2- Subtraction \n"
                +"3- Multiplication \n"
                +"4- Division \n"
                +"5- Exponent Number \n"
                +"6- Getting Mood\n"
                +"7- Rectangular Area and Perimeter Calculation \n"
                +"8- Exit";
        System.out.println(menu);
        while (true) {

           System.out.print("Choose Acion: ");
           select = scan.nextInt();
           if (select==0){
               break;
           }
           System.out.print("Enter First Number: ");
           int a = scan.nextInt();
           System.out.print("Enter Second Number: ");
           int b = scan.nextInt();
           switch (select) {
               case 1:
                   sum(a, b);
                   break;
               case 2:
                   minus(a,b);
                   break;
               case 3:
                   times(a,b);
                   break;
               case 4:
                 divided(a,b);
                   break;
               case 5:
                   System.out.println("Power: "+power(a,b));
                   break;
               case 6:
                   System.out.println("Mod: "+mod(a,b));
               case 7:
                   calc(a,b);
                   break;
               default:
                   System.out.println("You entered an invalid transaction");
           }


       }
        System.out.println("Good Bye");
    }
}