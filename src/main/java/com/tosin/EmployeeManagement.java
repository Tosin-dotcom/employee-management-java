package com.tosin;

import java.util.Scanner;
import com.tosin.util.Database;
import com.tosin.util.User;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there");
        System.out.println("Welcome to this Employee Management System");

        System.out.println("Enter the name of your firm: ");
        String nameOfFirm = scanner.nextLine();
        System.out.println("The firm is " + nameOfFirm);

        Database obj = new Database(nameOfFirm);

        while (true) {
            System.out.println(
                    "Enter number to continue. Please -1 to end program \n1. Add Employee \n2. Get number of Employee \n3. Print all employee");

            String ans = scanner.nextLine();

            if (ans.equals("-1")) {
                break;
            }

            switch (ans) {
                case "1":
                    try {
                        System.out.println("Enter number of employee to add");
                        int num = scanner.nextInt();
                        for (int i = 0; i < num; i++) {

                            scanner.nextLine();

                            System.out.println("Enter Staff name: ");
                            String name = scanner.nextLine();

                            System.out.println("Enter role in firm: ");
                            String role = scanner.nextLine();

                            System.out.println("Enter age: ");
                            int age = scanner.nextInt();

                            User staff = new User(name, role, age);
                            obj.addStaff(staff);

                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case "2":
                    System.out.println(obj.getNumberOfStaff());
                    break;

                case "3":
                    obj.printStaff();
                    break;

                default:
                    break;

            }
        }

        scanner.close();
    }

}
