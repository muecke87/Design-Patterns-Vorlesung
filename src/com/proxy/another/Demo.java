package com.proxy.another;

import com.proxy.FileAccess;
import com.proxy.ProxyFileAccess;
import com.proxy.Role;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Access as admin");
        FileAccess access = new ProxyFileAccess(Role.ADMIN);
        access.openFile("secret.txt");

        System.out.println("Access as user");
        access = new ProxyFileAccess(Role.USER);
        access.openFile("secret.txt");
        access.openFile("notASecret.txt");

//      Würde Zugriff erlauben wenn RealFileAccess im gleichen Package ist
//      access = new RealFileAccess();
//      access.openFile("secret.txt");
    }
}

