import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int number= new Scanner(System.in) .nextInt();
        System.out.println("Введите второе число");
        int number2= new Scanner(System.in) .nextInt();
        double division= (double) number2/number;
        System.out.println("Сумма равна "+(number2+number));
        System.out.println("Разность  равна "+(number2-number));
        System.out.println("Произведение чисел "+(number2*number));
        System.out.println("Частное чисел " +division);
    }
}