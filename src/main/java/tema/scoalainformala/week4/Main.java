package tema.scoalainformala.week4;

public class Main {
    public static void main(String[] args) {
        Alcatel alcatel1 = new Alcatel("1S", 12394, "black", "indestructible", "123#33");
        Alcatel alcatel2 = new Alcatel("1X", 9923, "pink", "indestructible", "523#35");
        Motorola motorola1 = new Motorola("edge 40", 19924, "yellow", "metal", "99#441");
        Motorola motorola2 = new Motorola("g84", 13991, "dark-blue", "plastic", "1182#51");

        alcatel1.addContact("0712332122", "Andrei", "Cosmin");
        motorola2.addContact("0736351315", "Robi", "Beteagu");

        alcatel1.sendMessage("0712332122", "Salut");
        System.out.println();

        alcatel1.call("0736351315");
        System.out.println();
        System.out.println();

        alcatel1.viewHistory();
        alcatel1.viewMessages("0712332122");
    }
}
