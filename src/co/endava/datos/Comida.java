/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */

//Clase hija de Producto
public class Comida extends Producto {
    //Definicion atributos propios de la clase hija
    private LocalDate fechaVencimiento;

    //Constructor de la clase
    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        //Llama al constructor de la clase padre
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    //Getters & Setters
    //Metodo para obtener la fecha de vencimiento de la Comida,  devuelve un LocalDate
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    //Metodo para establecer la fecha de vencimiento de la Comida
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //Sobreescribe el Metodo para obtener el descuento donde al precio lo multiplica por 10% Si la fecha de vencimiento es igual a la fecha actual,  devuelve un double
    @Override
    public double getDescuento() {
        //Valida si la fecha de vencimiento es igual a la fecha actual
        if (fechaVencimiento.equals(LocalDate.now())) {
            return super.getDescuento();
        }
        //En caso de que la fecha de vencimiento sea diferente a la fecha actual el descuento sera igual a 0
        else {
            return 0;
        }
    }

    //Sobreescribe el metodo toString de la clase Padre Producto, para imprimir los valores de la comida,  devuelve una String
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}
