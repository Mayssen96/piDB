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
   private int idCommentaire;
   private String contenue;
   private int idUtilisateur ;
   private int idBlog ;

    public Commentaire(int idCommentaire, String contenue, int idUtilisateur, int idBlog) {
        this.idCommentaire = idCommentaire;
        this.contenue = contenue;
        this.idUtilisateur = idUtilisateur;
        this.idBlog = idBlog;
    }

    public Commentaire(String contenue, int idUtilisateur, int idBlog) {
        this.contenue = contenue;
        this.idUtilisateur = idUtilisateur;
        this.idBlog = idBlog;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "idCommentaire=" + idCommentaire + ", contenue=" + contenue + ", idUtilisateur=" + idUtilisateur + ", idBlog=" + idBlog + '}';
    }   
}
