/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestComputadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Carlos GarMon
 */
public class TestComputadora {

    public static void main(String[] args) {
        Computadora pc1 = new Computadora("Alienware", "Aurora R10", new CPU("AMD", "Ryzen 7 3700X", 4),
                new Monitor("Gigabyte", "G27FC LED", 27), new Mouse("MSI", "Pmw - 3330", "Optical Sensor"),
                new Teclado("HyperX", "Alloy Core RGB", 104, 10));

        pc1.encenderComputadora();
        System.out.println("-----------------------------\nINFORMACION DE LA COMPUTADORA \n-----------------------------");
        System.out.println(pc1.getMarca() + "\n" + pc1.getModelo());

        System.out.println("\n" + pc1.getCpu());
        System.out.println("\n" + pc1.getMonitor());
        System.out.println("\n" + pc1.getTeclado());
        System.out.println("\n" + pc1.getMouse());
        System.out.println("\n---------------------------");
        pc1.apagarComputadora();
    }
}
