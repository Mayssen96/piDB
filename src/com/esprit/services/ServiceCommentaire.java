/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
/**
 *
 * @author User
 */
public class ServiceCommentaire{
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Commentaire c) {
        try {
            String req = "INSERT INTO Commentaire (contenue, idutilisateur,idblog) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, c.getContenue() );
            pst.setInt(2, c.getIdutilisateur());
            pst.setInt(3, c.getIdblog());
            pst.executeUpdate();
            System.out.println("Commentaire ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void modifier(Commentaire c ) {
        try {
            String req = "UPDATE Commentaire SET contenue=?, idutilisateur=? idblog=? WHERE idcommentaire=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(2, c.getIdutilisateur() );
            pst.setInt(3, c.getIdblog());
            pst.setString(1, c.getContenue() );
            pst.setInt(4,c.getIdcommentaire());
            pst.executeUpdate();
            System.out.println("Blog modifié !");
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
                list.add(new Commentaire(rs.getString("contenue"),rs.getInt("idutilisateur"),rs.getInt("idblog")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return list;
    }
      public void supprimer(Commentaire  c) {
        try {
            String req = "DELETE from Commentaire  WHERE idcommentaire=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getIdcommentaire() );
            pst.executeUpdate();
            System.out.println("Commentaire supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
     
}