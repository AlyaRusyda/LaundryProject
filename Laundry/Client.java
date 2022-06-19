package javaapplication2.UKL_PBO.Laundry;

import java.util.ArrayList;

//Class interface, mengimplementasi class User
public class Client implements User{
    //ArrayList > membuat array agar dapat digunakan untuk menambah data baru secara dinamis
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
 
    //constructor
    public Client(){ // Ketika instansiasi dari class ini, otomatis terdapat satu client secara default yang terdaftar
        this.namaClient.add("Shalom");
        this.alamat.add("Sawojajar");
        this.telepon.add("0812345678");
        this.saldo.add(100000);

        this.namaClient.add("Udin");
        this.alamat.add("Sawojajar");
        this.telepon.add("0887654321");
        this.saldo.add(200000);

        this.namaClient.add("Adi");
        this.alamat.add("Sawojajar");
        this.telepon.add("0897654321");
        this.saldo.add(300000);

        this.namaClient.add("Budi");
        this.alamat.add("Sawojajar");
        this.telepon.add("0987654321");
        this.saldo.add(400000);
        }
    //Mutator set, karena atribut saldo private
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    //Accessor get, karena atribut saldo private
    public int getSaldo(int idLaundry){
        return this.saldo.get(idLaundry);
    } 
    //Untuk edit saldo berdasarkan id client
    public void editSaldo(int idLaundry, int saldo){
        this.saldo.set(idLaundry, saldo);
    } 
    //Accessor get, untuk mengetahui ada berapa banyak jumlah client yang terdaftar di array list
    public int getJmlClient(){
        return this.saldo.size();
    }
    
    //Overriding dari class User untuk mengimplementasi interface User
    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
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
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
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