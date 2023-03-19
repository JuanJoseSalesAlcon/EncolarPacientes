
import Controladores.Medico1Controler;
import Modelos.Medico1Model;
import Modelos.Medico2Model;
import Vistas.frmPacientes;
import Vistas.frmIngresarPacientes1;
import Vistas.frmVerPacientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO 2
 */
public class main {

    public static void main(String[] args) {
        frmIngresarPacientes1 Pacientes = new frmIngresarPacientes1(null, true);
        frmVerPacientes VistaPacientes = new frmVerPacientes(null, true);
        frmPacientes VistaIngresarPacientes = new frmPacientes(null, true);
        Medico1Model ModeloLista1 = new Medico1Model();
        Medico2Model ModeloLista2 = new Medico2Model();
        
        Medico1Controler ControladorLista = new Medico1Controler(Pacientes, VistaPacientes, VistaIngresarPacientes, ModeloLista1, ModeloLista2);
    }
    
}
