package dev.borja.imc;

import dev.borja.imc.models.Imc;
import dev.borja.imc.models.Person;

public final class App {
    public static void main(String[] args) {

        Person Borja = new Person("Borja", 77.4f, 1.76f);
        System.out.println("Hola " + Borja.getName() +" Vamos a calcular el IMC que tienes :)");

        Imc calculateIMC = new Imc();

            String resultBorja = calculateIMC.calculateIMC(Borja);

        System.out.println("Tienes un IMC de " + resultBorja);


    }
}
