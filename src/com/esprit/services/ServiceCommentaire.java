/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
package com.esprit.services;
import com.esprit.entities.Commentaire;
import java.sql.SQLException;
import java.sql.Statement;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.esprit.entities.BlogCom  ;
/**
 *
 * @author User
 */
/*
public class ServiceCommentaire implements IService <Commentaire>{
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Commentaire c ) {
        try {
            String req = "INSERT INTO Commentaire (contenue, idUtilisateur,idBlog) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, c.getContenue() );
            pst.setInt(2, c.getIdUtilisateur() );
            pst.setInt(3, c.getIdBlog());
            pst.executeUpdate();
            System.out.println("Comentaire ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void modifier(Commentaire c  ) {
        try {
            String req = "UPDATE Commentaire SET contenue=?, idUtilisateur=?,idBlog=? WHERE idCommentaire=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, c.getContenue() );
            pst.setInt(2, c.getIdUtilisateur());
            pst.setInt(3, c.getIdBlog());
            pst.setInt(4, c.getIdCommentaire());
            pst.executeUpdate();
            System.out.println("Commentaire modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<Commentaire> afficher(){
        List<Commentaire> list = new ArrayList<>();
        String req = "SELECT * FROM Commentaire ";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            list.add(new Commentaire(rs.getInt("idCommentaire"), rs.getString("contenue"), rs.getInt("idUtilisateur"),rs.getInt("idBlog")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return list;
    }
      public void supprimer(Commentaire c ) {
        try {
            String req = "DELETE from Commentaire  WHERE idCommentaire=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getIdCommentaire());
            pst.executeUpdate();
            System.out.println("Commentaire supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
     
}*/