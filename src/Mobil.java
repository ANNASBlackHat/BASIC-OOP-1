public class Mobil {
    int jumlahRoda;
    String warna;
    int pintu;
    String mesin;
    Integer roda = 0;

    //constructor
    Mobil(String warna){
        this.warna = warna;
    }

    Mobil(String warna, int roda){
        this.warna = warna;
    }

    void maju(){
        System.out.println("Maju mobil warna " + warna);
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }

    String getWarna(){
        return "merah";
    }
}
