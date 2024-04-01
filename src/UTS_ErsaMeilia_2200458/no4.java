package UTS_ErsaMeilia_2200458;

public class no4 {
    public static void main(String[] args) {
        no4_balok balok1 = new no4_balok();
        no4_balok balok2 = new no4_balok(30, 40, 50);
        no4_balok balok3 = new no4_balok(25, 35, 45);
        balok1.setLebar(1);
        balok1.setPanjang(1);
        balok1.setTinggi(1);

        System.out.println("Balok dengan panjang: " + balok1.panjang + ", lebar: " + balok1.lebar + ", dan tinggi: "
                + balok1.tinggi + ". Luasnya : " + balok1.getLuas() + " Kelilingnya : " + balok1.getKeliling()
                + " dan Volume : " + balok1.getVolume());
        System.out.println("Balok dengan panjang: " + balok2.panjang + ", lebar: " + balok2.lebar + ", dan tinggi: "
                + balok2.tinggi + ". Luasnya : " + balok2.getLuas() + " Kelilingnya : " + balok2.getKeliling()
                + " dan Volume : " + balok2.getVolume());
        System.out.println("Balok dengan panjang: " + balok3.panjang + ", lebar: " + balok3.lebar + ", dan tinggi: "
                + balok3.tinggi + ". Luasnya : " + balok3.getLuas() + " Kelilingnya : " + balok3.getKeliling()
                + " dan Volume : " + balok3.getVolume());
    }

}
