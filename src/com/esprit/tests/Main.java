/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.esprit.tests;

import com.esprit.entities.Blog;
import com.esprit.entities.Commentaire;
import com.esprit.services.ServiceBlog;
import com.esprit.services.ServiceBlogCom;
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
        ServiceBlogCom bc = new ServiceBlogCom();
        //////////////////////////////BLOG//////////////////////////////////
       sp2.ajouter(new Blog(1,"blog1","descdescdesc"));
        //sp2.ajouter(new Blog(15,"blog11","ii"));
        //*System.out.println(sp2.afficher());
        //*sp2.modifier(new Blog(8,11,"blogmodifié","desdesdsesesese"));
        /* sp2.supprimer(new Blog(8,11,"blogmodifié","desdesdsesesese"));
 ***************************************COMMENTAIRE**********************************************************************************/
          sc2.ajouter(new Commentaire("bbb",1,1));
          //System.out.println(sc2.afficher());
          //sc2.modifier( new Commentaire (1,"comm modifié",5,10));
          //sc2.supprimer(new Commentaire (1,"comm modifié",5,10));
          
       
        
    }
    
}
