package com.tosin;

import java.util.Scanner;
import java.util.HashMap;
//import com.google.common.collect.ImmutableMap;
import com.tosin.util.Database;

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
                            HashMap<String, Object> staffInformation = new HashMap<String, Object>();
                            scanner.nextLine();

                            System.out.println("Enter Staff name: ");
                            String name = scanner.nextLine();

                            System.out.println("Enter role in firm: ");
                            String role = scanner.nextLine();

                            System.out.println("Enter age: ");
                            int age = scanner.nextInt();

                            // immutableMap<String, Object> staffInformation = new immutableMap<String,
                            // Object>builder()
                            staffInformation.put("name", name);
                            staffInformation.put("role", role);
                            staffInformation.put("age", age);

                            obj.addStaff(staffInformation);
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
