package com.factory_method;

public class NativeDialog extends Dialog {

    @Override
    public Button createButton() {
        return new NativeButton();
    }
}
