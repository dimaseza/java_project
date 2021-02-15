package Review_3;

public class Driver {

    public static void main(String[] args) {
        Pelatih pelatih = new Pelatih("Botvinnik", 2600, "GM", "FI");
        
        Murid murid1 = new Murid("Kasparov", 2000, "NM");
        Murid murid2 = new Murid("Karpov", 2200, "NM");
        Murid murid3 = new Murid("Ivanchuk", 2150, "NM");
        Murid murid4 = new Murid("Kramnik", 1000, "NM");
        Murid murid5 = new Murid("Leko", 2005, "NM");
        
        pelatih.addMurid(murid1);
        pelatih.addMurid(murid2);
        pelatih.addMurid(murid3);
        pelatih.addMurid(murid4);
        pelatih.addMurid(murid5);
        
        System.out.println("Data Pelatih");
        System.out.println("Nama : " + pelatih.getNama());
        System.out.println("Gelar Bermain : " + pelatih.getGelarBermain());
        System.out.println("Gelar Melatih : " + pelatih.getGelarMelatih());
        System.out.println("Rating Bermain : " + pelatih.getRatingBermain(2600));
        System.out.println("Rating Melatih : " + pelatih.getRatingMelatih());
        System.out.println("");
        
        System.out.println("Daftar Murid");
        for (int i = 0; i < pelatih.getJumlahMurid(); i++) {
            System.out.println("Nama : " + pelatih.getDaftarMurid(i).getNama());
            System.out.println("Gelar Bermain : " + pelatih.getDaftarMurid(i).getGelarBermain());
            System.out.println("Rating Bermain : " + pelatih.getDaftarMurid(i).getRatingBermain(i));
        }
        
        System.out.println("");
    }
}
