package GUI;

import java.util.*;

public class Application {
    ArrayList<Mahasiswa> mhsList;
    Database db;
    
    public Application() {
        mhsList = new ArrayList();
        db = new Database();
        db.connect();
    }
    
    public void addMhs(String id, String name, String email, String jenisKelamin) {
        Mahasiswa m = new Mahasiswa(id, name, email, jenisKelamin);
        db.saveMahasiswa(m);
    }
    
    public Mahasiswa searchMahasiswa(String id) {
        return db.selectOneMahasiswaById(id);
    }
    
    public String[] getListIdMhs() {
        mhsList = db.selectAllMahasiswa();
        String[] listIdMhs = new String[mhsList.size()];
        int i = 0;
        for (Mahasiswa m : mhsList) {
            listIdMhs[i] = m.getIdMhs();
            i++;
        }
        return listIdMhs;
    }
    
    public int newId() {
        Mahasiswa m = db.selectLastMahasiswa();
        int lastNoId = 0;
        if (m != null) {
            String lastId = m.getIdMhs();
            String lastNumId = lastId.substring(2);
            lastNoId = Integer.parseInt(lastNumId);
        }
        return lastNoId + 1;
    }
    
    public void deleteMahasiswa(String id) {
        Mahasiswa m = searchMahasiswa(id);
        db.removeMhs(m);
    }
}
