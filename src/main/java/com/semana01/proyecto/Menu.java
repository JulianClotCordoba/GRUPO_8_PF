package com.semana01.proyecto;

import javax.swing.JOptionPane;

public class Menu {

    int opcionMenu, opcionSubMenu;

    String nombreCliente, marcaCliente, colorCliente, paqueteCliente, horaRegistrada, placaCliente;

    public void preguntarMenu() {

        do {

            String menu = """
                     1) Recepción de vehículos
                     2) Inicio de atención
                     3) Etapa de vehículos
                     4) Retiro de vehículos
                     5) Módulo de reportes
                     6) Salir \n
                     """;

            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcionMenu) {
                case 1:
                    Vehiculo carro1 = new Vehiculo();
                    carro1.pedirDatos();
                    carro1.mostrarDatos();

                    break;
                case 2:
                    System.out.println("2) Inicio de atencion");
                    break;
                case 3:
                    System.out.println("3) Etapa de vehiculos");
                    break;
                case 4:
                    System.out.println("4) Retiro del vehiculo");
                    break;
                case 5:
                    do {
                        String subMenu = """
                                1) Reporte de ingresos
                                2) Reporte de egresos
                                3) Volver al menú principal \n
                                """;

                        opcionSubMenu = Integer.parseInt(JOptionPane.showInputDialog(subMenu));

                        switch (opcionSubMenu) {
                            case 1:
                                System.out.println("1) Reporte de los vehiculos por zona");
                                break;
                            case 2:
                                System.out.println("2) Reporte visual de los vehiculos en zonas");
                                break;
                            case 3:
                                System.out.println("3) Reporte de resumen de facturas");
                                break;
                            case 4:
                                System.out.println("Volviendo al menu principal.");
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida. Intentelo de nuevo.");
                                break;
                        }
                    } while (opcionSubMenu != 3);
                    break;
                case 6:
                    System.out.println("6) Salir");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Intentelo de nuevo.");
                    break;
            }
        } while (opcionMenu != 6);
    }

    @Override
    public String toString() {
        return "\n nombreCliente='" + nombreCliente + '\''
                + "\n marcaCliente='" + marcaCliente + '\''
                + "\n colorCliente='" + colorCliente + '\''
                + "\n paqueteCliente='" + paqueteCliente + '\''
                + "\n horaRegistrada='" + horaRegistrada + '\''
                + "\n placaCliente=" + placaCliente;
    }

}
