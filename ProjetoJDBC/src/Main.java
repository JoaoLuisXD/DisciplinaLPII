package ProjetoJDBC.src;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    static Connection connection = null;//conection o com anco
        static Statement st = null;// execulta o sql
        static ResultSet rs = null;//guarda o resultado do select
        static PreparedStatement pst = null;

    public static void main(String[] args) {
        
        //inserir();
        //deletar();
        atualizar();
        exibir();

    }

    public static void inserir(){
        connection = DB.getConnection();

        try {
            pst = connection.prepareStatement("insert into aluno(nome,cpf,dataNascimento) values (?,?,?)");
            pst.setString(1,"Isabela");
            pst.setString(2, "333.333.333-33");
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try{
                pst.setDate(3, new Date(sdf.parse("18-04-2005").getTime()));
            }
            catch(ParseException e){
                throw new RuntimeException(e);
            }
            pst.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void deletar(){
        connection = DB.getConnection();

        try {
            pst = connection.prepareStatement("delete from aluno where matricula = ?");
            pst.setInt(1,1);
            pst.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void atualizar(){
        connection = DB.getConnection();
        try {
            pst = connection.prepareStatement("update aluno set nome = ? where matricula = ?");
            pst.setString(1, "Karla");
            pst.setInt(2,2);
            pst.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void exibir(){
        try {
            connection = DB.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("select nome,cpf from aluno");
            while(rs.next()){
            System.out.println(rs.getString("nome") + " " + 
            rs.getString("cpf"));
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

