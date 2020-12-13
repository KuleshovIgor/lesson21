import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class TimeOfTheYear {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Чтобы узнать пору года введите номер месяца от 1 до 12");

        int n = scan.nextInt();

        if (n >= 1 && n <= 2  ){
            System.out.println("Зима");
        }
        else if (n >=3 && n <= 5){
            System.out.println("Весна");
            }
        else if (n >= 6 && n <= 8) {
                System.out.println("Лето");
            }
        else if (n >= 9 && n <= 11) {
                System.out.println("Осень");
            }
        else if (n == 12) {
                System.out.println("Зима");
            }
        else if (n < 1 || n > 12) {
                System.out.println("Вы что-то напутали! =) попробуйте еще раз)");
            }


    }
}
