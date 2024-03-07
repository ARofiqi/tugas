class S_SamaSisi extends Segitiga {

  public S_SamaSisi(double sisi) {
    super(sisi, Math.sqrt(Math.pow(sisi, 2) - Math.pow(sisi / 2, 2)));
    this.setNama("Segitiga Sama Sisi");
  }

  @Override
  public void getInfo() {
    System.out.println("\nInformasi Segitiga Sama Sisi:");
    super.getInfo();
  }
}
