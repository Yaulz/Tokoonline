
package tokoonline;


public interface User {
    //    void user (String Nama, String Alamat, String Telepon);

    public void setAlamat (String alamat);
    public void setTelepon (String telepon);

    public String getNama (int id);
    public String getAlamat (int id);
    public String getTelepon (int id);
}

