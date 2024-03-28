package geometri;

public class Tabung implements Geometri{
    protected String nama;
    protected double radius;
    protected double tinggi;
    
    public Tabung(double radius, double tinggi){
        this.nama = "Tabung";
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double getVolume(){
        return Math.PI * Math.pow(this.radius, 2) * this.tinggi;
    }

    public double getLuasPermukaan() {
        return 2 * Math.PI * this.radius * (this.radius + this.tinggi);
    }

    public double getRadius() {
        return this.radius;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setRadius(double value) {
        this.radius = value;
    }

    public void setTInggi(double value) {
        this.tinggi = value;
    }

    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Radius    = "+this.radius);
        System.out.println("Tinggi    = "+this.tinggi);
        System.out.printf("Volume    = %.1f",this.getVolume());
        System.out.printf("\nLuas Permukaan   = %.1f\n",this.getLuasPermukaan());
    }
}