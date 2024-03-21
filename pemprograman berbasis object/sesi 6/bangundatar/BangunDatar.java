package bangundatar;

public abstract class BangunDatar{
    public abstract double luas();
    public abstract double keliling();

    public void getInfo(){
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
} 

