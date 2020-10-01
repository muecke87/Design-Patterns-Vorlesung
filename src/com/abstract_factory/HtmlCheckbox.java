package com.abstract_factory;

public class HtmlCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("<input type=\"checkbox\">");
        onCheck();
    }

    @Override
    public void onCheck() {
        System.out.println("Yeah I was checked");
    }
}
