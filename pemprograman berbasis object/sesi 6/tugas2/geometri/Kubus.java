package geometri;
import shape.*;

public class Kubus extends Persegi implements Geometri{
    protected String nama;
    protected double sisi1;
    
    public Kubus(double sisi){
        super(sisi);
        this.nama = "Kubus";
        this.sisi1 = sisi;
    }

    public double getVolume(){
        return super.getLuas()*this.sisi1;
    }

    public double getLuasPermukaan() {
        return 6 * Math.pow(this.sisi, 2);
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
        System.out.printf("Volume    = %.1f",this.getVolume());
        System.out.printf("\nLuas Permukaan   = %.1f\n",this.getLuasPermukaan());
    }
}