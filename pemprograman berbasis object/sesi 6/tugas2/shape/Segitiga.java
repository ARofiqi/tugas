package shape;

abstract class Segitiga {
    protected String nama;

    public abstract double getLuas();
    public abstract double getKeliling();

    public void getInfo(){
        System.out.printf("Luas     = %.1f", this.getLuas());
        System.out.printf("\nKeliling = %.1f\n", this.getKeliling());
    };
}