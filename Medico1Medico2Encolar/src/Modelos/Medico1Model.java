/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO 2
 */
public class Medico1Model {
Queue<Medico1> ListaMedico1 = new LinkedList();

    public void EncolarPaciente1(String ape, String nom)
    {
        Medico1 nuevoPaciente1 = new Medico1(ape, nom);
        this.ListaMedico1.add(nuevoPaciente1);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO A LA LISTA DEL MEDICO 1");
    }
    
public Queue ListarPacientes1()
{
    return this.ListaMedico1;
}

public void DesEncolar1()
{
    this.ListaMedico1.poll();
}

}

