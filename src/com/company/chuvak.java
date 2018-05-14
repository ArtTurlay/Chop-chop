package com.company;

public class chuvak {

    private String firstName;
    private String lastName;
    private int number;

    public double getHeight() {
        return height;
    }

    private double height;


    public void setNumber(int number) {
        this.number = number;
    }

    public chuvak(String firstName, String lastName, int number, double height ){
            this.lastName = lastName;
            this.firstName = firstName;
            this.number = number;
            this.height = height;    }

            public chuvak(){

            }
            public void showChuvak(){
                System.out.println("Чушь" + firstName + lastName + number + height );
            }
}
