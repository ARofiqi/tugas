package shape;

public class SegitigaSamaKaki extends Segitiga{
    protected double alas;
    protected double tinggi;

    public SegitigaSamaKaki(double alas, double tinggi){
        this.nama = "Segitiga Sama Kaki";
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return (this.alas * this.tinggi)/2;
    }

    public double getKeliling(){
        return 2 * this.alas + this.tinggi;
    }

    public double getAlas(){
        return this.alas;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public void setAlas(double value){
        this.alas = value;
    }

    public void setTinggi(double value){
        this.tinggi = value;
    }

    @Override
    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Alas     = "+this.alas);
        System.out.println("Tinggi   = "+this.tinggi);
        super.getInfo();
    }
}