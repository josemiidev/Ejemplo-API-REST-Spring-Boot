package dev.josemii.api_rest_ejemplo.Controladores;

import dev.josemii.api_rest_ejemplo.Modelo.EmpleadosClass;
import dev.josemii.api_rest_ejemplo.Modelo.IEmpleadosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api-rest/empleaods")
public class controladorEmpleados {
    @Autowired
    IEmpleadosDAO empleadosDAO;

    @GetMapping
    public List<EmpleadosClass> buscarEmpleados(){
        return (List<EmpleadosClass>) empleadosDAO.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadosClass> buscarEmpleadosId(@PathVariable(value = "id") int id){
        Optional<EmpleadosClass> empleado = empleadosDAO.findById(id);
        if(empleado.isPresent()){
            return ResponseEntity.ok().body(empleado.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public EmpleadosClass guardarEmpleado(@Validated @RequestBody EmpleadosClass empleado){
        return empleadosDAO.save(empleado);
    }
}
