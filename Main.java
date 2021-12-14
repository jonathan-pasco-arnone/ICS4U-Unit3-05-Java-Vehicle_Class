/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-14
*/

/**
* This program uses a custom class.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {

        final int five = 5;
        final int seventeen = 17;
        final int thirtyTwo = 32;
        final int eightySix = 86;

        // The first car
        final Vehicle car1 = new Vehicle("CASZ203", "Black", 4, 20);

        // A very reasonable car
        final Vehicle car2 = new Vehicle("IAMGOD", "Gold", 27, 9999999);

        System.out.println("\nThe max speed of the both the cars are "
            + car1.getMaxSpeed() + " and " + car2.getMaxSpeed());

        car2.accelerate(eightySix);
        System.out.println("\nCar2 has had their speed accelerated to "
            + car2.getSpeed());

        car2.brake(thirtyTwo);
        System.out.println("\nCar2 hit the brake to make their speed "
            + car2.getSpeed());

        car1.setLicensePlate("JAW808");
        System.out.println("\nCar1 has changed their license plate to "
            + car1.getLicensePlate());

        car2.setColour("Green");
        System.out.println("\nCar2 has changed the colourof their car to "
            + car2.getColour());

        car1.accelerate(seventeen);
        System.out.println("\nCar1 has had their speed accelerated to "
            + car1.getSpeed());

        System.out.println("\nCar1 is attempting to accelerate by 5");
        car1.accelerate(five);
    }
}
