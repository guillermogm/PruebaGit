package net.ausiasmarch.hipoteca.modelo;

/**
 * Calcular una hipoteca
 * @author Programador
 */

public class Hipoteca {
  // Propiedades ............................................
    private double ingresosMensuales,importePrestamo,euribor,diferencial;
    private int anyos,edad;
    private boolean contratadoSeguroVida,contratadoNomina;
    private boolean contratadoTarjeta,contratadoPension;
    private String trabajador, mensaje;
    private StringBuilder sb;
    
    // METODOS set (poner) / get (obtener) para las propiedades
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }    
    
    /**
     * Obtiene los Ingresos Mensuales
     * @return  Los Ingresos Mensuales
     */
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    /**
     * Establece los IngresosMensuales
     * @param ingresosMensuales Los Ingresos Mensuales
     */
    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    /**
     * Obtiene la edad
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad
     * @param edad La edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el tipo de trabajo
     * @return String.
     */
    public String getTrabajador() {
        return trabajador;
    }

    /**
     * Establece el tipo de tasbajo
     * @param trabajador Tipo de trabajo.
     */
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    /**
     * 
     * @return double 
     */
    public double getImportePrestamo() {
        return importePrestamo;
    }

    /**
     * Establece el importe que se solicita de prestamo
     * @param importePrestamo El importe que se solicita de prestamo
     */
    public void setImportePrestamo(double importePrestamo) {
        this.importePrestamo = importePrestamo;
    }

    /**
     * Obtiene el valor del Euribor
     * @return El valor del Euribor
     */
    public double getEuribor() {
        return euribor;
    }

    /**
     * Establece el valor del Euribor
     * @param euribor El valor del Euribor
     */
    public void setEuribor(double euribor) {
        this.euribor = euribor;
    }

    /**
     * Obtiene el diferencial que aplica el banco al euribor
     * @return el diferencial que aplica el banco al euribor
     */
    public double getDiferencial() {
        return diferencial;
    }

    /**
     * Establece el diferencial que aplica el banco al euribor
     * @param diferencial El diferencial que aplica el banco al euribor
     */
    public void setDiferencial(double diferencial) {
        this.diferencial = diferencial;
    }

    /**
     * Obtiene el numero de años a devolver el prestamo
     * @return el numero de años a devolver el prestamo
     */
    public int getAnyos() {
        return anyos;
    }

    /**
     * Establece el numero de años a devolver el prestamo
     * @param anyos El numero de años a devolver el prestamo
     */
    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    /**
     * Obtiene si se ha contratado el Seguro de Vida
     * @return Si se ha contratado el Seguro de Vida
     */
    public boolean isContratadoSeguroVida() {
        return contratadoSeguroVida;
    }

    /**
     * Establece si se ha contratado el Seguro de Vida
     * @param contratadoSeguroVida Si se ha contratado el Seguro de Vida
     */
    public void setContratadoSeguroVida(boolean contratadoSeguroVida) {
        this.contratadoSeguroVida = contratadoSeguroVida;
    }

    /**
     * Obtiene si se ha contratado la Nomina
     * @return si se ha contratado la Nomina
     */
    public boolean isContratadoNomina() {
        return contratadoNomina;
    }

    /**
     * Establece si se ha contratado la Nomina
     * @param contratadoNomina Si se ha contratado la Nomina
     */
    public void setContratadoNomina(boolean contratadoNomina) {
        this.contratadoNomina = contratadoNomina;
    }

    /**
     * Obtiene si se ha contratado la tarjeta de credito
     * @return Si se ha contratado la tarjeta de credito
     */
    public boolean isContratadoTarjeta() {
        return contratadoTarjeta;
    }

    /**
     * Establece si se ha contratado la tarjeta de credito
     * @param contratadoTarjeta Si se ha contratado la tarjeta de credito
     */
    public void setContratadoTarjeta(boolean contratadoTarjeta) {
        this.contratadoTarjeta = contratadoTarjeta;
    }

    /**
     * Obtiene si se ha contratado el plan de pensiones
     * @return Si se ha contratado el plan de pensiones
     */
    public boolean isContratadoPension() {
        return contratadoPension;
    }

    /**
     * Establece si se ha contratado el plan de pensiones
     * @param contratadoPension Si se ha contratado el plan de pensiones
     */
    public void setContratadoPension(boolean contratadoPension) {
        this.contratadoPension = contratadoPension;
    }

  /***************************************************************************
   * METODOS (Funciones)
   ***************************************************************************/

   // Metodo para reglas de validacion ......................................
    /**
     * Comprueba si la hipoteca esta o no concedida.
     * @return Retorna true si la hipoteca esta concedida o false
     * si no lo esta, segun los las siguientes reglas de validacion:
     * 1: La suma de la edad y los años de la hipoteca deben ser menor de 80
     * 2: Los años de la hipoteca deben ser mayor que 1
     * 3: La edad debe ser mayor de 18 años
     * 4: Si es cuenta ajena, el 30% del saldo debe ser mayor que la cuota mensual.
     * 5: Si es autonomo, el 20% del saldo debe ser mayor que la cuota mensual.
     * 6: Si funcionario, el 40% del saldo debe ser mayor que la cuota mensual.
     * 7: Si tiene mas de 50 años debe contratar el seguro de vida
     * 8: El diferencial debe ser mayor o igual de 0,6
     * 9: El Euribor debe ser mayor de -0,071
     *10: Si es funcionario debe contratar al menos 1 producto.
     *11: Si no es funcionario debe contratar al menos 2 productos.
     */
    public double interesAnual() {
    	double interesAnual=  euribor + diferencialReal(); //Ejercicio-1
    	return interesAnual;
    }
    public double cuotaMensual() {
    	double cuotaMensual=(importePrestamo * (interesAnual() / 12)) /
    			(100 * (1 - Math.pow(1 + (interesAnual() / 1200), -(anyos * 12)))); //Ejercicio-2
    	return cuotaMensual;
    }
  
    public boolean validate() {
        sb = new StringBuilder();
        //1: La suma de la Edad y los años de hipoteca deben ser menor de 80
        if (edad + anyos > 80) {
            sb.append(" - La suma de la Edad y los años de hipoteca deben ser menor de 80\n");
        }

        //2: Los años de hipoteca deben ser mayor que 1
        if (anyos < 1) {
            sb.append(" - Los años de la hipoteca deben ser mayor que 1\n");
        }
           
     
        //3: La edad debe ser mayor de 18 años
        if (edad<18) {
        	sb.append("-La edad debe ser mayor de 18 años");
        }
               
        // 4: Si cuenta ajena,el 30% del saldo debe ser mayor que la cuota mensual.

        if (trabajador.contentEquals("Cuenta Ajena") && (ingresosMensuales*0.30)<cuotaMensual()) {
        	sb.append("-El Trabajador por cuenta Ajena necesita que el 30% de los ingresos mensuales sean mayores que la cuota mensual.");
        }
        
        // 5: Si autonomo,el 20% del saldo debe ser mayor que la cuota mensual.
        if (trabajador.contentEquals("Autónomo") && (ingresosMensuales*0.20)<cuotaMensual() ) {
        	sb.append("-El Autonomo necesita que el 20% de los ingresos mensuales sean mayores que la cuota mensual.");
        }
        
        // 6: Si funcionario,el 40% del saldo debe ser mayor que la cuota mensual.
        if (trabajador.contentEquals("Funcionario") && (ingresosMensuales*0.40)<cuotaMensual() ) {
        	sb.append("-El Autonomo necesita que el 20% de los ingresos mensuales sean mayores que la cuota mensual.");
        } 
        
        //7: Si tienes mas de 50 años debe contratar el seguro de vida.
        if (edad>50 && contratadoSeguroVida==false) {
        	sb.append("Si tienes mas de 50 años debe contratar el seguro de vida");
        }
        
        //8: El diferencial debe ser mayor o igual de 0,6
        if (diferencial<0.6) {
        	sb.append("El diferencial debe ser mayor o igual de 0,6.");
        }
  
        //9: El Euribor debe ser mayor de -0.071
        if (euribor<-0.327) {
        	sb.append("El Euribor debe ser mayor de -0.071.");
        }
        

        // 10: Si es funcionario debe contratar al menos 1 producto.
        if (trabajador.equals("Funcionario") && contratadoNomina==false && contratadoSeguroVida && contratadoTarjeta  && contratadoPension) {      	
        
        	sb.append("Si es funcionario debe contratar al menos 1 producto.");
        }
        
        // 11: Si no es funcionario debe contratar al menos 2 productos.
        
        if (trabajador!="Funcionario") {
        	int total = 0;
            
            if (contratadoNomina) {
            	total++;
            }
            if (contratadoSeguroVida) {
            	total++;
            }
            if (contratadoTarjeta) {
            	total++;
            }
            if (contratadoPension) {
            	total++;
            }
            if(total<2)
        	sb.append("Debe contratar al menos 2 productos.");
			System.out.print("Total es:"+total);
        }
     
        // devolvemos true o false
        mensaje = sb.toString();
        return mensaje.isEmpty();
    }

    
   // Metodos pra calculos ..................................................

     /**
     * Obtiene el diferencial real para el calculo de los intereses
     * @return El diferencial real
     */
    public double diferencialReal() {
        double diferencialReal = diferencial;
        //calculo del diferencial real en funcion de los productos contratados

        if (contratadoSeguroVida) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoNomina) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoTarjeta) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoPension) {
            diferencialReal = diferencialReal - 0.1;
        }
        return diferencialReal;
    }
    

}// fin class Hipoteca
