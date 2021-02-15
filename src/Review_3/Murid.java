package Review_3;

public class Murid {

    private String nama;
    protected int ratingBermain;
    protected String gelarBermain;

    public Murid(String nama, int ratingBermain, String gelar) {
        this.nama = nama;
        this.ratingBermain = ratingBermain;
        this.gelarBermain = gelar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getRatingBermain(int point) {
        if (point >= 10) {
            return ratingBermain + 100;
        } else if (point > 8 && point < 10) {
            return ratingBermain + 80;
        } else if (point >5 && point <= 8) {
            return ratingBermain + 50;
        }
        return ratingBermain;
    }

    public void setRatingBermain(int ratingBermain) {
        if (ratingBermain >= 1500 && ratingBermain <= 3000) {
            this.ratingBermain = ratingBermain;
        } else {
            System.out.println("Rating bermain tidak valid");
        }
    }

    public String getGelarBermain() {
        if (ratingBermain >= 2300 && ratingBermain < 2400) {
            return "FM";
        } else if (ratingBermain >= 2400 && ratingBermain < 2500) {
            return "IM";
        } else if (ratingBermain >= 2500) {
            return "GM";
        }
        return gelarBermain;
    }

    public void setGelarBermain(String gelarBermain) {
        this.gelarBermain = gelarBermain;
    }
    
    public void displayPerson() {
        System.out.println("Murid");
        System.out.println("Nama : " + getNama());
        System.out.println("Rating Bermain : " + getRatingBermain(ratingBermain));
        System.out.println("Gelar : " + getGelarBermain());
        System.out.println();
    }

}
