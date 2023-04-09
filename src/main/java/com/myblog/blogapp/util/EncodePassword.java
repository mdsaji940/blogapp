package com.myblog.blogapp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
// Here we can check how password encoder work
public class EncodePassword {

    public static void main(String[] args) {
        PasswordEncoder encodePassword = new BCryptPasswordEncoder();
        System.out.println(encodePassword.encode("admin"));

        // it will print encrypted password in 16 digits
    }
}
