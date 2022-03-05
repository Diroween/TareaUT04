package cuentas;

/**
 * Esta clase simula la creación de una cuenta y las acciones posibles de utilización de esta
 * 
 * @author El profesor
 * @author Yosef Guillermo Karam Müller
 * @version 1.5
 * @since 05/03/2022
 * 
 * */

public class CCuenta {

	/**
	 * El nombre un supuesto cliente
	 * */
	
    private String nombre;
    
    /**
     * La cuenta de un supuesto cliente
     * */
    
    private String cuenta;
    /** 
     * El saldo que tiene un supuesto cliente en la cuenta
     * */
    private double saldo;
    
    /**
     * El tipo de interés que se le aplica a la cuenta
     * */
    private double tipoInterés;
    
    /**
     * Constructor sin argumentos
     * */

    public CCuenta()
    {
    }
    
    /**
     * Constructor con parámetros que asigna valores a los atributos a través de los metodos setter
     * 
     * @param nom representa el nombre de un supuesto cliente
     * @param cue representa el número de cuenta de un supuesto cliente
     * @param sal representa el saldo de cuenta de un supuesto cliente
     * @param tipo representa el tipo de cuenta de un supuesto cliente
     * 
     * */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Metodo que devuelve el saldo actual
     * 
     * @deprecated sería mejor usar getSaldo(), ya que este metodo únicamente llama al metodo getter
     * 
     * @return getSaldo() el saldo actual de la cuenta
     * */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Metodo que simula un ingreso en cuenta
     *
     * @param cantidad representa la cantidad a ingresar
     * @throws Exception cuando la cantidad a ingresar es erronea
     * 
     * */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método que simula la retirada en cuenta
     * 
     * @param cantidad representa la cantidad a retirar
     * @throws Exception cuando la cantidad a retirar es incorrecta 
     * */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * nombre representa el nombre del supuesto cliente que tiene una cuenta
     * 
     * @return nombre el nombre de la persona
     * */

	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Con este método podemos introducir el nombre de un supuesto cliente
	 * 
	 * @param nombre el nombre de la persona
	 * 
	 * */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * cuenta representa el numero de cuenta de un supuesto cliente
	 * 
	 * @return cuenta el numero de cuenta
	 * */

	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Introducimos el numero de cuenta de un supuesto cliente
	 * 
	 * @param cuenta el nombre de la persona
	 * 
	 * */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * saldo representa el saldo de un supuesto cliente en su cuenta
	 * 
	 * @return saldo el saldo que hay en la cuenta
	 * */

	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * Introducimos el saldo en cuenta de un supuesto cliente
	 * 
	 * @param saldo el saldo disponible de la persona
	 * 
	 * */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * tipoInteres representa ciertas comisiones a las que está sujeta la cuenta de un supuesto cliente
	 * 
	 * @return tipoInteres de la cuenta de un cliente
	 * */

	private double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * Introducimos el tipo de interes a aplicar en cuenta de un supuesto cliente
	 * 
	 * @param tipoInterés que se le va a aplicar
	 * 
	 * */

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
