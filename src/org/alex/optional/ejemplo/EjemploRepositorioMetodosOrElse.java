package org.alex.optional.ejemplo;

import org.alex.optional.ejemplo.Repositorio.ComputadorRepositorio;
import org.alex.optional.ejemplo.Repositorio.Repositorio;
import org.alex.optional.ejemplo.model.Computador;

public class EjemploRepositorioMetodosOrElse {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

       //Computador defecto = new Computador("Hp Omen", "LA0001");
        Computador pc = repositorio.filtrar("Asus").orElse(valorDefecto()); // siempre va invocar lo que se le mande por parámetro
        System.out.println(pc);

        pc = repositorio.filtrar("macbook").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto");
        return new Computador("Hp Omen", "LA0001");
    }
}
