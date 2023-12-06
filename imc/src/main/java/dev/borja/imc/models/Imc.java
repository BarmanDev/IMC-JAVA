package dev.borja.imc.models;

public class Imc {

    public String calculateIMC(Person person){

        double imc = person.getWight() / Math.pow(person.getHeight(), 2);

        if (imc < 16) return "Delgadez severa";
        if (imc < 17) return "Delgadez moderada";
        if (imc < 18.5) return "Delgadez leve";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidad leve";
        if (imc < 40) return "Obesidad moderada";
        return "Obesidad mórbida";

    }


}

