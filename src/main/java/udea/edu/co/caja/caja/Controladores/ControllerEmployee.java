package udea.edu.co.caja.caja.Controladores;

import udea.edu.co.caja.caja.Entidades.Profile;
import org.springframework.web.bind.annotation.*;
import udea.edu.co.caja.caja.Entidades.Employee;
import udea.edu.co.caja.caja.Servicios.ServiciosEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/Employee")
public class ControllerEmployee {
   Profile perfil;
   ServiciosEmployee serviciosEmployee = new ServiciosEmployee();


    @GetMapping(value="/list")
    public ArrayList listEmployee(){

        return serviciosEmployee.listEmployee();

    }

    @GetMapping(value="/list/{id}")
    public Employee buscarEmployee(@PathVariable int id){
         return serviciosEmployee.buscarEmployee(id);
    }


    @PostMapping(value = "/save")
    public String guardar (){
         return "Si se Guardo el Empleado";
    }

}
