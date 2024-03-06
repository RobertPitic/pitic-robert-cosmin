package tema.scoalainformala.week4;

public class Motorola extends Phone {
    String imei;

    public Motorola(String model, int batteryLife, String color, String material, String imei) {
        super(model, batteryLife, color, material);
        this.imei = imei;
    }
}
