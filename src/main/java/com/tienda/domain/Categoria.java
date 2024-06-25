package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

        
    @Data //especificar que es una capa de datos
    @Entity // Esta clase esta enlazada a una tabla en la bd
    @Table (name="categoria") // Especificar cual categoria
    
public class Categoria implements Serializable {

   
  private static final long serialVersionUID = 1L; //autoincremento en java MySQL(AUTO_INCREMENT)  
  
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column (name= "id_categoria")
          
  private long idCategoria;
  private String descripcion;
  private String rutaImagen;
  private boolean activo;
  
        public Categoria() {
        }

        public Categoria(String categoria, boolean activo) {
            this.descripcion = categoria;
            this.activo = activo;
        }
    
}
