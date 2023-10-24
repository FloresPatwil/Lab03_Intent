package com.cdp.lab03_intent;

import java.io.Serializable;
import java.util.List;
public class Postulante implements Serializable {
    private String dni;
    private String apellidoMaterno;
    private String nombres;
    private String fechaNacimiento;
    private String colegio;
    private String carrera;
    public Postulante(String dni,String apellidoMaterno,String nombres, String fechaNacimiento, String colegio,String carrera){
        this.dni=dni;
        this.apellidoMaterno=apellidoMaterno;
        this.nombres=nombres;
        this.fechaNacimiento=fechaNacimiento;
        this.colegio=colegio;
        this.carrera=carrera;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    public String getCarrera() {
        return carrera;
    }
}
