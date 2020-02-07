package net.ausiasmarch.hipoteca.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.ausiasmarch.common.Convert;
import net.ausiasmarch.hipoteca.modelo.*;
import javax.swing.ImageIcon;
import java.awt.Font;

/**
 * Hipoteca.java
 * @author Programador
 */
public class Main extends javax.swing.JFrame {

	private static final long serialVersionUID = -8263889842974238756L;
	// Delaramos un objeto hipoteca
    private final Hipoteca hipoteca;

    public Main() {
        initComponents();
        hipoteca = new Hipoteca();   // creamos el objeto hipoteca
        
        iniciaForm();
    }

    /**
     * Inicia el form
     */
    private void iniciaForm() {
        getContentPane().setBackground(Color.WHITE);
        setSize(900, 600);
        setLocationRelativeTo(null);

    }

    private void initComponents() {
        jPanelDatos = new javax.swing.JPanel();
        jTextFieldEuribor = new javax.swing.JTextField();
        jTextFieldEuribor.setBounds(150, 360, 76, 22);
        jTextFieldImportePrestamo = new javax.swing.JTextField();
        jTextFieldImportePrestamo.setBounds(170, 280, 100, 20);
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator1.setBounds(10, 250, 850, 10);
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator2.setBounds(10, 430, 850, 10);
        jLabelEuribor = new javax.swing.JLabel();
        jLabelEuribor.setBounds(80, 360, 60, 20);
        jLabelIngresos = new javax.swing.JLabel();
        jLabelIngresos.setBounds(315, 130, 150, 20);
        jTextFieldDiferencialReal = new javax.swing.JTextField();
        jTextFieldDiferencialReal.setBounds(40, 470, 120, 22);
        jTextFieldInteresAnual = new javax.swing.JTextField();
        jTextFieldInteresAnual.setBounds(190, 470, 100, 22);
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNombre.setBounds(390, 60, 460, 22);
        jLabelEdad = new javax.swing.JLabel();
        jLabelEdad.setBounds(630, 130, 45, 20);
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldEdad.setBounds(680, 130, 40, 22);
        jLabelDiferencialReal = new javax.swing.JLabel();
        jLabelDiferencialReal.setBounds(40, 450, 120, 16);
        jTextFieldIngresosMes = new javax.swing.JTextField();
        jTextFieldIngresosMes.setBounds(467, 130, 115, 22);
        jTextFieldAnyos = new javax.swing.JTextField();
        jTextFieldAnyos.setBounds(380, 280, 80, 20);
        jLabelCuotaMensual = new javax.swing.JLabel();
        jLabelCuotaMensual.setBounds(320, 450, 120, 16);
        jButtonCalcular = new javax.swing.JButton();
        jButtonCalcular.setBounds(571, 460, 126, 40);
        jLabelInteresAnual = new javax.swing.JLabel();
        jLabelInteresAnual.setBounds(190, 450, 100, 16);
        jTextFieldDiferencial = new javax.swing.JTextField();
        jTextFieldDiferencial.setBounds(360, 360, 73, 22);
        jLabelDiferencial = new javax.swing.JLabel();
        jLabelDiferencial.setBounds(270, 360, 80, 20);
        jTextFieldCuotaMensual = new javax.swing.JTextField();
        jTextFieldCuotaMensual.setBounds(320, 470, 195, 22);
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator3.setBounds(10, 320, 850, 18);
        jLabelAnyos = new javax.swing.JLabel();
        jLabelAnyos.setBounds(326, 280, 40, 20);
        jLabelNombre = new javax.swing.JLabel();
        jLabelNombre.setBounds(320, 60, 65, 16);
        jLabelImportePrestamo = new javax.swing.JLabel();
        jLabelImportePrestamo.setBounds(30, 280, 135, 20);
        jLabelHipoteca = new javax.swing.JLabel();
        jLabelHipoteca.setBounds(10, 20, 290, 200);
        jButtonSalir = new javax.swing.JButton();
        jButtonSalir.setBounds(720, 460, 120, 40);
        jLabelEuros2 = new javax.swing.JLabel();
        jLabelEuros2.setBounds(280, 280, 10, 16);
        jLabelEuros1 = new javax.swing.JLabel();
        jLabelEuros1.setBounds(590, 130, 10, 16);
        jPanelProductos = new javax.swing.JPanel();
        jPanelProductos.setFont(new Font("Tahoma", Font.PLAIN, 13));
        jPanelProductos.setBounds(530, 330, 300, 80);
        jCheckBoxSeguroVida = new javax.swing.JCheckBox();
        jCheckBoxNomina = new javax.swing.JCheckBox();
        jCheckBoxTarjeta = new javax.swing.JCheckBox();
        jCheckBoxPension = new javax.swing.JCheckBox();
        jComboBoxTrabajador = new javax.swing.JComboBox<>();
        jComboBoxTrabajador.setBounds(430, 180, 180, 22);
        jLabelTrabajador = new javax.swing.JLabel();
        jLabelTrabajador.setBounds(320, 180, 100, 16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo de una Hipoteca");
        setFocusable(false);
        setResizable(false);

        jPanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDatos.setOpaque(false);
        jPanelDatos.setLayout(null);
        jPanelDatos.add(jTextFieldEuribor);
        jPanelDatos.add(jTextFieldImportePrestamo);
        jPanelDatos.add(jSeparator1);
        jPanelDatos.add(jSeparator2);

        jLabelEuribor.setText("Euribor");
        jPanelDatos.add(jLabelEuribor);

        jLabelIngresos.setText("Ingresos Mensuales");
        jPanelDatos.add(jLabelIngresos);

        jTextFieldDiferencialReal.setEditable(false);
        jTextFieldDiferencialReal.setBackground(new java.awt.Color(204, 204, 255));
        jPanelDatos.add(jTextFieldDiferencialReal);

        jTextFieldInteresAnual.setEditable(false);
        jTextFieldInteresAnual.setBackground(new java.awt.Color(204, 204, 255));
        jPanelDatos.add(jTextFieldInteresAnual);
        jPanelDatos.add(jTextFieldNombre);

        jLabelEdad.setText("Edad");
        jPanelDatos.add(jLabelEdad);
        jPanelDatos.add(jTextFieldEdad);
        
        jLabelDiferencialReal.setText("Diferencial Real:");
        jPanelDatos.add(jLabelDiferencialReal);
        jPanelDatos.add(jTextFieldIngresosMes);
        jPanelDatos.add(jTextFieldAnyos);

        jLabelCuotaMensual.setText("Cuota mensual:");
        jPanelDatos.add(jLabelCuotaMensual);

        jButtonCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanelDatos.add(jButtonCalcular);

        jLabelInteresAnual.setText("Interes Anual");
        jPanelDatos.add(jLabelInteresAnual);
        jPanelDatos.add(jTextFieldDiferencial);

        jLabelDiferencial.setText("Diferencial");
        jPanelDatos.add(jLabelDiferencial);

        jTextFieldCuotaMensual.setEditable(false);
        jTextFieldCuotaMensual.setBackground(new java.awt.Color(204, 204, 255));
        jPanelDatos.add(jTextFieldCuotaMensual);
        jPanelDatos.add(jSeparator3);

        jLabelAnyos.setText("Años");
        jPanelDatos.add(jLabelAnyos);

        jLabelNombre.setText("Nombre");
        jPanelDatos.add(jLabelNombre);

        jLabelImportePrestamo.setText("Importe Prestamo");
        jPanelDatos.add(jLabelImportePrestamo);

        jLabelHipoteca.setIcon(new ImageIcon(Main.class.getResource("/net/ausiasmarch/hipoteca/recursos/hipoteca.jpg"))); // NOI18N
        jPanelDatos.add(jLabelHipoteca);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelDatos.add(jButtonSalir);

        jLabelEuros2.setText("€");
        jPanelDatos.add(jLabelEuros2);

        jLabelEuros1.setText("€");
        jPanelDatos.add(jLabelEuros1);

        jPanelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Productos contratados ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(51, 0, 204))); // NOI18N
        jPanelProductos.setOpaque(false);

