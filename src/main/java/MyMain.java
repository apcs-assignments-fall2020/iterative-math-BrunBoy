import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double meerick=0.0;
        double krummy=50.0;
        while (Math.abs(krummy-meerick)>0.00001){
            meerick=krummy;
            krummy=(krummy+(x/krummy))/2;
        }
        return krummy;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        if (x==0){
            return 1;
        }
        else{
            int papa=1;
            for (int i=x-1; i>0; i--){
                papa*=x;
                x=x-1;
            }
            return papa;
        }
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e=0;
        int i=0;
        while (Math.E-e>0.00001){
            e=e+1/factorial(i);
            i++;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number!");
        int mixie=scan.nextInt();
        babylonian(mixie);
        System.out.println("The square root of your number is "+babylonian(mixie));
        factorial(mixie);
        System.out.println("The factorial is "+factorial(mixie));
        calculateE();
        System.out.println("The value of e is roughly "+calculateE());



        // YOUR CODE HERE


        

        scan.close();
    }
}
