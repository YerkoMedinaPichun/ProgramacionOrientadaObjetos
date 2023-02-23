package com.generation.programacionobjetos.models;

public class Perro {

  //Cuando creamos atributos de objetos, podemos determinar si el atributo es privado o público, todo esto depende de la sensibilidad de los datos

  //public String raza;
  //private String raza;

  public String raza;
  public String color;
  public Double tamano;
  public String pelaje;
  public char sexo;
  private Integer numeroChip;

  //Constructor por defecto, este tipo de constructor debe si o si ir en todas las clases
  public Perro(){

  }

  //Este también debe ir en todas las clases que crearemos
  public Perro(String raza, String color, Double tamano, String pelaje, char sexo, Integer numeroChip) {
    this.raza = raza;
    this.color = color;
    this.tamano = tamano;
    this.pelaje = pelaje;
    this.sexo = sexo;
    this.numeroChip = numeroChip;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getTamano() {
    return tamano;
  }

  public void setTamano(Double tamano) {
    this.tamano = tamano;
  }

  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public Integer getNumeroChip() {
    return numeroChip;
  }

  public void setNumeroChip(Integer numeroChip) {
    this.numeroChip = numeroChip;
  }

  public void ladrar(){
    System.out.println("Guau!!");
  }

  public String romperCosas(boolean meRetaron){

    if(meRetaron == true){
      return "Destrozo";
    }else{
      return "No destrozo";
    }

    // if(meRetaron){
    //   return "Destrozo";
    // }
    // return "No destrozo";

  }

  public String cavar(){
    return "El perro cavó un hoyo en el patio";
  }

  @Override
  public String toString() {
    return "Perro [raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", pelaje=" + pelaje + ", sexo=" + sexo
        + ", numeroChip=" + numeroChip + "]";
  }

  


}
