package geometri;

public class Balok implements Geometri{
    protected String nama;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        this.nama = "Balok";
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getVolume(){
        return this.panjang * this.lebar * this.tinggi;
    }

    public double getLuasPermukaan() {
        return 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
    }

    public double getPanjang(){
        return this.panjang;
    }
    
    public double getLebar(){
        return this.lebar;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public void setPanjang(double value){
        this.panjang = value;
    }

    public void setLebar(double value){
        this.lebar = value;
    }

    public void setTinggi(double value){
        this.tinggi = value;
    }

    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Panjang   = "+this.panjang);
        System.out.println("Lebar     = "+this.lebar);
        System.out.println("Tinggi    = "+this.tinggi);
        System.out.printf("Volume    = %.1f",this.getVolume());
        System.out.printf("\nLuas Permukaan   = %.1f\n",this.getLuasPermukaan());
    }
}