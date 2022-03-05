package cuentas;

/**
 * Clase main que usamos para simular las operaciones de una cuenta desde su creación
 * 
 * @author El profesor
 * @author Yosef Guillermo Karam Müller
 * @since 05/03/2022
 * 
 * */

public class Main {
	
	/**
	 * Método main que usamos para llevar a cabo las simulaciones
	 * 
	 *  @param args El parametro de todos los métodos main
	 * */

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(2500f);
    }
    
    /**
     * Metodo que usamos para operar con la cuenta
     * 
     * @param cantidad el saldo inicial con el que abre la cuenta un supuesto cliente
     * 
     * */

	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
