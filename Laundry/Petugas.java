package javaapplication2.UKL_PBO.Laundry;

import java.util.ArrayList;

//Inheritance, class Interface 
public class Petugas implements User{
    //ArrayList > membuat array agar dapat digunakan untuk menambah data baru secara dinamis
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    //constructor
    public Petugas(){ // Ketika instansiasi dari class ini, otomatis terdapat 1 petugas secara default yang terdaftar
        this.namaPetugas.add("Indra");
        this.alamat.add("Sawojajar");
        this.telepon.add("089876543");
        this.jabatan.add(0);
        
        this.namaPetugas.add("Bagus");
        this.alamat.add("Sawojajar");
        this.telepon.add("081234569");
        this.jabatan.add(1);
        
        this.namaPetugas.add("Aitana");
        this.alamat.add("Sawojajar");
        this.telepon.add("0893274892");
        this.jabatan.add(2);
        
        this.namaPetugas.add("Seno");
        this.alamat.add("Sawojajar");
        this.telepon.add("087653635");
        this.jabatan.add(3);
    }
    //Mutator set (mengubah/menambah nilai variabel), karena atribut jabatan bernilai private
    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    //Accessor get (membaca nilai variabel), karena atribut jabatan bernilai private
    public int getJabatan(int id){
        return this.jabatan.get(id);
    } 
    //Accessor get, karena atribut jabatan bernilai private
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }
    
    //Overriding dari class User untuk menimplementasi class User
    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idAlamat) {
        return this.alamat.get(idAlamat);
    }

    @Override
    public String getTelepon(int idTelepon) {
        return this.telepon.get(idTelepon);
    }
}
