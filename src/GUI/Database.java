package GUI;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {

    private Connection con;

    public void connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
            String username = "root";
            String password = "";
            con = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database.");
        } catch (Exception e) {
            System.out.println("Connection error.");
        }
    }

    public void saveMahasiswa(Mahasiswa m) {
        try {
            String query = "insert into mahasiswa values ('" + m.getIdMhs() + "','" + m.getName()
                    + "','" + m.getEmail() + "','" + m.getJenisKelamin() + "');";
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("Saving success");
        } catch (SQLException se) {
            System.out.println("Saving error.");
        }
    }
    
    public Mahasiswa selectOneMahasiswaById(String id) {
        try {
            String query = "select * from mahasiswa where id = '" + id + "'";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
            Mahasiswa m = null;
            while (rs.next()) {
                String name = rs.getString(2);
                String email = rs.getString(3);
                String jenisKelamin = rs.getString(4);
                
                m = new Mahasiswa(name, email, jenisKelamin);
            }
            return m;
        } catch (SQLException se) {
            return null;
        }
    }
    
    public ArrayList<Mahasiswa> selectAllMahasiswa() {
        try {
            ArrayList<Mahasiswa> mhs = new ArrayList();
            String query = "select * from mahasiswa";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
            Mahasiswa m;
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String jenisKelamin = rs.getString(4);
                m = new Mahasiswa(id, name, email, jenisKelamin);
                mhs.add(m);
            }
            return mhs;
        } catch (SQLException se) {
            return null;
        }
    }
    
    public Mahasiswa selectLastMahasiswa() {
        try {
            String query = "select * from mahasiswa where id = (select max(id) from mahasiswa)";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
            Mahasiswa m = null;
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String jenisKelamin = rs.getString(4);
                m = new Mahasiswa(id, name, email, jenisKelamin);
            }
            return m;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void removeMhs(Mahasiswa m) {
        try {
            String query = "delete from mahasiswa where id = '" + m.getIdMhs() + "'";
            Statement s = con.createStatement();
            s.executeUpdate(query);
            System.out.println("Delete success.");
        } catch (SQLException se) {
            System.out.println("Delete error.");
        }
    }
}
