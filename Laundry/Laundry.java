package javaapplication2.UKL_PBO.Laundry;

public class Laundry {
    public static void main(String[] args) {
    //object
    Client client = new Client();
    Petugas petugas = new Petugas();
    Laporan laporan = new Laporan();
    Transaksi transaksi = new Transaksi();
    JenisLaundry jenisLaundry= new JenisLaundry();
    
    laporan.laporan(jenisLaundry);
    laporan.laporan(petugas);
    laporan.laporan(client);
    laporan.laporan(transaksi, jenisLaundry);
    transaksi.prosesTransaksi(client, transaksi, jenisLaundry);
    laporan.laporan(transaksi, jenisLaundry);
    laporan.laporan(jenisLaundry);
    laporan.laporan(client);   
    }
}