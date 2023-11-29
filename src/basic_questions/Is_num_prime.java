package basic_questions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

//  FIND NUMBER IS PRIME OR NOT
public class Is_num_prime {

    //fun for prime detection
    Boolean is_prime(int a ){
        Boolean ans = false;

        if(a%2!=0) ans = true;
        else if(a == 2) ans = true;
        else if(a==1 ) ans=false;

        return ans;
    }

    void fun_to_rapidly_check(){
        System.out.println("How many numbers are there?");
        Scanner num_input_scanner  = new Scanner(System.in);
        int i=1;
        int how_many_times_program_runs = num_input_scanner.nextInt();
        do{
            System.out.println("Enter the number");

            int num_container  =  num_input_scanner.nextInt();
            Boolean answer = is_prime(num_container);
            if(answer) System.out.println("prime");
            else System.out.println("not prime ");

            i++;
        }while( i <= how_many_times_program_runs);


    }
    public static void main(String[] args) {
//        Is_num_prime obj = new Is_num_prime();
//
//        obj.fun_to_rapidly_check();


//        optimized version

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 0; i < t; i++){
            int n = scn.nextInt();

            int count = 0;
            for(int div=2;div <= sqrt(n);div++){
                if(n%div ==0){
                    count++;
                    break;
                }
            }

            if(count == 0) System.out.println("prime");
            else System.out.println("not prime");

        }

    }
}
