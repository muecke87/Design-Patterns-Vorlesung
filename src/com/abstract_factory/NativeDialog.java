package com.abstract_factory;

// ConcreteFactory
public class NativeDialog extends Dialog {

    @Override
    public Button createButton() {
        return new NativeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new NativeCheckbox();
    }
}
