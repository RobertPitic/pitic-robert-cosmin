package tema.scoalainformala.week4;

public class Alcatel extends Phone {
    String imei;

    public Alcatel(String model, int batteryLife, String color, String material, String imei) {
        super(model, batteryLife, color, material);
        this.imei = imei;
    }
}
