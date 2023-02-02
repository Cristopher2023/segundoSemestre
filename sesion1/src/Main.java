import com.cris.clases.Persona;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


            Persona per = new Persona("CRIS", "tiene sobrepeso se recomienda hacer ejercicio", 65, 1.60);
            System.out.println(per.toString());
            //if(per.getImc() > 20){
             //   Persona per1 = new Persona("CRIS", "tiene sobrepeso se recomienda hacer ejercicio", 62, 1.60);
             //   System.out.println(per1.toString());

           // }else{
            //    Persona per2 = new Persona("CRIS", "su salud es buena", 62, 1.60);
             //   System.out.println(per2.toString());
           // }


        calcularIMC();



    }

    public static void calcularIMC(){




    }
}