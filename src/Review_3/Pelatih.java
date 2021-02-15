package Review_3;

public class Pelatih extends Murid {

    private int jumMurid;
    private int ratingMelatih;
    private String gelarMelatih;
    private Murid[] daftarMurid;

    public Pelatih(String nama, int ratingBermain, String gelarBermain, String gelarMelatih) {
        super(nama, ratingBermain, gelarBermain);
        setGelarMelatih(gelarMelatih);
        daftarMurid = new Murid[5];
    }

    public void addMurid(Murid m) {
        if (jumMurid < daftarMurid.length) {
            this.daftarMurid[this.jumMurid] = m;
            this.jumMurid++;
        }
    }

    public Murid getDaftarMurid(int i) {
        return daftarMurid[i];
    }

    public int getJumlahMurid() {
        return jumMurid;
    }

    public void setRatingMelatih(int ratingMelatih) {
        if (gelarMelatih == "GM" || ratingMelatih > 2400 && ratingMelatih <= 2500) {
            this.ratingMelatih = 20;
        } else if (gelarMelatih == "IM" || ratingMelatih > 2300 && ratingMelatih <= 2400) {
            this.ratingMelatih = 10;
        } else if (gelarMelatih == "FM" || ratingMelatih < 2300) {
            this.ratingMelatih = 5;
        }
    }

    public int getRatingMelatih() {
        return ratingMelatih;
    }

    public void displayDaftar() {
        System.out.println("Data Murid");
        for (int i = 0; i < getJumlahMurid(); i++) {
            System.out.println("Nama : " + getNama());
            System.out.println("Rating Bermain : " + getRatingBermain(i));
            System.out.println("Gelar Bermain : " + getGelarBermain());
            System.out.println("");
        }
    }

    public void displayPerson() {
        System.out.println("Data Pelatih");
        System.out.println("Nama : " + getNama());
        System.out.println("Rating Bermain : " + getRatingMelatih());
        System.out.println("Gelar Bermain : " + getGelarMelatih());
    }

    public void setGelar(String gelarBermain, String gelarMelatih) {
        this.gelarBermain = gelarBermain;
        this.gelarMelatih = gelarMelatih;
    }

    public void setGelarMelatih(String gelarMelatih) {
        this.gelarMelatih = gelarMelatih;
    }

    public String getGelarMelatih() {
        return gelarMelatih;
    }
}
