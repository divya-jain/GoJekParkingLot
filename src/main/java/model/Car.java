package model;

import com.sun.org.apache.regexp.internal.RE;

public class Car {

    private String registratonNo;
    private String color;

    public Car(String RegNo, String color) {

        this.registratonNo= RegNo;
        this.color=color;
    }

    public String getRegistratonNo() {
        return registratonNo;
    }

    public String getcolor() {
        return color;
    }
}
