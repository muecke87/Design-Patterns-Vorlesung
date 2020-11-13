package com.proxy.another;

import com.proxy.ProxyFileAccess;
import com.proxy.Role;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Access as admin");
        ProxyFileAccess adminAccess = new ProxyFileAccess(Role.ADMIN);
        adminAccess.openFile("secret.txt");

        System.out.println("Access as user");
        ProxyFileAccess access = new ProxyFileAccess(Role.USER);
        access.openFile("secret.txt");
        access.openFile("notASecret.txt");

//      Würde Zugriff erlauben wenn RealFileAccess im gleichen Package ist
//      RealFileAccess realFileAccess = new RealFileAccess();
//      realFileAccess.openFile("secret.txt");
    }
}

