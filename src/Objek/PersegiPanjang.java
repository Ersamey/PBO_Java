package Objek;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    public int getLuas() {
        return this.panjang * this.lebar;
    }

    public int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
}
