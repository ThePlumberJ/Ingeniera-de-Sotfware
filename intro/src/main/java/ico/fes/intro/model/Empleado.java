package ico.fes.intro.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Empleado {
    private int id;
    private String nombre;
    private double sueldo;
    private String departamento;
    private String fechaNacimiento;
}

