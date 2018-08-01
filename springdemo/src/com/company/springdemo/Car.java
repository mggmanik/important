package com.company.springdemo;

public class Car {

    private String carName;
    private String carType;
    private String carModel;

    public Car()
    {

    }

    public Car(String carName, String carType, String carModel) {
        this.carName = carName;
        this.carType = carType;
        this.carModel = carModel;
    }

    public void showDetails()
    {
        System.out.println("Name: "+ carName);
        System.out.println("Type: "+carType);
        System.out.println("Model: "+carModel);
    }
}
