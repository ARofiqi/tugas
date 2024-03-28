package geometri;

public class Bola implements Geometri{
    protected String nama;
    protected double radius;
    
    public Bola(double radius){
        this.nama = "Bola";
        this.radius = radius;
    }

    public double getVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    public double getLuasPermukaan() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double value) {
        this.radius = value;
    }

    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Radius    = "+this.radius);
        System.out.printf("Volume    = %.1f",this.getVolume());
        System.out.printf("\nLuas Permukaan   = %.1f\n",this.getLuasPermukaan());
    }
}