import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ej1();
        ej2();
        ej3();
        ej4();
        ej5();
        ej6();
        ej7();
        ej8();
    }

    public static void ej1() {
        System.out.println("Ejercicio 1 | 1-10");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void ej2() {
        System.out.println("Ejercicio 2 | 10-1");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void ej3() {
        System.out.println("Ejercicio 3 | Suma 1-10");
        int i = 1;
        int suma = 0;
        while (i <= 10) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }

    public static void ej4() {
        System.out.println("Ejercicio 4 | 1-20 2-2");
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }

    public static void ej5() {
        System.out.println("Ejercicio 5 | Factorial 8");
        int i = 8;
        int factorial = 1;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println(factorial);
    }

    public static void ej6() {
        System.out.println("Ejercicio 6 | Num aleatorio 1-10");
        int numero = new Random().nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        boolean acertado = false;

        while (!acertado) {
            System.out.println("Dime un número");
            int str = input.nextInt();

            if (str == numero) {
                System.out.println("Has acertado");
                acertado = true;
            } else if (str < numero) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
        }
    }

    public static void ej7() {
        System.out.println("Ejercicio 7 | Divisibles entre 3");
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void ej8() {
        System.out.println("Ejercicio 8 | Login");
        Scanner sc = new Scanner(System.in);
        String login = "admin";
        String password = "admin";
        boolean loginn = false;

        while (!loginn) {
            System.out.println("Usuario:");
            String usu = sc.nextLine();
            System.out.println("Password:");
            String con = sc.nextLine();

            if (usu.equals(login) && con.equals(password)) {
                System.out.println("Logeado correctamente");
                loginn = true;
            } else {
                System.out.println("Incorrecto");

            }
        }
    }
}