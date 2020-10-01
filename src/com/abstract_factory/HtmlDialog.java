package com.abstract_factory;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new HtmlCheckbox();
    }
}
