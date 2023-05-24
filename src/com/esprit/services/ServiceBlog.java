/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Blog;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 *
 * @author User
 */
public class ServiceBlog implements IService <Blog> {
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    @Override
   /* public void ajouter(Blog b) {
        try {
            String req = "INSERT INTO Blog (idUtilisateur, titre,description) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, b.getIdUtilisateur() );
            pst.setString(2, b.getTitre());
            pst.setString(3, b.getDescription());
            pst.executeUpdate();
            System.out.println("Blog ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }*/
        public void ajouter1(Blog b) {
        try {
            String req = "INSERT INTO Blog(titre,description,idUtilisateur)VALUES(?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, b.getTitre());
            pst.setString(2, b.getDescription());
            pst.setInt(3, b.getIdUtilisateur());
            pst.executeUpdate();
            System.out.println("Blog ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void modifier(Blog b) {
        try {
            String req = "UPDATE Blog SET idUtilisateur=?, titre=? ,description=? WHERE idBlog=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(2, b.getTitre() );
            pst.setString(3, b.getDescription());
            pst.setInt(1,b.getIdUtilisateur());
            pst.setInt(4,b.getIdBlog());
            pst.executeUpdate();
            System.out.println("Blog modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public ObservableList<Blog> afficher(){
        ObservableList <Blog> bloglist = FXCollections.observableArrayList();
       // List<Blog> list = new ArrayList<>();
        String req = "SELECT * FROM Blog ";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                //list.add(new Blog (rs.getInt("idUtilisateur"), rs.getString("titre"), rs.getString("description")));
                bloglist.add(new Blog (rs.getInt("idBlog"),rs.getInt("idUtilisateur"), rs.getString("titre"), rs.getString("description")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         //return list;
         return bloglist ;
    }
      public void supprimer(Blog b) {
        try {
            String req = "DELETE from Blog WHERE idblog=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, b.getIdBlog() );
            pst.executeUpdate();
            System.out.println("Blog supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
     
}