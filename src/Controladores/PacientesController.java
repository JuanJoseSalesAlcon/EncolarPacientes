/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.PacientesModel;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO 2
 */
public class PacientesController implements ActionListener{
    frmPrincipal VistaPricipal;
    PacientesModel ModeloPacientes;
    

    public PacientesController(frmPrincipal VistaPricipal, PacientesModel ModeloPacientes) {
        this.VistaPricipal = VistaPricipal;
        this.ModeloPacientes = ModeloPacientes;
        
    //PONER A LA ESCUCHA LOS BOTONES
    this.VistaPricipal.btnIngresar.addActionListener(this);
    this.VistaPricipal.btnAtender.addActionListener(this);
    //LEVANTAR LA VISTA PRINCIPAL
    this.VistaPricipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
    this.VistaPricipal.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource() == this.VistaPricipal.btnIngresar){
               this.ModeloPacientes.IngresarPaciente(this.VistaPricipal.txtApellidos.getText(),
                       this.VistaPricipal.txtNombre.getText(),
                       this.VistaPricipal.txtTelefono.getText(),
                       Integer.parseInt(this.VistaPricipal.txtPrioridad.getText()));
               this.VistaPricipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
           }
    }
    
}