        jCheckBoxSeguroVida.setText("Seguro Vida");
        jCheckBoxSeguroVida.setOpaque(false);

        jCheckBoxNomina.setText("Nómina");
        jCheckBoxNomina.setOpaque(false);

        jCheckBoxTarjeta.setText("Tarjeta");
        jCheckBoxTarjeta.setOpaque(false);

        jCheckBoxPension.setText("Plan pensiones");
        jCheckBoxPension.setOpaque(false);

        javax.swing.GroupLayout jPanelProductosLayout = new javax.swing.GroupLayout(jPanelProductos);
        jPanelProductos.setLayout(jPanelProductosLayout);
        jPanelProductosLayout.setHorizontalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxTarjeta)
                    .addComponent(jCheckBoxSeguroVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPension)
                    .addComponent(jCheckBoxNomina))
                .addContainerGap())
        );
        jPanelProductosLayout.setVerticalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductosLayout.createSequentialGroup()
                .addGroup(jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSeguroVida)
                    .addComponent(jCheckBoxNomina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductosLayout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jCheckBoxTarjeta))
                    .addGroup(jPanelProductosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxPension)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanelDatos.add(jPanelProductos);

        jComboBoxTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Ajena", "Autónomo", "Funcionario" }));
        jPanelDatos.add(jComboBoxTrabajador);

        jLabelTrabajador.setText("Trabajador");
        jPanelDatos.add(jLabelTrabajador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    /**
     * Boton calcular
     * @param evt 
     */
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        // 1) Declaramos todas las variables de entrada y salida
        double ingresosMensuales,importePrestamo,euribor,diferencial;
        int edad,anyos;
        double diferencialReal,interesAnual,cuotaMensual;
        
        StringBuilder sb = new StringBuilder();

        // 2) Limpiamos los campos de datos de salida o resultados
        jTextFieldDiferencialReal.setText("");
        jTextFieldInteresAnual.setText("");
        jTextFieldCuotaMensual.setText("");

        // 3) Obtenemos y validamos los datos de entrada
        if (jTextFieldNombre.getText().isEmpty()) {
            sb.append(" - Nombre: No pueden quedar en blanco.\n");
        }

        if (!Convert.isValidDouble(jTextFieldIngresosMes.getText())) {
            sb.append(" - Ingresos mensuales: Valor no valido.\n");
        }
        if (!Convert.isValidDouble(jTextFieldImportePrestamo.getText())) {
            sb.append(" - Importe prestamo: Valor no valido.\n");
        }
        if (!Convert.isValidDouble(jTextFieldEuribor.getText())) {
            sb.append(" - Euribor: Valor no valido.\n");
        }
        if (!Convert.isValidDouble(jTextFieldDiferencial.getText())) {
            sb.append(" - Ingresos mensuales: Valor no valido.\n");
        }
        if (!Convert.isValidInt(jTextFieldEdad.getText())) {
            sb.append(" - Edad: Valor no valido.\n");
        }
        if (!Convert.isValidInt(jTextFieldAnyos.getText())) {
            sb.append(" - Anyos: Valor no valido.\n");
        }
        
        // Si hay errores de entrada (sintacticos)
        if (sb.length() > 0) {
            mensaje(sb.toString());
            return;                    // no continuamos
        }
     
        // 4) Hacemos las conversiones de datos numericos
        ingresosMensuales = Convert.parseDouble(jTextFieldIngresosMes.getText());
        edad = Convert.parseInt(jTextFieldEdad.getText());
        anyos = Convert.parseInt(jTextFieldAnyos.getText());
        importePrestamo = Convert.parseDouble(jTextFieldImportePrestamo.getText());
        euribor = Convert.parseDouble(jTextFieldEuribor.getText());
        diferencial =Convert.parseDouble(jTextFieldDiferencial.getText());
        //5)
        
        // 5) Pasamos los datos de entrada a hipoteca
        // Los numericos
        hipoteca.setIngresosMensuales(ingresosMensuales);
        hipoteca.setEdad(edad);
        hipoteca.setAnyos(anyos);
        hipoteca.setImportePrestamo(importePrestamo);
        hipoteca.setEuribor(euribor);
        hipoteca.setDiferencial(diferencial);
        
       
        // y los boleanos de los checkBox
        hipoteca.setContratadoSeguroVida(jCheckBoxSeguroVida.isSelected());
        hipoteca.setContratadoNomina(jCheckBoxNomina.isSelected());
        hipoteca.setContratadoTarjeta(jCheckBoxTarjeta.isSelected());
        hipoteca.setContratadoPension(jCheckBoxPension.isSelected());
        hipoteca.setTrabajador(jComboBoxTrabajador.getSelectedItem().toString());
        
        if (hipoteca.validate() == false) {
         	 sb.append(hipoteca.getMensaje());
         	 mensaje(sb.toString());
         	 return;
         	 } 
        
        // 6) Obtenemos cálculos desde el objeto hipoteca
        diferencialReal = hipoteca.diferencialReal();
        interesAnual = hipoteca.interesAnual();
        cuotaMensual = hipoteca.cuotaMensual();
   
        // 7) Mostramos los resultados con formato en los campos de salida 
        jTextFieldDiferencialReal.setText(Convert.format(diferencialReal, 2));
        jTextFieldInteresAnual.setText(Convert.format(interesAnual, 2));
        jTextFieldCuotaMensual.setText(Convert.format(cuotaMensual, 2));
     


    }

    /**
     * Salir de la aplicacion
     * @param evt 
     */
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * Mensajes para el usuario
     * @param mensaje 
     */
    private void mensaje(String mensaje) {
        mensaje = "\n" + mensaje + "\n";
        JOptionPane.showMessageDialog(this, mensaje,
         " Se han encontrado los siguientes errores", JOptionPane.ERROR_MESSAGE);
    }

    /**
     **********************************************************************
     * Método principal del JFrame donde se inicia la aplicación 
     **********************************************************************
     * @param args
     */
    public static void main(String args[]) {
    	
        try {
            String look = UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(look);
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.setVisible(true);
            }
        });
    } // fin de main ................
    
    
    // Variables  
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxNomina;
    private javax.swing.JCheckBox jCheckBoxPension;
    private javax.swing.JCheckBox jCheckBoxSeguroVida;
    private javax.swing.JCheckBox jCheckBoxTarjeta;
    private javax.swing.JComboBox<String> jComboBoxTrabajador;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelImportePrestamo;
    private javax.swing.JLabel jLabelCuotaMensual;
    private javax.swing.JLabel jLabelAnyos;
    private javax.swing.JLabel jLabelTrabajador;
    private javax.swing.JLabel jLabelEuros2;
    private javax.swing.JLabel jLabelEuros1;
    private javax.swing.JLabel jLabelEuribor;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelDiferencial;
    private javax.swing.JLabel jLabelDiferencialReal;
    private javax.swing.JLabel jLabelInteresAnual;
    private javax.swing.JLabel jLabelIngresos;
    private javax.swing.JLabel jLabelHipoteca;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelProductos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldAnyos;
    private javax.swing.JTextField jTextFieldCuotaMensual;
    private javax.swing.JTextField jTextFieldDiferencial;
    private javax.swing.JTextField jTextFieldDiferencialReal;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldEuribor;
    private javax.swing.JTextField jTextFieldImportePrestamo;
    private javax.swing.JTextField jTextFieldIngresosMes;
    private javax.swing.JTextField jTextFieldInteresAnual;
    private javax.swing.JTextField jTextFieldNombre;
}
