package shape;

public class Persegi implements Shape{
    protected String nama;
    protected double sisi;

    public Persegi(double sisi){
        this.nama = "Persegi";
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return 4 * this.sisi;
    }

    public double getSisi(){
        return this.sisi;
    }

    public void setSisi(double value){
        this.sisi = value;
    }

    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Sisi      = "+this.sisi);
        System.out.println("Luas      = "+this.getLuas());
        System.out.println("Keliling  = "+this.getKeliling());
    }
}