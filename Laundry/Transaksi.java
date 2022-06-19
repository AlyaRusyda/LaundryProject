package javaapplication2.UKL_PBO.Laundry;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    //ArrayList > membuat array agar dapat digunakan untuk menambah data baru secara dinamis
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); 
    
    //Constructor
    public Transaksi() {
        
    }
    //Method
    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry){
        Scanner scan = new Scanner(System.in); 
        System.out.println("==== Selamat Datang ====");
        System.out.println("==== LAUNDRY KINCLONG ==== ");
        System.out.print("Masukkan ID Client : ");
        int idClient = scan.nextInt(); 
        System.out.println("Selamat datang "+ client.getNama(idClient));
        ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        
        int i=0;
        int temp=0;
        
        //Perulangan while do(akan berhenti looping jika kondisi bernilai 'false')
        do{
            System.out.println("## Ketik 99 jika ingin mengakhiri transaksi ##");
            System.out.println("Masukkan Jenis Laundry : ");
            temp = scan.nextInt();
            //Percabangan
            if (temp != 99){
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getJenisLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(scan.nextInt());
                i++;
            }
        } while (temp != 99); 
            System.out.println("=============================================");
            System.out.println("Transaksi laundry " + client.getNama(idClient) + " sebagai berikut");
            System.out.println("=============================================");
            System.out.println("Jenis Laundry \tHarga \tJumlah \t");
            System.out.println("---------------------------------------------");


            int total=0;
            int x = idJenisLaundry.size();
            for (int j = 0; j < x; j++){
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getJenisLaundry(idJenisLaundry.get(j)) + "\t" + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "\t" + jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j), banyak.get(j));
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Harga : " + total);
        System.out.println("========================================");
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
    }
    //Mutator set (mengubah/menambahkan nilai variabel)
    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya){
        //Keyword this
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
    }
    //Accessor get (membaca nilai variabel)
    public int getJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    } 
    //Accessor get
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    } 
    //Accessor get
    public int getIdClient(int id){
        return this.idClient.get(id);
    } 
    //Accessor get
    public int getJmlTransaksi(){
        return this.idClient.size();
    } 
}
