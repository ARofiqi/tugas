package bangundatar;

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double luas(){
        return sisi * sisi;
    }

    public double keliling(){
        return 4 * sisi;
    }   
}