package dev.josemii.api_rest_ejemplo.Modelo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="empleados")
public class EmpleadosClass implements Serializable {
    @Id
    private int empNo;
    private String nombre;
    private String apellido;
    private String oficio;
    private Date fechaAlt;
    private Double salario;
    private int deptNo;
    @ManyToOne
    @JoinColumn(name="dept_no", nullable = false)
    private DepartamentosClass departamentosByDeptNo;
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFechaAlt() {
        return fechaAlt;
    }

    public void setFechaAlt(Date fechaAlt) {
        this.fechaAlt = fechaAlt;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpleadosClass that = (EmpleadosClass) o;

        if (empNo != that.empNo) return false;
        if (deptNo != that.deptNo) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (oficio != null ? !oficio.equals(that.oficio) : that.oficio != null) return false;
        if (fechaAlt != null ? !fechaAlt.equals(that.fechaAlt) : that.fechaAlt != null) return false;
        if (salario != null ? !salario.equals(that.salario) : that.salario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (oficio != null ? oficio.hashCode() : 0);
        result = 31 * result + (fechaAlt != null ? fechaAlt.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + deptNo;
        return result;
    }

    public DepartamentosClass getDepartamentosByDeptNo() {
        return departamentosByDeptNo;
    }

    public void setDepartamentosByDeptNo(DepartamentosClass departamentosByDeptNo) {
        this.departamentosByDeptNo = departamentosByDeptNo;
    }

}
