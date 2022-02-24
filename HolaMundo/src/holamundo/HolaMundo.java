package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

public class HolaMundo {

    public static void main(String[] args) {
        /*
COLOCO ESTOS COMO COMENTARIOS PARA QUE A LA HORA DE CORRER EL PROGRAMA SOLO 
SALGAN UNICAMENTE LOS DATOS TRABAJADOS DE LA CLASE PASADA
        System.out.println("Hola mundo java!!!!!");

        Persona per1 = new Persona();
        per1.setNombre("Pablo LC ");
        System.out.println("Nombre:" + per1.getNombre());
        per1.comer(" hamburguesa hawaiana!!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe ");
        per2.comer(" pizza Hawaiana");
        System.out.println("Nombre per 2:" + per2.getNombre());
         */
        System.out.println("CARRO NUMERO 1: ");
        System.out.println("              ");
        Automovil bocho = new Automovil();
        System.out.println("Tipo de carro: Bocho");
        bocho.setMarca("VW");
        System.out.println("Marca: " + bocho.getMarca());
        bocho.setSubMarca("Sedan");
        bocho.setModelo(1970);
        System.out.println("El modelo del auto es del año: " + bocho.getModelo());
        System.out.println("La submarca de este carro es: " + bocho.getSubMarca());
        bocho.setColor(Color.blue);
        System.out.println("El color del bocho es: " + bocho.getColor());

        System.out.println("              ");
        System.out.println("CARRO NUMERO 2: ");
        System.out.println("              ");

        Automovil akura = new Automovil();
        System.out.println("Tipo de carro: Akura");
        akura.setMarca("AKURA");
        System.out.println("Marca: " + akura.getMarca());
        akura.setSubMarca("NSX");
        akura.setModelo(2013);
        System.out.println("El modelo del auto es del año: " + akura.getModelo());
        System.out.println("La submarca de este carro es: " + akura.getSubMarca());
        akura.setColor(Color.gray);
        System.out.println("El color del Akura es: " + akura.getColor());

        System.out.println("               ");
        System.out.println("CARRO NUMERO 3: ");
        System.out.println("              ");

        Automovil ford = new Automovil();
        System.out.println("Tipo de carro: Ford");
        ford.setMarca("Ford");
        System.out.println("Marca: " + ford.getMarca());
        ford.setSubMarca("Munstang");
        ford.setModelo(2010);
        System.out.println("El modelo del auto es del año: " + ford.getModelo());
        System.out.println("La submarca de este carro es: " + ford.getSubMarca());
        ford.setColor(Color.yellow);
        System.out.println("El color del Ford es: " + ford.getColor());

    }

}
