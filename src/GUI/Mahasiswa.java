package GUI;

public class Mahasiswa {

    private static int id = 1;
    private String idMhs;
    private String name;
    private String email;
    private String jenisKelamin;

    public Mahasiswa(String name, String email, String jenisKelamin) {
        this.name = name;
        this.email = email;
        this.jenisKelamin = jenisKelamin;

        idMhs = "Peserta " + (id++);
    }
    
    public Mahasiswa(String id, String name, String email, String jenisKelamin) {
        this.idMhs = id;
        this.name = name;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public static int getId() {
        return id;
    }

    public String getIdMhs() {
        return idMhs;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String toString() {
        String s = "Berhasil Daftar dengan Data" + "\n" + "ID : " + idMhs + "\n" + "Nama : " + name + "\n"
                + "Email : " + email + "\n"
                + "Jenis Kelamin : " + jenisKelamin + "\n";

        return s;
    }
}
