package controllers;

import config.Db_config;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Db_config db_config = new Db_config();
        int i = -1;
        while (i != 4) {
            System.out.println("1=>Pc\n2=>Laptop\n3=>Printer\n4=>Exit");
            i = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch (i) {
                case 1:
                    System.out.println("Pc list");
                    db_config.getList("pc");
                    break;
                case 2:
                    System.out.println("Laptop list");
                    db_config.getList("laptop");
                    break;
                case 3:
                    System.out.println("Printer list");
                    db_config.getList("printer");
                    break;
                case 4:
                    break;

            }

        }
    }
}
