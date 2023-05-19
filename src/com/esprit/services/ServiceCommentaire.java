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
import com.esprit.entities.ServiceCom;
/**
 *
 * @author User
 */
public class ServiceCommentaire implements IService <ServiceCom>{
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(ServiceCom cb ) {
        try {
            String req = "INSERT INTO blogcomm (idblog, idcommentaire) VALUES (?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, cb.getIdblog());
            pst.setInt(2, cb.getIdcommentaire());
            pst.executeUpdate();
            System.out.println("blogcom ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void modifier(ServiceCom cb ) {
        try {
            String req = "UPDATE blogcomm SET idblog=?, idcommentaire=? ";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(2, cb.getIdblog() );
            pst.setInt(3, cb.getIdcommentaire());
            pst.executeUpdate();
            System.out.println("blogcom modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<ServiceCom> afficher(){
        List<ServiceCom> list = new ArrayList<>();
        String req = "SELECT * FROM blogcomm ";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new ServiceCom(rs.getInt("idblog"),rs.getInt("idcommentaire")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return list;
    }
      public void supprimer(ServiceCom cb ) {
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