package com.proxy;

import java.util.Map;

class RealFileAccess implements FileAccess{
    private File file1 = new File("secret.txt", Role.ADMIN, "codes to nukes: 123");
    private File file2 = new File("notASecret.txt", Role.USER, "pie recipe");

    private final Map<String, File> files = Map.of(
            file1.getName(), file1,
            file2.getName(), file2
    );

    public Role getFileAccess(String fileName) {
        return files.get(fileName).getAccess();
    }

    @Override
    public void openFile(String fileName) {
        var file = files.get(fileName);
        System.out.println("Reading " + file.getName() + ": " + file.getText());
    }
}
