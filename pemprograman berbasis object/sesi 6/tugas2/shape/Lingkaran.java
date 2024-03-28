package shape;

public class Lingkaran implements Shape {
    protected String nama;
    protected double radius;

    public Lingkaran(double radius) {
        this.nama = "Lingkaran";
        this.radius = radius;
    }

    public double getLuas() {
        return Math.PI * this.radius * this.radius;
    }

    public double getKeliling() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double value) {
        this.radius = value;
    }

    public void getInfo() {
        System.out.println("Informasi " + this.nama);
        System.out.println("Radius    = " + this.radius);
        System.out.println("Luas      = " + this.getLuas());
        System.out.println("Keliling  = " + this.getKeliling());
    }
}
