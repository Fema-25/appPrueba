/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conocimientos.builders;

import Conocimientos.entidades.Integrante;

/**
 *
 * @author franc
 */
public interface IntegrantesInterface {
    IntegrantesInterface setNombre(String nombre);
    IntegrantesInterface setApellido(String Apellido);
    IntegrantesInterface setJava(Integer java);
    IntegrantesInterface setGit(Integer git);
    IntegrantesInterface setDocker(Integer docker);
    IntegrantesInterface setBaseDatos(Integer baseDatos);
    Integrante build();
    
}
