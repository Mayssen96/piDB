/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author User
 */
public class Commentaire {
   private int idcommentaire;
   private String contenue;
   private int idutilisateur ;
   private int idblog ;

    public Commentaire(String contenue, int idutilisateur, int idblog) {
        this.contenue = contenue;
        this.idutilisateur = idutilisateur;
        this.idblog = idblog;
    }

    public Commentaire(int idcommentaire, String contenue, int idutilisateur, int idblog) {
        this.idcommentaire = idcommentaire;
        this.contenue = contenue;
        this.idutilisateur = idutilisateur;
        this.idblog = idblog;
    }

   
   
   
    public int getIdcommentaire() {
        return idcommentaire;
    }

    public void setIdcommentaire(int idcommentaire) {
        this.idcommentaire = idcommentaire;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public int getIdblog() {
        return idblog;
    }

    public void setIdblog(int idblog) {
        this.idblog = idblog;
    }

   
   
   
}
