package shape;

public class SegitigaSikuSiku extends Segitiga{
    protected double alas;
    protected double tinggi;

    public SegitigaSikuSiku(double alas, double tinggi){
        this.nama = "Segitiga Siku Siku";
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return (this.alas * this.tinggi)/2;
    }

    public double getKeliling(){
        return Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2)) +  this.alas + this.tinggi;
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