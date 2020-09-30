package com.factory_method;

public class Demo {
    private static Dialog dialog = new Dialog();
    private static String type;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            type = "NATIVE";
        } else {
            type = "HTML";
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow(type);
    }
}
