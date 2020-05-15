import java.sql.*;
import org.apache.commons.codec.digest.DigestUtils;

public class login {
    static public user auth(String user, String pass) throws SQLException, ClassNotFoundException {
        pass = DigestUtils.sha256Hex(pass);
        try{
            connect koneksi = new connect();
            PreparedStatement q = koneksi.pst("select * from login where username=?");
            q.setString(1, user);
            ResultSet hasil = q.executeQuery();
            if(hasil.next() && hasil.getString("username").equals(user)
                    && hasil.getString("password").equals(pass)){
                return new user(user);
            }
            else
                return null;
        }
        catch (Exception e){
            throw e;
        }
    }
    static public boolean daftar(String user, String pass) throws SQLException, ClassNotFoundException {
        try {
            connect koneksi = new connect();
            PreparedStatement q = koneksi.pst("select username from login where username=?");
            q.setString(1, user);
            ResultSet r = q.executeQuery();
            if (!r.next()) {
                pass = DigestUtils.sha256Hex(pass);
                q = koneksi.pst("insert into login values (?,?)");
                q.setString(1, user);
                q.setString(2, pass);
                if (q.executeUpdate() == 0)
                    return false;
                else
                    return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
