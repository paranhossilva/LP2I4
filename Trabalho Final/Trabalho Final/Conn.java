import java.sql.*;
import javax.swing.JOptionPane;

public class Conn {
    private Connection myConn = null;
    private Statement myStmt = null;
    private ResultSet myRs = null;
    private String usuario = "root";
    private String senha = "root";
    
    public Conn(){
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TP05", usuario, senha);
            
            myStmt = myConn.createStatement();
        } catch (SQLException e) {
            erro(e, "Conn");
        }
    }
    
    public void fecha(){
        try {
            if (myRs != null)
                myRs.close();

            if (myStmt != null) 
                myStmt.close();

            if (myConn != null)
                myConn.close();
                                   
        } catch (SQLException e) {
            erro(e, "fecha");
        }
        
    }   
    
    public void insere (String nome, int idade, float peso, float altura, String objetivo){        
        try {
            myStmt.executeUpdate("insert into alunos (nome, idade, peso, altura, objetivo) values('" + nome +"', " + idade +", " + peso + ", " + altura + ", '" + objetivo + "');");
        } catch (SQLException e) {
            erro(e, "insere");
        }
        
        JOptionPane.showMessageDialog(null,"Aluno adicionado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void erro(SQLException e, String classe){
        JOptionPane.showMessageDialog(null,classe +"\n" + e,"Erro", JOptionPane.ERROR_MESSAGE);
    }
}