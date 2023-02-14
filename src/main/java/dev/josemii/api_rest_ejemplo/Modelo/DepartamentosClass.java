package dev.josemii.api_rest_ejemplo.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="departamentos")
public class DepartamentosClass implements Serializable {
    @Id
    private int deptNo;
    private String dnombre;
    private String loc;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartamentosClass that = (DepartamentosClass) o;

        if (deptNo != that.deptNo) return false;
        if (dnombre != null ? !dnombre.equals(that.dnombre) : that.dnombre != null) return false;
        if (loc != null ? !loc.equals(that.loc) : that.loc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptNo;
        result = 31 * result + (dnombre != null ? dnombre.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }
}
