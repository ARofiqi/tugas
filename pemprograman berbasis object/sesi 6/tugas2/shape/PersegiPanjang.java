package shape;

public class PersegiPanjang implements Shape{
    protected String nama;
    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.nama = "Persegi Panjang";
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas(){
        return this.panjang * this.lebar;
    }

    public double getKeliling(){
        return 2 * (this.panjang + this.lebar);
    }

    public double getPanjang(){
        return this.panjang;
    }

    public double getLebar(){
        return this.lebar;
    }

    public void setPanjang(double value){
        this.panjang = value;
    }

    public void setLebar(double value){
        this.lebar = value;
    }

    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Lebar     = "+this.lebar);
        System.out.println("Panjang   = "+this.panjang);
        System.out.println("Luas      = "+this.getLuas());
        System.out.println("Keliling  = "+this.getKeliling());
    }
}