/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author User
 */
public class BlogCom {
    private int idCommentaire;
    private int idBlog;

    public BlogCom(int idCommentaire, int idBlog) {
        this.idCommentaire = idCommentaire;
        this.idBlog = idBlog;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    @Override
    public String toString() {
        return "BlogCom{" + "idCommentaire=" + idCommentaire + ", idBlog=" + idBlog + '}';
    }

    
    
}
