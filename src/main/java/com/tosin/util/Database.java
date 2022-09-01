package com.tosin.util;

import java.util.ArrayList;

/**
 * The Database class is a class that stores the information of the staffs in
 * the company
 */

public class Database {
    ArrayList<User> staffsInformation = new ArrayList<User>();

    int numberOfStaff;
    String firm;

    public Database(String nameOfFirm) {
        firm = nameOfFirm;
        numberOfStaff = 0;
    }

    /**
     * This function adds a staff to the staffsInformation arraylist
     * 
     * @param staff Object;
     */

    public void addStaff(User staff) {
        staffsInformation.add(staff);
        this.numberOfStaff++;
    }

    /**
     * It prints the staffs information in a table format
     */

    public void printStaff() {
        System.out.println("DATABASE OF STAFF IN " + this.firm + "'s company");
        System.out.printf("%-15s %-15s %-4s\n", "Name", "Role", "Age");
        for (User staff : staffsInformation) {
            System.out.printf("%-15s %-15s %-4d\n", staff.getStaffName(), staff.getRole(), staff.getAge());
        }

    }

    /**
     * @return The number of staff.
     */
    public String getNumberOfStaff() {

        return "Number of staff in " + this.firm + ": " + numberOfStaff;
    }

}
