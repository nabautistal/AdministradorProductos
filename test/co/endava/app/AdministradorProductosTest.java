package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Assertions
// Static para evitar la referencia a Assertions.assertEquals
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    //Tag de test de Junit
    @Test
    void main() {
        String nombre;
        nombre = "Café";
        Producto p1 = new Producto(101, "Café", 1500);

        assertEquals(nombre, p1.getNombre());

    }

    @Test
    void descuentoProducto() {
        double descuento =150;
        Producto p1 = new Producto(101, "Café", 1500);

        assertEquals(descuento, p1.getDescuento());

    }


    @Test
    void descuentoBebida() {
        //Entre las 5pm y las 6pm
        double descuento;

        LocalTime now = LocalTime.now();

        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            descuento = 400;

        } else {
            descuento = 0;
        }


        Bebida b1 = new Bebida(102, "Te",2000);

        assertEquals(descuento, b1.getDescuento());

    }

    @Test
    void descuentoComidaVencidaHoy() {
        double descuento = 200;
        LocalDate fechaVencimiento = LocalDate.of(2022,4,30);

        //Comida c1 = new Comida(103, "Sanduche", 2000, LocalDate.now().plusDays(2));
        Comida c1 = new Comida(103, "Sanduche", 2000, LocalDate.now());

        assertEquals(descuento, c1.getDescuento());

    }

    @Test
    void descuentoComidaNoVencida() {
        double descuento = 0;
        LocalDate fechaVencimiento = LocalDate.of(2022,4,30);

        Comida c1 = new Comida(104, "Empanada", 2000, fechaVencimiento);

        assertEquals(descuento, c1.getDescuento());

    }
}