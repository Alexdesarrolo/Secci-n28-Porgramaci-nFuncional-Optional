package org.alex.optional.ejemplo;

import org.alex.optional.ejemplo.Repositorio.ComputadorRepositorio;
import org.alex.optional.ejemplo.Repositorio.Repositorio;
import org.alex.optional.ejemplo.model.Computador;
import org.alex.optional.ejemplo.model.Fabricante;

public class EjemploRepositorioMapFilter {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(c -> c.getProcesador())
                        .flatMap(p -> p.getFabricante())
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(nom -> nom.getNombre())
                .orElse("Desconocido");

        System.out.println(f);
    }

}
