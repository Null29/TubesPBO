import  java.sql.*;
//import  com.mysql.jdbc.*;
class connect{
    Connection conn;
    connect() throws SQLException, ClassNotFoundException {
        try{
            conn = connectToDB();
        }
        catch (Exception e){
            throw e;
        }
    }
    protected Connection connectToDB() throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=UTC&user=root&password=");
            return conn;
        }
        catch(Exception e){
            throw e;
        }
    }
    protected PreparedStatement pst(String stm) throws SQLException, ClassNotFoundException {
        try{
            if(conn != null && !conn.isValid(0))
                conn = connectToDB();
            return conn.prepareStatement(stm);
        }
        catch(Exception e){
            throw e;
        }
    }
    protected  Statement st(String stm) throws SQLException, ClassNotFoundException {
        try{
            if(conn != null && !conn.isValid(0))
                conn = connectToDB();
            return conn.prepareStatement(stm);
        }
        catch(Exception e){
            throw e;
        }
    }
}