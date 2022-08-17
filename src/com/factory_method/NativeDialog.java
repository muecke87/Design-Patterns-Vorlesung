package com.factory_method;

// Concrete Creator
public class NativeDialog extends Dialog {

    @Override
    public Button createButton() {
        return new NativeButton();
    }
}
