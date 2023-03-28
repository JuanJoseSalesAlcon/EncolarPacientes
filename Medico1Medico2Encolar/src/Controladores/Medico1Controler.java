/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Medico1;
import Modelos.Medico1Model;
import Modelos.Medico2;
import Modelos.Medico2Model;
import Vistas.frmPacientes;
import Vistas.frmIngresarPacientes1;
import Vistas.frmVerPacientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO 2
 */
public class Medico1Controler implements ActionListener{
frmIngresarPacientes1 VistaIngresarPacientes;
frmVerPacientes VistaPacientes; 
frmPacientes PrincipalPacientes;
Medico1Model ModeloMedico1;
Medico2Model ModeloMedico2;

    public Medico1Controler(frmIngresarPacientes1 Pacientes,frmVerPacientes VistaPacientes, frmPacientes VistaIngresarPacientes,
            Medico1Model ModeloMedico1, Medico2Model ModeloMedico2) {
        this.VistaIngresarPacientes = Pacientes;
        this.VistaPacientes = VistaPacientes;
        this.PrincipalPacientes = VistaIngresarPacientes;
        this.ModeloMedico1 = ModeloMedico1;
        this.ModeloMedico2 = ModeloMedico2;
        
        //PONER A LA ESCUCHA LOS BOTONESs
        this.PrincipalPacientes.btnIngresarPacientes.addActionListener(this);
        this.PrincipalPacientes.btnVerPacientes.addActionListener(this);
        this.VistaIngresarPacientes.btnMedico1.addActionListener(this);
        this.VistaIngresarPacientes.btnMedico2.addActionListener(this);
        this.VistaPacientes.btnAtenderM1.addActionListener(this);
        this.VistaPacientes.btnAtenderM2.addActionListener(this);
        //LEVANTAR LA VISTA LISTAs
        this.PrincipalPacientes.setLocationRelativeTo(null);
        this.PrincipalPacientes.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.PrincipalPacientes.btnIngresarPacientes){
            
            this.VistaIngresarPacientes.setLocationRelativeTo(null);
            this.VistaIngresarPacientes.setVisible(true);     
        }
        if(e.getSource() == this.VistaIngresarPacientes.btnMedico1)
        {
            this.ModeloMedico1.EncolarPaciente1(this.VistaIngresarPacientes.txtApellidos.getText(), 
                    this.VistaIngresarPacientes.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<Medico1> listaLocal1 = this.ModeloMedico1.ListarPacientes1();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(Medico1 MiListaPacientes: listaLocal1)
                {
                    Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+"\n";
                    this.VistaPacientes.txtListaMedico1.setText(Cadena);
                }
        }    
        if(e.getSource() == this.VistaIngresarPacientes.btnMedico2)
        {
            this.ModeloMedico2.EncolarPaciente2(this.VistaIngresarPacientes.txtApellidos.getText(), 
                    this.VistaIngresarPacientes.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<Medico2> listaLocal2 = this.ModeloMedico2.ListarPacientes2();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(Medico2 MiListaPacientes: listaLocal2)
                {
                    Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+"\n";
                    this.VistaPacientes.txtListaMedico2.setText(Cadena);
                }
        }
        if(e.getSource() == this.PrincipalPacientes.btnVerPacientes){
            
            this.VistaPacientes.setLocationRelativeTo(null);
            this.VistaPacientes.setVisible(true);     
        }
        if(e.getSource() == this.VistaPacientes.btnAtenderM1)
        {
            Queue<Medico1> listaLocal1 = this.ModeloMedico1.ListarPacientes1();
            listaLocal1.remove();
            String Cadena = "";
                for(Medico1 MiListaPacientes: listaLocal1)
                {
                    Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+"\n";
                }
                this.VistaPacientes.txtListaMedico1.setText(Cadena);   
        }   
        if(e.getSource() == this.VistaPacientes.btnAtenderM2)
        {
            Queue<Medico2> listaLocal2 = this.ModeloMedico2.ListarPacientes2();
            listaLocal2.remove();
            String Cadena = "";
                for(Medico2 MiListaPacientes: listaLocal2)
                {
                    Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+"\n";
                }
                this.VistaPacientes.txtListaMedico2.setText(Cadena);  
        } 
        
        }
    }
    
