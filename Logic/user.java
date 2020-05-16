import java.sql.*;
import java.util.Vector;

public class user {
    public String user;
    user(String name){
        user = name;
    }
    public boolean beli(String id, int nominal) throws SQLException, ClassNotFoundException {
        try{
            connect koneksi = new connect();
            Statement cek = koneksi.conn.createStatement();
            ResultSet hasil = cek.executeQuery("select kode_token from token where no_transaksi is null and nominal="+nominal);
            if(hasil.next()){
                String kode = hasil.getString("kode_token");
                PreparedStatement masuk = koneksi.pst("insert into pembelian(username, tgl, harga, id) values (?,date(now()),?,?)");
                masuk.setString(1,id);
                masuk.setInt(2,nominal);
                masuk.setString(3,id);
                if(masuk.executeUpdate() == 0)
                    return false;
                else{
                    Statement update = koneksi.conn.createStatement();
                    if (update.executeUpdate("update token set no_transaksi=LAST_INSERT_ID() where kode_token="+kode) == 1){
                        return true;
                    }
                    else{
                        Statement revert = koneksi.st();
                        revert.executeUpdate("delete from pembelian where no_transaksi=LAST_INSERT_ID()");
                        return false;
                    }
                }
            }
            else
                return false;
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }
    public Vector<String> history() throws SQLException, ClassNotFoundException {
        try {
            Vector<String> his = new Vector<>();
            connect koneksi = new connect();
            Statement q = koneksi.st();
            ResultSet hasil = q.executeQuery("select no_transaksi, tgl, id, harga from pembelian where username="+user);
            while(hasil.next()){
                for (int i = 1; i < 5; i++) {
                    his.add(hasil.getString(i));
                }
            }
            return his;
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }
}
