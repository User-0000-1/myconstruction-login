package com.myconstruction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginService loginService = new LoginService();

        System.out.println("=== LOGIN MY CONSTRUCTION ===");
        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        String password = scanner.nextLine();

        if (loginService.validarLogin(usuario, password)) {
            System.out.println("Acceso concedido. Bienvenido a My Construction.");
        } else {
            System.out.println("Acceso denegado. Credenciales incorrectas.");
        }

        scanner.close();
    }
}