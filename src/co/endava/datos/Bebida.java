/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
//Clase hija de Producto
public class Bebida extends Producto {
    //Constructor
    public Bebida(int id, String nombre, double precio){
        //Llama al constructor de la clase padre: Producto
        super(id, nombre, precio);
    }

    //Sobreescribe el metodo get descuento de la clase padre producto,  devuelve un double
    @Override
    public double getDescuento() {
        //Inicializa y asigna el valor a la variable now
        LocalTime now = LocalTime.now();
        //Valida si la hora local esta entre las 5pm y las 6pm sin incluir los limites
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            //Multiplica el precio por el 20% para obtener el descuento
            return this.getPrecio() * 0.2d;
        } else {
            //Si no se cumple la condicion el descuento sera igual a 0
            return 0;
        }
    }
}
