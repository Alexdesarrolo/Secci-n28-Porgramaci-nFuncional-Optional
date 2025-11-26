package org.alex.optional.ejemplo;

import org.alex.optional.ejemplo.Repositorio.ComputadorRepositorio;
import org.alex.optional.ejemplo.Repositorio.Repositorio;
import org.alex.optional.ejemplo.model.Computador;

import java.util.Optional;

public class EjemploRepositorio {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

//        Optional<Computador> pc = repositorio.filtrar("asus rog");
//
//        if(pc.isPresent()){
//            System.out.println(pc.get().getNombre());
//        }else {
//            System.out.println("No se encontró");
//        }

        repositorio.filtrar("rogo").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

    }
}
