package com.myconstruction;

public class LoginService {

    public boolean validarLogin(String usuario, String password) {
        return usuario.equals("admin") && password.equals("1234");
    }
}