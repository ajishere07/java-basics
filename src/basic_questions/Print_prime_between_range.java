package basic_questions;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Print_prime_between_range {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();


        for(int n = low; n <= high;n++){


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
