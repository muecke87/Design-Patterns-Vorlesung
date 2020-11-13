package com.proxy;

public class ProxyFileAccess implements FileAccess {
    private Role role;
    private RealFileAccess realFileAccess = new RealFileAccess();

    public ProxyFileAccess(Role role) {
        this.role = role;
    }

    @Override
    public void openFile(String fileName) {
        if (accessGranted(fileName)) {
            realFileAccess.openFile(fileName);
        } else {
            System.out.println("File " + fileName + " not found");
        }
    }

    private boolean accessGranted(String fileName) {
        return realFileAccess.getFileAccess(fileName).equals(role);
    }
}
