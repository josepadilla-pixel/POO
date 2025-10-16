package ActividadEvaluativa2;

public class EjecutadorCuenBank {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("José", "12097", 2000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Manuel", "40ABJ", 3000);

    
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        
        cuenta1.depositar(500);   
        cuenta1.retirar(1000);   
            

        
        System.out.println("\n--- ESTADO FINAL DE LAS CUENTAS ---");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}

