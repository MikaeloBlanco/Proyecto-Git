package com.adolfo.miguel.Proyectoparking.user;
public class user {


    //private long id;
    private String apellido1;
    private String nombre;
    private String apellido2;
    private String rol;
    
    public user(){

        this("","","","");

    }

    public user(String apellido1, String apellido2, String nombre, String rol){
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getApellido1(){
        return this.apellido1;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido2(){
        return this.apellido2;
    }

    public String getRol(){
        return this.rol;
    }

    
    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }

    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    } 

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setRol(String rol){
        this.rol = rol;
    }

}
