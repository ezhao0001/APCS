
import java.util.Scanner;
import java.lang.Math;
public class MiniCalculator{
    public static void main (String [] args){
        System.out.println("What type of operation do you wish to perform?");
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3.multiply");
        System.out.println("4.divide");
        System.out.println("0.exit");
        
        Scanner op = new Scanner (System.in);
        int p = op.nextInt();
        Scanner input = new Scanner (System.in);
        double value1=0;
        double value2=0;
        double value3=0;
        double value4= 0;
        System.out.println("What is the first value?");
        value1=input.nextDouble();
        System.out.println("What is the second value?");
        value2=input.nextDouble();
        
 
        if (p == 1){
                double sum = (value1 + value2);
               System.out.println("sum: "+ sum);
            } 
        if (p == 2){
                double difference = (value1-value2);
                System.out.println("difference: "+ difference);
            }
            if (p == 3){
            double product = (value1*value2);
            System.out.println("product: " + product);
        }
        if (p == 4){
                double quotient = (value1/value2);
                System.out.println("quotient:" + quotient);
            }
        if (p == 0){
                  System.exit(0);
           }
        while (p !=0){
              System.out.println("What type of operation do you wish to perform?");
              int a = op.nextInt();
              if (a == 0){
                  System.exit(0);
           }
              System.out.println("What is the first value?");
              value3=input.nextDouble();
              System.out.println("What is the second value?");
              value4=input.nextDouble();
              
             if (a == 1){
                double sum1 = (value3 + value4);
               System.out.println("sum: "+ sum1);
            } 
              if (a == 2){
                double difference1 = (value3-value4);
                System.out.println("difference: "+ difference1);
            }
            if (a == 3){
                double product1 = (value3*value4);
                System.out.println("product: " + product1);
            }
            if (a == 4){
                double quotient1 = (value3/value4);
                System.out.println("quotient:" + quotient1);
            }
        }
    }
}
