/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author User
 */
public class Blog {
    private int idblog;
    private int idutilisateur;
    private String titre ;
    private String description ; 

    public Blog(int idblog, int idutilisateur, String titre, String description) {
        this.idblog = idblog;
        this.idutilisateur = idutilisateur;
        this.titre = titre;
        this.description = description;
    }

    public Blog(int idutilisateur, String titre, String description) {
        this.idutilisateur = idutilisateur;
        this.titre = titre;
        this.description = description;
    }

    public int getIdblog() {
        return idblog;
    }

    public void setIdblog(int idblog) {
        this.idblog = idblog;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Blog{" + "idblog=" + idblog + ", idutilisateur=" + idutilisateur + ", titre=" + titre + ", description=" + description + '}';
    }
    
    

    

   

    
    
   
    
    
}


