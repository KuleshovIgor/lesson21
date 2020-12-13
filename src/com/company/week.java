package com.company;



import java.io.IOException;
import java.util.Scanner;


public class week {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Чтобы узнать день недели, введите число от 1 до 7 - ");
        int n = scan.nextInt();



        switch (n) {
            case 1 -> System.out.println("Понедельник");

            case 2 -> System.out.println("Вторник");

            case 3 -> System.out.println("Среда");

            case 4 -> System.out.println("Четверг");

            case 5 -> System.out.println("Пятница");

            case 6 -> System.out.println("Суббота");

            case 7 -> System.out.println("Воскресенье");

            default -> System.out.println("Вы ввели не правильное число!");
        }



    }


}

