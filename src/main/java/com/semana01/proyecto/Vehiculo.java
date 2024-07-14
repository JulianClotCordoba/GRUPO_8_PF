package com.semana01.proyecto;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Vehiculo {

    // ---------- Atributos ----------
    String nombreCliente;
    String placa;
    String marca;
    String color;
    String paquete;

    LocalDate fechaRecibido;

    // ---------- Metodos ----------
    // Pedir datos
    public void pedirDatos() {
        JOptionPane.showMessageDialog(null,
                "A continuacion necesitamos algunos datos sobre usted (Nombre, placa, marca, color y paquete)");
        nombreCliente = JOptionPane.showInputDialog("Cual es el nombre del cliente?");
        placa = JOptionPane.showInputDialog("Cual es la placa del automovil?");
        marca = JOptionPane.showInputDialog("Cual es la marca del vehiculo? ");
        color = JOptionPane.showInputDialog("Cual es el color del automovil? ");
        paquete = JOptionPane.showInputDialog("Cual paquete desea contratar? (Basico, Regular, Premium)");
        fechaRecibido = LocalDate.now();
    }

    // Mostrar datos
    public void mostrarDatos() {
        String texto = "Nombre cliente: " + nombreCliente + "\n"
                + "Placa: " + placa + "\n"
                + "Marca: " + marca + "\n"
                + "Color: " + color + "\n"
                + "Paquete: " + paquete + "\n"
                + "Fecha recibido: " + fechaRecibido;

        JOptionPane.showMessageDialog(null, texto);
    }
}
