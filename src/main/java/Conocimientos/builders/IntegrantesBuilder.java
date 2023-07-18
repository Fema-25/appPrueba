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
public class IntegrantesBuilder implements IntegrantesInterface{
    private final  Integrante integrante;

    public IntegrantesBuilder(Integrante integrante) {
        this.integrante = integrante;
        if(this.integrante.getNombre() == null){
            this.integrante.setNombre("Anonimo");
        }
        if(this.integrante.getApellido() == null){
            this.integrante.setApellido("Anonimo");
        }
        if(this.integrante.getDocker() == null){
            this.integrante.setDocker(0);
        }
        if(this.integrante.getGit() == null){
            this.integrante.setGit(0);
        }
        if(this.integrante.getBaseDatos() == null){
            this.integrante.setBaseDatos(0);
        }
        if(this.integrante.getJava() == null){
            this.integrante.setJava(0);
        }
      
        
        
        
    }
    
    public IntegrantesBuilder(){
        this.integrante = new Integrante();
    }
    
    

    @Override
    public IntegrantesInterface setNombre(String nombre) {
        integrante.setNombre(nombre);
        return this;
    }

    @Override
    public IntegrantesInterface setApellido(String Apellido) {
        integrante.setApellido(Apellido);
        return this;
    }

    @Override
    public IntegrantesInterface setJava(Integer java) {
        integrante.setJava(java);
        return this;
    }

    @Override
    public IntegrantesInterface setGit(Integer git) {
        integrante.setGit(git);
        return this;
    }

    @Override
    public IntegrantesInterface setDocker(Integer docker) {
        integrante.setDocker(docker);
        return this;
    }

    @Override
    public IntegrantesInterface setBaseDatos(Integer baseDatos) {
        integrante.setBaseDatos(baseDatos);
        return this;
    }
    
    @Override
    public Integrante build(){
        return this.integrante;
    }
    
}
