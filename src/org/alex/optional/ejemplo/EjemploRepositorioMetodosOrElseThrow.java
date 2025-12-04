package org.alex.optional.ejemplo;

import org.alex.optional.ejemplo.Repositorio.ComputadorRepositorio;
import org.alex.optional.ejemplo.Repositorio.Repositorio;
import org.alex.optional.ejemplo.model.Computador;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("Asus").orElseThrow(
                IllegalArgumentException::new
        );
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println("extension = " + extension);

        String c = "holla.cco";
        System.out.println(c.substring(c.lastIndexOf('.')+1));

    }
}
