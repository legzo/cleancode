package com.orange.ccmd.clean;

import com.orange.ccmd.clean.utils.*;

import java.util.ArrayList;
import java.util.List;

public class MyAwfulClass {

    /**
     * Intention revealing names
     */
    private int d; // elapsed time in days

    /**
     * Similar names
     */
    private XYZControllerForEfficientHandlingOfStrings handler;

    private XYZControllerForEfficientStorageOfStrings otherHandler;

    /**
     * Hungarian notation
     */
    private PhoneNumber phoneString;

    /**
     * One word per concept
     */
    private DeviceController controller;

    private DeviceManager controller2;

    private int[][] theList;

    /**
     *
     */
    public List<int[]> getTheList() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4) list1.add(x);
        return list1;
    }

    private int age;


    /**
     * Gets the age, duh
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the user
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
