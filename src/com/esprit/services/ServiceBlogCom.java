/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;
import java.sql.SQLException;
import com.esprit.entities.BlogCom;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ServiceBlogCom implements IService <BlogCom>{
       private Connection cnx = DataSource.getInstance().getCnx();
 public void ajouter(BlogCom cb ) {
        try {
            String req = "INSERT INTO BlogCom (idBlog, idCommentaire) VALUES (?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, cb.getIdBlog());
            pst.setInt(2, cb.getIdCommentaire());
            pst.executeUpdate();
            System.out.println("blogcom ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void modifier(BlogCom cb ) {
        try {
            String req = "UPDATE BlogCom SET idBlog=?, idCommentaire=? ";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, cb.getIdBlog() );
            pst.setInt(2, cb.getIdCommentaire());
            pst.executeUpdate();
            System.out.println("blogcom modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<BlogCom> afficher(){
        List<BlogCom> list = new ArrayList<>();
        String req = "SELECT * FROM BlogCom ";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new BlogCom(rs.getInt("idBlog"),rs.getInt("idCommentaire")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return list;
    }
      public void supprimer(BlogCom cb ) {
        try {
            String req = "DELETE from BlogCom  WHERE idCommentaire=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, cb.getIdCommentaire());
            pst.executeUpdate();
            System.out.println("blogcom supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
