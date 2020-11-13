package com.proxy;

public class File {
    private String name;
    private Role access;
    private String text;

    public File(String name, Role access, String text) {
        this.name = name;
        this.access = access;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public Role getAccess() {
        return access;
    }

    public String getText() {
        return text;
    }
}
