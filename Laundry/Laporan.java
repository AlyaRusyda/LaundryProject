package javaapplication2.UKL_PBO.Laundry;

public class Laporan {
    //Method
    public void laporan(JenisLaundry jenisLaundry){
        //Variable
        int x = jenisLaundry.getJenisLaundry();
        System.out.println("######## Tabel Jenis Laundry ########");
        System.out.println("==================================================");
        System.out.println("Jenis Laundry \t\tHarga \t\tDurasi");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getJenisLaundry(i) + "\t" + jenisLaundry.getHarga(i) + "\t\t" + jenisLaundry.getDurasi(i));
        }
        System.out.println("==================================================");
        System.out.println();
    }
    //Method
    public void laporan(Petugas petugas) {
        //Variable
        int x = petugas.getJmlPetugas();
        System.out.println();
        System.out.println("######## Tabel Petugas ########");
        System.out.println("==================================================");
        System.out.println("Nama \tAlamat \t\tTelepon \t\tJabatan");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t" + petugas.getJabatan(i));
        }
        System.out.println("==================================================");
        System.out.println();
    }
    //Method
    public void laporan(Client client) {
        //Variable
        int x = client.getJmlClient();
        System.out.println();
        System.out.println("######## Tabel Member ########");
        System.out.println("==================================================");
        System.out.println("Nama \tAlamat \t\tTelepon \t\tSaldo");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t" + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
        System.out.println("==================================================");
        System.out.println();
    }
    //method
    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry) {
        //variable
        int x = transaksi.getJmlTransaksi();
        System.out.println();
        System.out.println("######## Laporan Transaksi ########");
        System.out.println("==================================================");
        System.out.println("Jenis Laundry \t\tBerat \tHarga \tJumlah");
        System.out.println("--------------------------------------------------");
        //Variable
        int total = 0;
        //Percabangan
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getJenisLaundry(i));
            total += jumlah;
            System.out.println(jenisLaundry.getJenisLaundry(transaksi.getJenisLaundry(i)) + "\t" + transaksi.getBanyaknya(i) + "\t" + jenisLaundry.getHarga(transaksi.getJenisLaundry(i)) + "\t" + jumlah);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total Omset = " + total);
        System.out.println("==================================================");
        System.out.println("");
    }
}
