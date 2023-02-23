package com.generation.programacionobjetos.models;

public class RelojDigital {

  /* - - - - - Atributos - - - - - */
  public String color;
  public String forma;
  public String diseno;
  public String marca;
  public String material;

  /* - - - - - Constructores - - - - - */
  
  public RelojDigital() {
  }

  

  public RelojDigital(String color, String forma, String diseno, String marca, String material) {
    this.color = color;
    this.forma = forma;
    this.diseno = diseno;
    this.marca = marca;
    this.material = material;
  }

  /* - - - - - Getters And Setters - - - - - */

  public String getColor() {
    return color;
  }



  public void setColor(String color) {
    this.color = color;
  }



  public String getForma() {
    return forma;
  }



  public void setForma(String forma) {
    this.forma = forma;
  }



  public String getDiseno() {
    return diseno;
  }



  public void setDiseno(String diseno) {
    this.diseno = diseno;
  }



  public String getMarca() {
    return marca;
  }



  public void setMarca(String marca) {
    this.marca = marca;
  }



  public String getMaterial() {
    return material;
  }



  public void setMaterial(String material) {
    this.material = material;
  }


  /* - - - - - Métodos - - - - - */
  public String darHora(String hora){
    return "La hora es "+hora;
  }

  public String cronometrar(String tiempo){
    return "El tiempo cronometrado es de "+tiempo;
  }



  
}
