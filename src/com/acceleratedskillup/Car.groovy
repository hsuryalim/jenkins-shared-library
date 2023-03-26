package com.acceleratedskillup;

class Car {
    int numberOfDoors
    String brand
    String model
    def script

    Car(script) {
        this.script = script
    }

    void printOutCar() {
        script.echo "number of doors: ${numberOfDoors}"
        script.echo "model: ${model}"
        script.echo "brand: ${brand}"
    }

    void printOutCar2() {
        echo "number of doors is ${numberOfDoors}"
    }
}