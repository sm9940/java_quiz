package ch07.Quiz08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire =  snowTire;
        snowTire.run();
        tire.run();
    }
}
