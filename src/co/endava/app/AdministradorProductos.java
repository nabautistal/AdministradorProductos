/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    //Main
    public static void main(String[] args) {
        //Crear instancias de la clase producto: p1, p2
        Producto p1 = new Producto(101, "Café", 1500);
        Producto p2 = new Producto(102, "Azucar", 2500);

        //Crea una instacia de la clase comida
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));

        //Upcasting
        Producto p4 = new Bebida(104, "Té", 1800);

        //Imprime el precio del producto p1: 1500
        System.out.println(p1.getPrecio());

        //Imprime el precio del producto p2: 2500
        System.out.println(p2.getPrecio());

        //Imprime: Fecha:[fecha de vencimiento], Precio:[precio], Dcto:[descuento] de p3
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento());

        //Imprime: Precio:[precio], Dcto:[descuento] de p4
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento());
        //Inicializa el producto - p5
        Producto p5 = new Producto(105, "Agua", 1800);
        //Valida si el producto es nulo
        if (p5 == null) {
            System.out.println("El objeto está nulo");
        }
        //Se ejecuta cuando el producto p5 no es nulo
        else {
            //Valida si el nombre del producto es nulo
            if (p5.getNombre() == null) {
                System.out.println("El nombre está nulo");
            }
            //Imprime el nombre del producto p5 cuando este no es nulo
            else {
                System.out.println(p5.getNombre());
            }
        }

        //Inicializar la variable numero como BigDecimal(mejor precision)
        BigDecimal numero = BigDecimal.ZERO;
        //Intente: Asigne el valor a la variable numero
        try {
            //BigDecimal.valueof recibe Long(Entero con signo) o Double(flotante)
            //parseLong pasa la string a Long
            numero = BigDecimal.valueOf(Long.parseLong("140"));

        }
        //En caso de encontrar error en el bloque anterior manejarlo de la siguiente forma
        catch (Exception e){
            //Asignar a la variable numero el valor de 1(BigDecimal)
            numero = BigDecimal.ONE;
            //Imprimir:  No se pudo convertir + [descripcion del error]
            System.out.println("No se pudo convertir " + e);
        }
        //Imprime el valor de la variable numero
        System.out.println(numero);
    }
    
}
