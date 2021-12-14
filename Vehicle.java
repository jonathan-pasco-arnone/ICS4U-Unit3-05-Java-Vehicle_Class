/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-14
*/

/**
* This is the class that contains many functions.
*/
public final class Vehicle {

    /**
    * The license Plate.
    */
    private String licensePlate;

    /**
    * The colour of the vehicle.
    */
    private String colour;

    /**
    * The number of doors.
    */
    private int doorQuantity;

    /**
    * The current speed.
    */
    private int speed;

    /**
    * The max speed.
    */
    private int maxSpeed;

    /**
    * This function takes the initial values of a vehicle.
    *
    * @param startLicensePlate the starting license plate number
    * @param startColour the starting colour
    * @param startDoorQuantity the number of doors on the vehicle
    * @param vehicleMaxSpeed the maximum speed of the car
    */
    public Vehicle(final String startLicensePlate, final String startColour,
                    final int startDoorQuantity, final int vehicleMaxSpeed) {
        licensePlate = startLicensePlate;
        colour = startColour;
        doorQuantity = startDoorQuantity;
        speed = 0;
        maxSpeed = vehicleMaxSpeed;
    }

    /*
    *
    * Getters
    *
    */

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public String getColour() {
        return colour;
    }

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public int getDoorQuantity() {
        return doorQuantity;
    }

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public int getSpeed() {
        return speed;
    }

    /**
    * Gets the value.
    *
    * @return returns the value
    */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /*
    *
    * Setters
    *
    */

    /**
    * Sets the value.
    *
    * @param newLicensePlate the new license plate
    */
    public void setLicensePlate(final String newLicensePlate) {
        licensePlate = newLicensePlate;
    }

    /**
    * Sets the value.
    *
    * @param newColour the new license plate
    */
    public void setColour(final String newColour) {
        colour = newColour;
    }

    /*
    *
    * Other Functions
    *
    */

    /**
    * Accelerates a car.
    *
    * @param acceleration the amount ot which the speed will be amplified
    */
    public void accelerate(final int acceleration) {
        if (acceleration + speed > maxSpeed) {
            System.out.println("\nCannot accelerate more than the maximum speed");
        } else {
            speed = speed + acceleration;
        }
    }

    /**
    * Applies brakes to a car.
    *
    * @param brakeAmount the amount to which the speed will be reduced
    */
    public void brake(final int brakeAmount) {
        if (brakeAmount > speed) {
            System.out.println("\nCannot brake more than the current speed");
        } else {
            speed = speed - brakeAmount;
        }
    }
}
