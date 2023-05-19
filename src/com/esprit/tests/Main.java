/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.esprit.tests;

import com.esprit.entities.Blog;
import com.esprit.services.ServiceBlog;
import com.esprit.services.ServiceCommentaire;
import com.esprit.utils.DataSource;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceBlog sp2 = new ServiceBlog();
        ServiceCommentaire sc2 = new ServiceCommentaire();
        sp2.ajouter(new Blog(10,"blog1","descdescdesc"));
        sp2.ajouter(new Blog(11,"blog2","descdescdesc"));
        sp2.ajouter(new Blog(12,"blog3","descdescdesc"));
        sp2.modifier( new Blog(2,11,"blogmodifié","desdesdsesesese")); 
        System.out.println(sp2.afficher());
        sp2.supprimer(new Blog(1,10,"blog1","descdescdesc"));
        
    }
    
}
