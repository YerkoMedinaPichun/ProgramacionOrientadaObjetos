package com.generation.programacionobjetos.models;

public class Celular {
  
  public String marca;
  public Double tamanio;
  public String color;
  public Integer cantidadCamaras;
  public String tipoPantalla;

  /* - - - - - Constructores - - - - - */

  public Celular() {
  }

  public Celular(String marca, Double tamanio, String color, Integer cantidadCamaras, String tipoPantalla) {
    this.marca = marca;
    this.tamanio = tamanio;
    this.color = color;
    this.cantidadCamaras = cantidadCamaras;
    this.tipoPantalla = tipoPantalla;
  }
  
  

  /* - - - - - Getters And Setters - - - - - */

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Double getTamanio() {
    return tamanio;
  }

  public void setTamanio(Double tamanio) {
    this.tamanio = tamanio;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Integer getCantidadCamaras() {
    return cantidadCamaras;
  }

  public void setCantidadCamaras(Integer cantidadCamaras) {
    this.cantidadCamaras = cantidadCamaras;
  }

  public String getTipoPantalla() {
    return tipoPantalla;
  }

  public void setTipoPantalla(String tipoPantalla) {
    this.tipoPantalla = tipoPantalla;
  }
  

  /* - - - - - Métodos - - - - - */

  public String contestar(boolean llamando, String contacto){
    if(llamando == true){
      return "Contestando a "+contacto;
    }else{
      return "Cortando a "+contacto;
    }

  }

  public boolean encender(boolean encendido){
    if(encendido == true){
      return true;
    }else{
      return false;
    }
  }




}
