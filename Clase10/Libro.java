package Clase10;

public class Libro {
    
    private String titulo;
    private String autor;
    private int aniodePublicacion;


     public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    } 
     //Métodos Getter and Setter
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnioPublicacion(){
        return aniodePublicacion;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    
    public String toString(){
        return "Libro [ Título: " + titulo + " Autor: " + autor + " Año publicación: " + anioPublicacion + " ]"; 
    }
}











































































































