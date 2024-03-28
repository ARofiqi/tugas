package shape;

public class SegitigaSembarang extends Segitiga{
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;
    
    public SegitigaSembarang(double sisi1, double sisi2, double sisi3){
        this.nama = "Segitiga Sembarang";
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getLuas(){
        double s = (this.sisi1 + this.sisi2 + this.sisi3) / 2;
        return Math.sqrt(s * (s - this.sisi1) * (s - this.sisi2) * (s - this.sisi3));
    }

    public double getKeliling(){
        return this.sisi1 + this.sisi2 + this.sisi3;
    }

    public double getSisi1(){
        return this.sisi1;
    }
    
    public double getSisi2(){
        return this.sisi2;
    }

    public double getSisi3(){
        return this.sisi3;
    }

    public void setSisi1(double value){
        this.sisi1 = value;
    }

    public void setSisi2(double value){
        this.sisi2 = value;
    }

    public void setSisi3(double value){
        this.sisi3 = value;
    }

    @Override
    public void getInfo(){
        System.out.println("Informasi " + this.nama);
        System.out.println("Sisi 1   = "+this.sisi1);
        System.out.println("Sisi 2   = "+this.sisi2);
        System.out.println("Sisi 3   = "+this.sisi3);
        super.getInfo();
    }
}