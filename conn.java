import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;
    
    public conn() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://ps","root","Ar@#2002");
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
