package Objek;

public class Pertemuan6 {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        persegiPanjang1.setPanjang(1);
        persegiPanjang1.setLebar(1);
        System.out.println("Panjang persegiPanjang1: " + persegiPanjang1.panjang);
        System.out.println("Lebar persegiPanjang1: " + persegiPanjang1.lebar);
        System.out.println("Luas persegiPanjang1: " + persegiPanjang1.getLuas());
        System.out.println("Keliling persegiPanjang1: " + persegiPanjang1.getKeliling());
        System.out.println("\n");
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("Panjang persegiPanjang2: " + persegiPanjang2.panjang);
        System.out.println("Lebar persegiPanjang2: " + persegiPanjang2.lebar);
        System.out.println("Luas persegiPanjang2: " + persegiPanjang2.getLuas());
        System.out.println("Keliling persegiPanjang2: " + persegiPanjang2.getKeliling());
        System.out.println("\n");
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("Panjang persegiPanjang3: " + persegiPanjang3.panjang);
        System.out.println("Lebar persegiPanjang3: " + persegiPanjang3.lebar);
        System.out.println("Luas persegiPanjang3: " + persegiPanjang3.getLuas());
        System.out.println("Keliling persegiPanjang3: " + persegiPanjang3.getKeliling());
    }
}
