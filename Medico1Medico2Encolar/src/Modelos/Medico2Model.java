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
public class Medico2Model {
Queue<Medico2> ListaMedico2 = new LinkedList();

    public void EncolarPaciente2(String ape, String nom)
    {
        Medico2 nuevoPaciente2 = new Medico2(ape, nom);
        this.ListaMedico2.add(nuevoPaciente2);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO A LA LISTA DEL MEDICO 2");
    }
    
public Queue ListarClientes2()
{
    return this.ListaMedico2;
}

public void DesEncolar2()
{
    this.ListaMedico2.poll();
}

}

