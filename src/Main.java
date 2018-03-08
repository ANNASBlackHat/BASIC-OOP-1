public class Main {

    public static void main(String[] args) {
        //membuat objek
//        Mobil mobil1 = new Mobil("Merah", 4);
//        mobil1.maju();
//
//        Mobil mobil2 = new Mobil("Biru", 4);
//        mobil2.maju();

        Mobil mobil1 = new Mobil("Hitam");
        mobil1.maju();

        mobil1.jumlahRoda += 1;
        mobil1.maju();
    }
}
