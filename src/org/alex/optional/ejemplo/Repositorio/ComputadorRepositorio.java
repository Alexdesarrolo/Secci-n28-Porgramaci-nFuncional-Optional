package org.alex.optional.ejemplo.Repositorio;

import org.alex.optional.ejemplo.model.Computador;
import org.alex.optional.ejemplo.model.Fabricante;
import org.alex.optional.ejemplo.model.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc= new Procesador("I9-988H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computador("MacBook Pro", "MVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
//        for(Computador c: dataSource ){
//            if(c.getNombre().equalsIgnoreCase(nombre)){
//                return Optional.of(c);
//            }
//        }
//        return Optional.empty();

        return dataSource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase())).findFirst();
    }
}
