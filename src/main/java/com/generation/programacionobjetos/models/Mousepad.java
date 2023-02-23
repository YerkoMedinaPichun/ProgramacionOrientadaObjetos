package com.generation.programacionobjetos.models;

public class Mousepad {
  
  public String material;
  public String color;
  public Double grosor;
  public String tipoAntideslizante;
  public Boolean luces;
  public String tamano;

    /* - - - - - Constructores - - - - - */

  public Mousepad() {
  }

  public Mousepad(String material, String color, Double grosor, String tipoAntideslizante, Boolean luces,
      String tamano) {
    this.material = material;
    this.color = color;
    this.grosor = grosor;
    this.tipoAntideslizante = tipoAntideslizante;
    this.luces = luces;
    this.tamano = tamano;
  }

    /* - - - - - Getters and Setters - - - - - */

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getGrosor() {
    return grosor;
  }

  public void setGrosor(Double grosor) {
    this.grosor = grosor;
  }

  public String getTipoAntideslizante() {
    return tipoAntideslizante;
  }

  public void setTipoAntideslizante(String tipoAntideslizante) {
    this.tipoAntideslizante = tipoAntideslizante;
  }

  public Boolean getLuces() {
    return luces;
  }

  public void setLuces(Boolean luces) {
    this.luces = luces;
  }

  public String getTamano() {
    return tamano;
  }

  public void setTamano(String tamano) {
    this.tamano = tamano;
  }

  /* - - - - - Métodos - - - - - */

  public String tamanioMousepad(){


    if(this.tamano.equals("grande")){
      return "El tamaño es "+this.tamano+" y sirve para todo el escritorio";

    }else if(this.tamano.equals("mediano")){
      return "El tamaño es "+this.tamano+" y sirve para el teclado y mouse";

    }else if(this.tamano.equals("pequeño")){
      return "El tamaño es "+this.tamano+" y solo sirve para el mouse";

    }else{
      return "El tamaño no es correcto";
    }

  }



}
