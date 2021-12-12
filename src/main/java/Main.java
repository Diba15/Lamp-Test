public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(true, true);
        lamp.lampOff();
        System.out.println("Lampu Nyala: " + lamp.isOn());
    }
}
