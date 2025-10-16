package ActividadEvaluativa2;


public class CuentaBancaria {
    //atributos de la clase 
  private String titular; 
  private String numerodecuenta;
  private double saldo;

  // metodo constructor inicializacion
    public CuentaBancaria (){
        this.titular = "sin titular";
        this.numerodecuenta = "00000";
        this.saldo = 0.0;
    }
  // metodo constructor parametizado
 
  public CuentaBancaria(String titular,String numerodecuenta, double saldo){
    this.titular = titular;
    this.numerodecuenta = numerodecuenta;
    if(saldo>0){
        this.saldo = saldo;
    }else {
        this.saldo = 0.0;
    }
  }
    
  //metodos 
  public String getTitular(){
    return titular;
  } 

  public void setTitular(String titular){
    this.titular = titular;
  } 

  public String getNumerodecuenta(){
    return numerodecuenta;
  } 

  public void setNumerodecuenta(String numerodecuenta){
    this.numerodecuenta = numerodecuenta;
  } 

  public double getSaldo(){
    return saldo;
  } 

  public void setSaldo(double saldo){
    this.saldo = saldo;
  } 

  public void depositar(double monto){
    if(monto>0){
        saldo = saldo + monto;
     System.out.println("Deposito realizado exitoso.Nuevo saldo es:"+saldo);
    }else{
        System.out.println("El monto debe ser mayor 0");
    }
     
  } 

  public void retirar(double monto){
    if(monto>0){
        saldo=saldo-monto;
        System.out.println("Retiro realizado exitoso.Nuevo saldo es:"+saldo);
    }else{
        System.out.println("Retiro denegado saldo insufienete o monto invalido.");
    }
  } 

  public String toString(){
    return "Informacion de la cuenta [ Titular: " + titular + " Numero de cuenta: " + numerodecuenta + " Saldo de la cuenta : " + saldo + " ]"; 
  }



    /**1. ¿Por qué el atributo saldo debe ser privado?
     * R//= debido a que si fuer publico podrian cambiar el valor sin control y generar errores en el codigo 
     * 2. ¿Qué ocurriría si se intenta depositar un valor negativo? 
     * lo que pasar es que el codigo imprimira un mensaje que le dice al usuario que el monto debe ser mayor a 0 
     *  Modifique en vivo el código para permitir un sobregiro máximo de -50 y explique el cambio
     * public void retirar(double monto){
      if(monto>0 && (saldo - monto) >= -50){
        saldo -= saldo;
        System.out.println("Retiro realizado exitoso.Nuevo saldo es:"+saldo);
      }else{
        System.out.println("Error saldo insuficinete.limite sobre cargado es 50.");
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
     * 
     * 
     * 
     */







































}
