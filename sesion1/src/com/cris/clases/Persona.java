package com.cris.clases;

public class Persona {
    String nombre,mensaje;
    float peso;
    double altura;
    double imc;

    public Persona(){}

    public Persona(String nombre, String mensaje, float peso, double altura ) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.peso = peso;
        this.altura = altura;

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {

        return mensaje;
    }

    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getImc() {

        return peso/(altura*altura);
    }

    public void setImc(double imc) {

        this.imc = imc;
    }


    public String toString() {
        return "Hola" + " " + getNombre() +"  "+  "su imc es de " +  getImc() +"  "+   getMensaje() + " peso:"+getPeso() + " "+ "altura:"+ getAltura();
    }
}
