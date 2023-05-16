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
/**
 *
 * @author User
 */
public class ServiceBlog {
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Blog b) {
        try {
            String req = "INSERT INTO Blog (idutilisateur, titre,description) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, b.getIdutilisateur() );
            pst.setString(2, b.getTitre());
            pst.setString(3, b.getDescription());
            pst.executeUpdate();
            System.out.println("Blog ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void modifier(Blog b) {
        try {
            String req = "UPDATE Blog SET idutilisateur=?, titre=? description=? WHERE idblog=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(2, b.getTitre() );
            pst.setString(3, b.getDescription());
            pst.setInt(1,b.getIdutilisateur() );
            pst.setInt(4,b.getIdblog());
            pst.executeUpdate();
            System.out.println("Blog modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<Blog> afficher(){
        List<Blog> list = new ArrayList<>();
        String req = "SELECT * FROM Blog ";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Blog (rs.getInt("idutilisateur"), rs.getString("titre"), rs.getString("description")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return list;
    }
      public void supprimer(Blog b) {
        try {
            String req = "DELETE from Blog WHERE idblog=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, b.getIdblog() );
            pst.executeUpdate();
            System.out.println("Blog supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
     
}