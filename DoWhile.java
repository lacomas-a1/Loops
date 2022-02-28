package Loop;

import java.util.Scanner;

public class DoWhile {
    private static Scanner sc;

    public static void main(String[]args){
        int Number,Sum=0;
        sc=new Scanner(System.in);

        System.out.println("\n Please Enter an Integer Below 10:");
        Number=sc.nextInt();

        do{
            Sum=Sum+Number;
            Number --;

        }while(Number >0);
        System.out.format("Sum Of The Numbers:%d",Sum);
    }
}
//    First Iteration
//sum = sum + number
//        sum = 0 + 4 ==> 4
//
//        Next, the number will be decremented by 1 (number –).
//        Next, the condition inside the while is True or Not. Here, 3 > 0 is True
//
//        Second Iteration: Within the first Iteration, the values of both Number and sum changed as Number = 3 and sum = 4
//        sum = 4 + 3 ==> 7
//        After the decrement (number –), check the While Loop condition. Here, 2 > 0 is True
//
//
//        Third Iteration
//        Within the Second Iteration of Java Do While Loop, the values of both changed as Number = 2 and sum = 7
//        sum = 7 + 2 ==> 9
//
//        After the decrement, the condition (1 > 0) is True
//
//        Fourth Iteration
//        After the third Iteration, Number = 1 and sum = 9
//        sum = 9 + 1 ==> 10
//
//
//        Next, the number will be decremented by 1 (number –).
//
//        Next, the condition inside the while is True or Not. Here, 0 > 0 is False.
//
//        Last System.out.format statement in the do while loop example will print the number of digits present in the given number as output.

//First, it will execute the statements inside curly brackets, and then after reaching the end, it will check the condition inside the while. If the condition is True, then it will repeat the process. If the condition fails, then Java Do While Loop will be terminated.