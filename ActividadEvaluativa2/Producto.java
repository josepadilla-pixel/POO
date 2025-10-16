package ActividadEvaluativa2;

public class Producto {
  
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double preciounitario;

    //metodo constructor inicializacion

    public Producto(){
        this.codigo = "0000";
        this.descripcion = "sin descripcion";
        this.cantidad = 1;
        this.preciounitario = 0.0;
    } 
    //metodo constructor parametizado 
    public Producto(String codigo,String descripcion,int catidad,double preciounitario){
        this.codigo = codigo;
        this.descripcion = descripcion; 
        
        if(cantidad>=1){
            this.cantidad = catidad;
        }else{
            this.cantidad = 1;
        }
        
       

        if(preciounitario>=0){
            this.preciounitario = preciounitario;
        }else{
            this.preciounitario = 0.0;
        }


    }
    
 //metodos 

 public String getCodigo(){
    return codigo;
 } 

 public void setCodgigo(String codigo){
    this.codigo = codigo;
 } 

 public String getDescripcion(){
    return descripcion;
 }  

 public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
 } 

 public int getCantidad(){
    return cantidad;
 } 

 public void setCantidad(int cantidad){
  if(cantidad>=1){
    this.cantidad = cantidad;
  }else{
    System.out.println("la cantidaddebe ser al menos 1");
  }

 } 

 public double getPreciounitario(){
    return preciounitario;
 } 

 public void setPreciounitario(double preciounitario){
    if (preciounitario >=0){
        this.preciounitario = preciounitario;
    }else{
        System.out.println("el precio unitario no puede negativo");
    }
 }  

 public  double calcularsubtotal(){
    return cantidad * preciounitario;
 }  

 public double aplicardescuento(double porcentaje){
    if(porcentaje >=0 && porcentaje <=50){
        double descuento = calcularsubtotal() * (porcentaje / 100);
        return calcularsubtotal() - descuento;
    }else{
        System.out.println("Error: El porcentaje debe estar entre 0 y 50.");
        return calcularsubtotal();
    }
 } 

 public void imcrementarCantidad(int valor){
    if ( valor > 0){
        cantidad = cantidad + valor; 
        System.out.println("cantidad incrementada en +"+valor);
    }else{
        System.out.println("Error:El valor debe ser mayor que 0");
    }
 } 

 public String toString(){
    return "Informacion del producto [ Codigo: " + codigo + " Descripcion: " + descripcion + " Cantidad : " + cantidad+ " Subtoltal:"+calcularsubtotal()+"]"; 
  } 


  /**
   * ¿Por qué se valida el porcentaje del descuento?
   * R//= por que tiene que esatr dentro de un rango de 0 a 50% sino el codigo generaria erorres y tambien sin validacion el porcentaje podria tambien ser cambiado a uno negativo
   * ¿Qué sucede si el precio unitario es negativo?
   * pues en ese caso el codigo tiene un mensaje que imprimira que el valor no puede ser negativo
   * ¿Qué sucede si el precio unitario es negativo?
   * public double aplicarDescuento(double porcentaje) {
    if (porcentaje >= 0 && porcentaje <= 50) {
        double descuento = calcularSubtotal() * (porcentaje / 100);
        double totalConDescuento = calcularSubtotal() - descuento;
        double impuesto = totalConDescuento * 0.08; // 8% de impuesto
        return totalConDescuento + impuesto;
    } else {
        System.out.println("Error: El porcentaje debe estar entre 0 y 50.");
        return calcularSubtotal();
    }
     }
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   


   */


 


 






































































































}
