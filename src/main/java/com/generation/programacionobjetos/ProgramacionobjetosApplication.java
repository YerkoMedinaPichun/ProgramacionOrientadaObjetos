package com.generation.programacionobjetos;


import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.programacionobjetos.models.Perro;



@SpringBootApplication
public class ProgramacionobjetosApplication {


  public static void perros(){
    Scanner sc = new Scanner(System.in);

    System.out.println("- - - - - Ingreso de Perros - - - - -");

    System.out.println("Ingrese la cantidad de perros que quiere ingresar.");
    int cantidadPerros = sc.nextInt();
    ArrayList<Perro> misPerros = new ArrayList<Perro>();

    for(int i = 0; i < cantidadPerros; i++){
      sc.nextLine();//reseteamos la caché
      System.out.println("---------------------------------------------");
      Perro perro = new Perro();
      System.out.print("Ingrese la raza del perro: ");
      perro.setRaza(sc.nextLine());

      System.out.print("Ingrese el color del perro: ");
      perro.setColor(sc.nextLine());

      //sc.nextLine();//reseteamos la caché
      System.out.print("Ingrese el tamaño del perro: ");
      perro.setTamano(sc.nextDouble());

      sc.nextLine();//reseteamos la caché
      System.out.print("Ingrese el tipo de pelaje: ");
      perro.setPelaje(sc.nextLine());

      System.out.print("Ingrese el sexo del perro (M = Macho o H = Hembra): ");
      perro.setSexo(sc.nextLine().charAt(0));

      //sc.nextLine();
      System.out.print("Ingrese el numero de chip del perro: ");
      perro.setNumeroChip(sc.nextInt());

      System.out.println("---------------------------------------------");
      misPerros.add(perro);
    }

    System.out.println(misPerros.toString());
    

  }


	public static void main(String[] args) {

    perros();
    // //Crea un objeto Perro
    // Perro perroDefault = new Perro();

    // //Crear un Perro con todos los atributos
    // Perro perroCompleto = new Perro("Salchicha","Café",40.5,"Pelo duro",'F',12345678);

    // System.out.println(perroDefault.toString());

    // System.out.println(perroCompleto.toString());

    // perroDefault.setRaza("Quiltro");
    // perroDefault.setColor("negro");
    // System.out.println(perroDefault.toString());

    // ArrayList<Perro> misPerros = new ArrayList<Perro>();

    // misPerros.add(perroDefault);
    // misPerros.add(perroCompleto);

    // System.out.println("Desde aquí el Array :D");
    // System.out.println(misPerros);

    


    

	}

}
