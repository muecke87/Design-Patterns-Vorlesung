package com.factory_method;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Exit</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Exit Application'");
    }
}
