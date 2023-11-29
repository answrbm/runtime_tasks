package lesson8.hometask;

import java.util.Scanner;

public class SpringScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.equals("Весна")) {
                System.out.println("Вы угадали сезон");
                break;
            } else if(line.equals("end")) {
                System.out.println("До свиданмя");
                break;
            } else {
                System.out.println("Попробуйте угадать еще раз");
            }
        }
    }
}
