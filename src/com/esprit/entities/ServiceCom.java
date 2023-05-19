/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author User
 */
public class ServiceCom {
    private int idblog ; 
    private int idcommentaire ;

    public ServiceCom(int idblog, int idcommentaire) {
        this.idblog = idblog;
        this.idcommentaire = idcommentaire;
    }

    public ServiceCom(int idblog) {
        this.idblog = idblog;
    }

    
   /* public ServiceCom(int idcommentaire) {
        this.idcommentaire = idcommentaire;
    }*/
    
    
    public int getIdblog() {
        return idblog;
    }

    public void setIdblog(int idblog) {
        this.idblog = idblog;
    }

    public int getIdcommentaire() {
        return idcommentaire;
    }

    public void setIdcommentaire(int idcommentaire) {
        this.idcommentaire = idcommentaire;
    }

    @Override
    public String toString() {
        return "ServiceCom{" + "idblog=" + idblog + ", idcommentaire=" + idcommentaire + '}';
    }
    
    
    
    
}
