package org.ies.highschool.model;

import java.util.Objects;

public class Student {
    private String nombre;
    private String apellidos;
    private String direccion;

    public Student(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
    public void showInfo () {
        System.out.println("hola" +nombre+apellidos+ "tu direccion es" +direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student campos = (Student) o;
        return Objects.equals(nombre, campos.nombre) && Objects.equals(apellidos, campos.apellidos) && Objects.equals(direccion, campos.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, direccion);
    }

    @Override
    public String toString() {
        return "Campos{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
