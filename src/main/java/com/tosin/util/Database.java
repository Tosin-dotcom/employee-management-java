package com.tosin.util;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The Database class is a class that stores the information of the staffs in
 * the company
 */

public class Database {
    ArrayList<HashMap<String, Object>> staffsInformation = new ArrayList<HashMap<String, Object>>();

    int numberOfStaff;
    String firm;

    public Database(String nameOfFirm) {
        firm = nameOfFirm;
        numberOfStaff = 0;
    }

    /**
     * This function adds a staff to the staffsInformation arraylist
     * 
     * @param staff HashMap&lt;String, Object&gt;
     */

    public void addStaff(HashMap<String, Object> staff) {
        staffsInformation.add(staff);
        this.numberOfStaff++;
    }

    /**
     * It prints the staffs information in a table format
     */

    public void printStaff() {
        System.out.println("DATABASE OF STAFF IN " + this.firm + "'s company");
        System.out.printf("%-15s %-15s %-4s\n", "Name", "Role", "Age");
        for (HashMap<String, Object> staff : staffsInformation) {
            // System.out.format("%-10s% %-15s% %-4n%", staff);
            System.out.printf("%-15s %-15s %-4d\n", staff.get("name"), staff.get("role"), staff.get("age"));
        }

    }

    /**
     * @return The number of staff.
     */
    public String getNumberOfStaff() {

        return "Number of staff in " + this.firm + ": " + numberOfStaff;
    }

}
