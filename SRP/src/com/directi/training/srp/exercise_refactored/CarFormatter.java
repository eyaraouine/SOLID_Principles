package com.directi.training.srp.exercice_refactored;

public class CarFormatter {
    
    public String getCarsNames(Car[] cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    
}
