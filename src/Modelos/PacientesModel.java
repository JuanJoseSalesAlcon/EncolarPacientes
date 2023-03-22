package Modelos;


import Modelos.Pacientes;
import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO 2
 */
public class PacientesModel {
PriorityQueue<Pacientes> ListaPacientes= new PriorityQueue<Pacientes>();
DefaultTableModel ModeloTabla = new DefaultTableModel();

    public void IngresarPaciente(String ape, String nom, String tel, int gra)
    {
        Pacientes nuevoPaciente = new Pacientes(ape, nom, tel, gra);
        ListaPacientes.add(nuevoPaciente);
    }
    
    public DefaultTableModel ListarPacientes()
    {
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRES");
        this.ModeloTabla.addColumn("TELEFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
        
        for(Pacientes MiListaDePacientes:ListaPacientes)
        {
            this.ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(),
                MiListaDePacientes.getNombre(),
                MiListaDePacientes.getTelefono(),
                MiListaDePacientes.getGravedad()});
        }
        return ModeloTabla;
    }
}
