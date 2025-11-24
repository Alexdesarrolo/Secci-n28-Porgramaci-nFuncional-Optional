package org.alex.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {

        String nombre = "Alex";
        Optional<String> opt = Optional.of(nombre);

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }
        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> {
            System.out.println("hola " + valor);
        });

        nombre = "Jhon";

        opt = Optional.ofNullable(nombre); // acepta valores nulos

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse( valor -> System.out.println("holaa " + valor),
                () -> {
            System.out.println("No está presente");
        });

        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }else {
            System.out.println("No está presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());

    }
}
