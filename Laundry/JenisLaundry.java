package javaapplication2.UKL_PBO.Laundry;

import java.util.ArrayList;

public class JenisLaundry {
    //ArrayList > membuat array agar dapat digunakan untuk menambah data baru secara dinamis
    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    //Construtor
    public JenisLaundry(){ // Ketika instansiasi dari class ini, otomatis terdapat 1 jenis laundry secara default yang terdaftar
        //Keyword this
        this.JenisLaundry.add("Cuci Komplit Reguler");
        this.harga.add(7000);
        this.durasi.add(48);
        
        this.JenisLaundry.add("Cuci Komplit Kilat");
        this.harga.add(12000);
        this.durasi.add(24);
        
        this.JenisLaundry.add("Cuci Komplit Express");
        this.harga.add(15000);
        this.durasi.add(8);
        
        this.JenisLaundry.add("Cuci Kering Reguler");
        this.harga.add(6000);
        this.durasi.add(48);
        
        this.JenisLaundry.add("Cuci Kering Kilat");
        this.harga.add(9000);
        this.durasi.add(24);
        
        this.JenisLaundry.add("Cuci Kering Express");
        this.harga.add(10000);
        this.durasi.add(8);
        
        this.JenisLaundry.add("Setrika Reguler 2 Hari");
        this.harga.add(6000);
        this.durasi.add(48);
        
        this.JenisLaundry.add("Setrika Kilat 1 Hari");
        this.harga.add(9000);
        this.durasi.add(24);
        
        this.JenisLaundry.add("Setrika Express 8 Jam");
        this.harga.add(10000);
        this.durasi.add(8);
    }
    //Accessor get, karena atribut JenisLaundry bernilai private
    public int getJenisLaundry(){
        return this.JenisLaundry.size();
    }
    //Mutator set, karena atribut JenisLaundry bernilai private
    public void setJenisLaundry(String JenisLaundry ){
        this.JenisLaundry.add(JenisLaundry);
    }
    //Accessor get, karena atribut JenisLaundry bernilai private
    public String getJenisLaundry(int idJenisLaundry){
        return this.JenisLaundry.get(idJenisLaundry);
    } 
    //Mutator set, karena atribut Harga bernilai private
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    //Accessor get, karena atribut Harga bernilai private
    public int getHarga(int idJenisLaundry){
        return this.harga.get(idJenisLaundry);
    } 
    //Untuk edit harga berdasarkan id janis laundry
    public void editHarga(int idJenisLaundry, int harga){
        this.harga.set(idJenisLaundry, harga);;
    } 
    //Mutator set, karena atribut Durasi bernilai private
    public void setDurasi(int durasi ){
        this.durasi.add(durasi);
    }
    //Accessor get, karena atribut Durasi bernilai private
    public int getDurasi(int idJenisLaundry){
        return this.durasi.get(idJenisLaundry);
    } 
}