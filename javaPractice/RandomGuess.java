package javaPractice;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("..........Welcome to Guessing Game........");
        System.out.println("Here you can guess the number. If you guess right there will be rewards waiting for you just text me to get your reward");
        System.out.println(" If your guess is right just screenshot it and email me");
        System.out.println("Chaleye phr shoro krte hain...");
        System.out.println("Guess the number between 1-100");
        Random random = new Random();
        int rn = random.nextInt(100);

        System.out.println("Enter your guess: ");
        int guess = sc.nextInt();
        if(guess == rn){
            System.out.println("Your guess is "+guess+" which matches "+rn);
            System.out.println("congratulation u guessed it right..");
        }else if(guess<rn){
            System.out.println("low");
        }else System.out.println("high");
        sc.close();
    }
}
