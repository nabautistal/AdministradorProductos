/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
//Clase Padre
public class Producto {
    //Atributos
    private int id;
    private String nombre;
    private double precio;
    
    //Constructor para inicializar el objeto sin parametros
    //Constructor por defecto
    public Producto() {
    }
    //Constructor con parametros
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Getters & setters
    //Metodo para Obtener el id del producto, devuelve un entero
    public int getId() {
        return id;
    }

    //Metodo para establecer id del producto
    public void setId(int id) {
        this.id = id;
    }

    //Metodo para Obtener el nombre del producto devuelve una String
    public String getNombre() {
        return nombre;
    }

    //Metodo para establecer el Nombre del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo para obtener el precio del producto,  devuelve un double
    public double getPrecio() {
        return precio;
    }

    //Metodo para establecer el precio del producto
    public void setPrecio(double precio) {
        //Validar que el precio que se va a establecer no sea negativo
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        }
        //se ejecuta si el precio no es negativo
        else {
            this.precio = precio;
        }
    }
    //Metodo para obtener el descuento donde al precio lo multiplica por 10%,  devuelve un double
    public double getDescuento(){
        return precio * 0.1d;
    }

    //Sobreescribe el metodo toString para imprimir los valores del producto,  devuelve una String
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}
