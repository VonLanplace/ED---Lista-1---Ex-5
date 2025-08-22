package view;

import controller.Serie;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Serie sc = new Serie();
        Scanner in = new Scanner(System.in);
        int input = 0;
        while (true) {
            System.out.print("Insira um número: ");
            input = in.nextInt();
            if (input > 0) {
                in.close();
                break;
            }
            System.out.println("Valor inválido!\n");
        }

        System.out.print("O valor de com ");
        System.out.print(input);
        System.out.print(" termos é ");
        System.out.print(sc.serie(input));
        System.out.print("\n");
    }
}
