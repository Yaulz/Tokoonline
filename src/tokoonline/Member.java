
package tokoonline;


import java.util.ArrayList;

public class Member implements User{

    private ArrayList <String> namaMember = new ArrayList <String> ();
    private ArrayList <String> alamat = new ArrayList <String> ();
    private ArrayList <String> telepon = new ArrayList <String> ();
    private ArrayList <Integer> saldo = new ArrayList <Integer> ();

    public Member (){
        this.namaMember.add ("Asya");
        this.alamat.add ("Tuban");
        this.telepon.add ("081252812720");
        this.saldo.add(100000);

        this.namaMember.add ("Daffa");
        this.alamat.add ("Tuban");
        this.telepon.add ("081230329149");
        this.saldo.add (200000);

        this.namaMember.add ("Yaul");
        this.alamat.add ("Malang");
        this.telepon.add ("08111233123");
        this.saldo.add (300000);

        this.namaMember.add ("Japier");
        this.alamat.add ("Tuban");
        this.telepon.add ("085161118789");
        this.saldo.add (150000);

        this.namaMember.add ("Rusdi");
        this.alamat.add ("Madura");
        this.telepon.add ("085784795918");
        this.saldo.add (250000);
    }
    public void setSaldo (int saldo){
        this.saldo.add (saldo);
    }
    public int getSaldo (int idMember){
        return this.saldo.get (idMember);
    }
    public void editSaldo (int idMember, int saldo){
        this.saldo.set (idMember, saldo);
    }
    public int getJumlahMember (){
        return this.saldo.size ();
    }

    public void setNama (String namaMember){
        this.namaMember.add (namaMember);
    }

    @Override
    public void setAlamat (String alamat){
        this.alamat.add (alamat);
    }

    @Override
    public void setTelepon (String telepon){
        this.telepon.add (telepon);
    }

    @Override
    public String getNama (int idMember){
        return this.namaMember.get (idMember);
    }

    @Override
    public String getAlamat (int idMember){
        return this.alamat.get (idMember);
    }

    @Override
    public String getTelepon (int idMember){
        return this.telepon.get (idMember);
    }
}
    

