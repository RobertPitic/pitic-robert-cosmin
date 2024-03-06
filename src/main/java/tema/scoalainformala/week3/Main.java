package tema.scoalainformala.week3;

public class Main {
    public static void main(String[] args) {
        ToyotaCar supraMk4 = new ToyotaCar("SupraMK4", "TYS619", 62, "Diesel", 6, 10.4, 15, 55);
        ToyotaCar supraMk5 = new ToyotaCar("SupraMK5", "TYS624", 75, "Petrol", 6, 13.1, 16, 60);

        BmwCar pisicuta = new BmwCar("320i", "PIS203", 58, "Diesel", 6, 7.5, 17, 50);
        BmwCar urs = new BmwCar("e30", "URS199", 60, "Petrol", 6, 8.1, 16, 55);

        supraMk4.start();
        supraMk4.drive(100, 3);
        supraMk4.stop();

        System.out.println();

        supraMk5.start();
        supraMk5.drive(50, 7);
        supraMk5.stop();

        System.out.println();

        pisicuta.start();
        pisicuta.drive(30, 5);
        pisicuta.stop();

        System.out.println();

        urs.start();
        urs.drive(12, 5);
        urs.stop();
    }
}
