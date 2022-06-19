package javaapplication2.UKL_PBO.Laundry;


public interface User {
    //Mutator set
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    
    //Accessor get
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}
