/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.esprit.gui;
import com.esprit.entities.Blog;
import com.esprit.services.ServiceBlog;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AjoutBlogController implements Initializable {

    @FXML
    private TextField tfTitre;
    @FXML
    private TextField tfDescription;
    @FXML
    private TableView<Blog> information;
    @FXML
    private TableColumn<Blog, Integer> colidblog;
    @FXML
    private TableColumn<Blog, Integer> colidutilisateur;
    @FXML
    private TableColumn<Blog, String> cotitre;
    @FXML
    private TableColumn<Blog,String> coldesc;
    @FXML
    private Button btnModifier;
    @FXML
    private Button btnSupprimer;
    @FXML
    private Button btnAjouter;
    @FXML
    private TextField tfidUtilisateur;
    @FXML
    private TextField tfidBlog;
    @FXML
    private Button btnAfficherleblog;


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
   
    
    public void updateTable(){
        ServiceBlog blog1 = new ServiceBlog();
        ObservableList <Blog> obsBlog1 = blog1.afficher();
        colidblog.setCellValueFactory (new PropertyValueFactory <>("idBlog"));
        colidutilisateur.setCellValueFactory (new PropertyValueFactory <>("idUtilisateur"));
        cotitre.setCellValueFactory (new PropertyValueFactory <>("Titre"));
        coldesc.setCellValueFactory (new PropertyValueFactory <>("Description"));
        information.setItems(obsBlog1);
    
    }
    
    public void initialize(URL url, ResourceBundle rb) {
       ShowBlogs();
       updateTable();
     
    }    
    
    public void ShowBlogs() {
        ServiceBlog blog;
        blog = new ServiceBlog();
        ObservableList <Blog> obsBlog = blog.afficher();
        colidblog.setCellValueFactory (new PropertyValueFactory <>("idBlog"));
        colidutilisateur.setCellValueFactory (new PropertyValueFactory <>("idUtilisateur"));
        cotitre.setCellValueFactory (new PropertyValueFactory <>("Titre"));
        coldesc.setCellValueFactory (new PropertyValueFactory <>("Description"));
        information.setItems(obsBlog);
}
    
    @FXML
    public void Modifierblog(){
    ServiceBlog bg1 = new ServiceBlog();
    try{
        bg1.modifier(new Blog(Integer.parseInt(tfidBlog.getText()),Integer.parseInt(tfidUtilisateur.getText()),tfTitre.getText(),tfDescription.getText()));
        JOptionPane.showMessageDialog(null, "Blog ajoutée !");
        updateTable();
        }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);

        }
    }
    
 
        

  
      

    @FXML
    private void blogadd1(ActionEvent event) {
        ServiceBlog bg = new ServiceBlog();
       
        try{
        bg.ajouter1(new Blog(Integer.parseInt(tfidBlog.getText()),Integer.parseInt(tfidUtilisateur.getText()),tfTitre.getText(),tfDescription.getText()));
        JOptionPane.showMessageDialog(null, "Blog ajoutée !");
        updateTable();
        }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);

        }
    }
    

   

    @FXML
    private void getSelected(javafx.scene.input.MouseEvent event) {
         int index = information.getSelectionModel().getSelectedIndex();
       
            System.out.println(index);
        if (index <=-1) {
        return;
        }
        tfidBlog.setText(colidblog.getCellData(index).toString());
        tfidUtilisateur.setText(colidutilisateur.getCellData(index).toString());
        tfTitre.setText(cotitre.getCellData(index).toString());
        tfDescription.setText(coldesc.getCellData(index).toString());
    }

    @FXML
    private void afficherleblog(ActionEvent event) {
    }
}

 
    

   
  


