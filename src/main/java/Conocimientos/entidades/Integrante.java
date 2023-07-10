
package Conocimientos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Integrante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String nombre;
    
    private String apellido;
    
    private Integer java;
    
    private Integer git;
    
    private Integer docker;
    
    private Integer baseDatos;

    public Integrante() {
    }

    public Integrante(String nombre, String apellido, Integer java, Integer git, Integer docker, Integer baseDatos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.java = java;
        this.git = git;
        this.docker = docker;
        this.baseDatos = baseDatos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getJava() {
        return java;
    }

    public void setJava(Integer java) {
        this.java = java;
    }

    public Integer getGit() {
        return git;
    }

    public void setGit(Integer git) {
        this.git = git;
    }

    public Integer getDocker() {
        return docker;
    }

    public void setDocker(Integer docker) {
        this.docker = docker;
    }

    public Integer getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(Integer baseDatos) {
        this.baseDatos = baseDatos;
    }

    
}
