package shape;

public class SegitigaSamaSisi extends Segitiga{
    protected double sisi;

    public SegitigaSamaSisi(double sisi){
        this.nama = "Segitiga Sama Sisi";
        this.sisi = sisi;
    }

    public double getLuas(){
        return (this.sisi * this.sisi * Math.sqrt(3)) / 4;
    }

    public double getKeliling(){
        return 3 * this.sisi;
    }

    public double getSisi(){
        return this.sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Sisi     = "+this.sisi);
        super.getInfo();
    }
}