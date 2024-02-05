import java.util.Scanner;

public class Domashka_132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число" );
        double x = scanner.nextDouble();
        System.out.println("Вы ввели "+x );

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе число" );
        double z= scanner1.nextDouble();
double s=x+z;
double v=x-z;
        System.out.println("Сумма чисел будет :"+s);
        System.out.println("Разность чисел будет :"+v);



    }
}
