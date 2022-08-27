package udea.edu.co.caja.caja.Servicios;

import udea.edu.co.caja.caja.Entidades.Employee;
import udea.edu.co.caja.caja.Entidades.Profile;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServiciosEmployee {

    public ArrayList <Employee > listEmployee (){

     Profile  perfil=new Profile("2", "Administrador","312443443", LocalDate.of(2022,06,07), LocalDate.of(2022,06,07));

        ArrayList listaEmpleados = new ArrayList<Employee>();
        Employee empleado1 = new Employee(1,"empleado1@gmail.com",LocalDate.of(2022,07,01),LocalDate.of(2022,07,6));
        Employee empleado2 = new Employee(2,"empleado2@gmail.com",LocalDate.of(2021,12,03),LocalDate.of(2022,07,6));
        Employee empleado3 = new Employee(65200,"empleado456789@gmail.com",LocalDate.of(2021,12,03),LocalDate.of(2022,07,6));
         empleado1.setProfile(perfil);
        empleado2.setProfile(perfil);
        empleado3.setProfile(perfil);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        return listaEmpleados;
    }


    public Employee buscarEmployee (int id) {

        ArrayList listaEmpleados = this.listEmployee();
        Employee empleado=null;
         for (int i = 0; i < listaEmpleados.size(); i++) {
            empleado = (Employee) listaEmpleados.get(i);
            if (empleado.getId() == id) {
                break;
            }else{
                empleado=null;//fin del if
            }
        }// fin del for
        return empleado;
    }
}
