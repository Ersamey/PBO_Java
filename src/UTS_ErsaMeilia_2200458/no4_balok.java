package UTS_ErsaMeilia_2200458;
public class no4_balok {
  int panjang, lebar, tinggi;
  public no4_balok(int panjang, int lebar, int tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }
  public no4_balok() {
    this.panjang = 0;
    this.lebar = 0;
    this.tinggi = 0;
  }
  public int getLuas() {
    return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
  }
  public int getVolume() {
    return panjang * lebar * tinggi;
  }
  public int getKeliling() {
    return 4 * (panjang + lebar + tinggi);
  }
  public void setPanjang(int panjang) {
    this.panjang = panjang;
  }
  public void setLebar(int lebar) {
    this.lebar = lebar;
  }
  public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
  }

}
