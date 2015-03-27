package nyc.c4q.madelyntav;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("What is your favorite word?");
        String input= scanner.nextLine();

        for (int i = input.length(); i>0;i--){
           String input2= String.valueOf((input.toLowerCase().charAt(i-1)));
            System.out.print(input2);
        }



    }
}
